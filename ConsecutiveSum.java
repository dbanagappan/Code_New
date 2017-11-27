import java.io.IOException;

public class ConsecutiveSum 
{
   static int consecutive(long num)
   {
		 int j=1;
		 int res=0;
		 int seq=1; 
		 int tcs=0;	  
		 
		 while (j < num)
		 {
			 if ( (res + j) <= num ) 
				 {
				  res=res + j; 
				 } 
			    else
			      {
			    	res=seq+1; j=seq+1;seq=seq+1;
			      }
			    j=j+1;
			    if ( res == num ) 
			    { tcs=tcs+1; res=seq+1; j=seq+1; seq=seq+1;} 
		 }
		return tcs; 
  }
	
  public static void main(String[] args) throws IOException
  {     
	 int tcs = 0;
	 long input1 = 15;
	 
	 tcs = consecutive(input1); 
	 System.out.println("The output value is " + tcs);
	    
  }

}