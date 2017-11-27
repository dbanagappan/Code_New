import java.io.IOException;

public class BuyingTicket 
{
	public static void main(String args[]) throws IOException 
	{ 
	    	int tickets[] = {5,5,2,3};
	    	int p=2; 
	    	long result;
	    	result = waitingTime(tickets, p); 
	    	System.out.println("The Waiting Time is : " + result); 
    }    
	
   static long waitingTime(int[] tickets, int p) 
   {     
	   int intvalue;
	   int count = 0; 
       int mcnt=0;
       boolean done = false;
	      
       while ( !done )
	     {
	        intvalue = tickets[0];   
	        for (int i = 0; i < tickets.length; i++) 
	        {    
	        	if (tickets[i] < 0 ) { tickets[i] = 0; } 
	        	if (i < tickets.length-1 )
	        	{  tickets[i] = tickets[i+1]; }
	        	  else
	        	  {  
        		    tickets[tickets.length-1] = intvalue-1;  
        		    if ( tickets[i] == 0 ) 
        		        { mcnt = mcnt + 1; break; } else  {  count = count + 1; }  
	        	  }
	        	 
	           }  
	        if (mcnt >= p ) { count = count + 1; done=true; }   
          } 
	     return count;
      }
}
