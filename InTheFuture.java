import java.io.IOException;

public class InTheFuture 
{
  static int minNum(int A, int K, int P)
  { 
	  int output=0;
	  
	  if ( A + P < K )
	  {   
		  output = K - ( A + P );
  	  } else
	  {
  		output = P + ( K - A);
	  }
	  
	  return output;
  }
  
  public static void main(String[] args) throws IOException
	{
		int A = 3;
		int K = 5;
		int P = 1;
		int result;
         
		result = minNum(A,K,P);
		System.out.println(" The output is " + result); 
	   
	}
}
