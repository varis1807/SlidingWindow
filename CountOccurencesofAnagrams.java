import java.util.*;
public class CountOccurencesofAnagrams {
      
      int search(String pat, String txt) {
            // code here
            int ans = 0;
            
            HashMap<Character, Integer> map = new HashMap<>();
            int count = 0;
            for(char c : pat.toCharArray()){
                map.put(c, map.getOrDefault(c, 0)+1);
            }
            count = map.size();
            
            int k = pat.length(), size = txt.length(), i = 0, j = 0;
            while(j < size){
                
                // constant work
                char c = txt.charAt(j);
                if(map.containsKey(c)){
                    map.put(c, map.get(c)-1);
                    if(map.get(c) == 0) count--;
                }
                
                if(j < k-1) j++;
                else{ // once we hit the window size (j == k-1)
                    // cal ans
                    if(count == 0){
                        ans++;
                    }
                    
                    // slide the window (remove extra work)
                    char c2 = txt.charAt(i);
                    if(map.containsKey(c2)){
                        if(map.get(c2) == 0) count++;
                        map.put(c2, map.get(c2)+1);
                    }
                    i++;
                    j++;
                }
            }
            return ans;
        }
}
