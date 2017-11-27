import java.io.IOException;

public class Pychometric  
{
	public static void main(String args[]) throws IOException 
	{
		int scores[] = {1,3,5,6,8};
		int lowerLimits[] = {2};
		int upperLimits[] = {6};
		int[] res = jobOffers(scores, lowerLimits, upperLimits);
		
		for(int i : res)
		    { System.out.println(i); } 
	}
	
	static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits)
	{ 
	    int[] results = new int[lowerLimits.length];
	    int cnt = 0;
	    
	    for(int i = 0; i < lowerLimits.length; i++)
	    {
	    	for (int sc=0; sc <=scores.length-1; sc++ )
			 {   
	    		if ( lowerLimits[i] <= scores[sc] && upperLimits[i] >= scores[sc] )
	    		{ cnt = cnt + 1; 
	    		  results[i] = cnt;
	    	    }
	         }
	    	cnt=0;
	    }	
	    return results;  
	}
}