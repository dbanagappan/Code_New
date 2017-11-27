import java.io.IOException;

public class LargeSubSet 
{
  public static void main(String args[]) throws IOException
  {
    int[] arr = {2,4};
    long[] res = maxSubsetSum(arr);
    for(long x : res){
      System.out.println(x);  
    }
    
  }
  static long[] maxSubsetSum(int[] k)
  {
    long[] result = new long[k.length];
    for(int i=0; i<k.length; i++){
      int sum = 0;
      double dval = Math.sqrt(k[i]);
      int val = (int) dval;
      for (int j = 1; j <= val; j++){
          if (k[i] % j == 0)
          { 
            if (j == (k[i] / j))
              sum += j;
            else
              sum += (j + k[i] / j);
          }
      }
      result[i] = (long) sum;
    }
    return result;
  }
}