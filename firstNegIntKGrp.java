import java.util.*;
public class firstNegIntKGrp {
      public long[] printFirstNegativeInteger(long A[], int N, int k)
      {
          int i=0;
          int j=0;
          int z=0;
          ArrayList<Integer> list=new ArrayList<Integer>();
          long[] ans=new long[N-k+1];
          while(j<N){
            
              if(A[j]<0){
                  list.add(j);
              }
              if(j-i+1<k){
                  j++;
              }else if(j-i+1==k){
                  if(list.size()==0){
                     ans[z++]=0; 
                  }else if(list.size()>0){
                      ans[z++]=A[list.get(0)];
                  }
                  i++;
                  j++;
                    if(list.size()>0 && list.get(0)<i){
                  list.remove(list.get(0));
              }
              }
          }
          return ans;
      }
}
