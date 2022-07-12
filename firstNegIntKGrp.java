import java.util.*;
public class firstNegIntKGrp {
      public long[] printFirstNegativeInteger(long A[], int N, int k)
      {
          int si=0;
          int ei=0;
          int z=0;
          ArrayList<Integer> list=new ArrayList<Integer>();
          long[] ans=new long[N-k+1];
          while(ei<N){
            
              if(A[ei]<0){
                  list.add(ei);
              }
              if(ei-si+1<k){
                  ei++;
              }else if(ei-si+1==k){
                  if(list.size()==0){
                     ans[z++]=0; 
                  }else if(list.size()>0){
                      ans[z++]=A[list.get(0)];
                  }
                  si++;
                  ei++;
                    if(list.size()>0 && list.get(0)<si){
                  list.remove(list.get(0));
              }
              }
          }
          return ans;
      }
}
