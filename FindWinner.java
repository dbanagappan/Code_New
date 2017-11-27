import java.io.IOException;

public class FindWinner 
{
   public static void main(String[] args) throws IOException 
   {
	   int[] maria = {1,2,3};	
	   int[] andrea = {2,1,3};
	   String s = "Odd"; 
	   String res;
	   res = winner(andrea, maria, s ); 
	   System.out.println("Winner is : " + res); 
   }
   
   static String winner(int[] andrea, int[] maria, String s)
   {
	       int mscore=0;
	       int ascore=0; 
	       String res = null; 
	       
	   	   if (s.equals("Even") )
			{
				for(int i=0; i < maria.length; i=i+2 ) 
				{   
					ascore = ascore + ( andrea[i] - maria[i] );
					mscore = mscore + ( maria[i] - andrea[i] );   
				} 
			} 
	   	   if (s.equals("Odd") )
				{
				   for(int i=1; i < maria.length; i=i+2 ) 
					{ 
					   ascore = ascore + (andrea[i] - maria[i] ); 
					   mscore = mscore + (maria[i] - andrea[i] );
					} 
				}   
		   if (mscore < ascore)  { res = "Maria"; }
		   if (mscore > ascore)  { res = "Andrea"; }
		   if (mscore == ascore) { res = "Tie"; }
		   
		   return res;
   }
} 
	   
