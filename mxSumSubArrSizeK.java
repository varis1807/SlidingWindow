import java.util.*;

public class mxSumSubArrSizeK {

      public static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N) {
            // code here
            int si = 0, ei = 0;
            long maxSum = -(int) 1e9;
            long sum = 0;
            for(int i=0; i<K; i++){
                  sum+=Arr.get(i);
                  ei=i+1;
            }
            while (ei < N) {
                  
                   sum = (sum + Arr.get(ei)) - Arr.get(si);
                   maxSum = Math.max(maxSum, sum);
                   ei++;
                   si++;
            }
            System.out.print(maxSum);
            return maxSum;
      }

      public static void main(String[] args) {
            int N = 4, K = 2;
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(100);
            arr.add(200);
            arr.add(300);
            arr.add(400);
            maximumSumSubarray(K, arr, N);
      }
}