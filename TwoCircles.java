import java.io.IOException; 

public class TwoCircles 
{
  static String[] circles( int[] info )  
  {  
	  int firstval=0;
	  int secval=0;
	  int thdval=0; 
	  int totcir=info.length/6;	 
	  String[] results = new String[totcir];  
	  String output = null; 
	  int distance = 0;
	  
	  for (int j=0 ; j<=totcir-1 ; j++)
	  {      
		    //distance = (info[j] - info[j+3] ) * (info[j] - info[j+3]) + (info[j+1] - info[j+4] ) * (info[j+1] - info[j+4] );
		     
		    /* if ( distance > Math.abs(info[j+2] + info[j+5] ))
		         { output = "Disjoint‐Outside";  } 
		    else if (distance <= Math.abs(info[j+2] + info[j+5]))  
		    	 { output = "Disjoint‐Inside";  }  
		     else if (distance <= Math.abs(info[j+2] - info[j+5] ) ) 
		         { output = "Intersecting";  } 
		    */
		    if ( info[j] > info[j+3] ) { firstval = info[j+0] - info[j+3];  }  else  { firstval = info[j+3] - info[j+0]; } 
		    if ( info[j+1] > info[j+4] ) { secval = info[j+1] - info[j+4];  }  else  { secval = info[j+4] - info[j+1]; } 
		    if ( info[j+2] > info[j+5] ) { thdval = info[j+2] - info[j+5];  }  else  { thdval = info[j+5] - info[j+2]; }   
		     
		    //touching
		    if ( (firstval == thdval) ||  (firstval == secval)  || (firstval == thdval) || (secval == thdval )  )
		    { output = "Touching";  } 
		    
		    results[j] = output;
	  } 
	return results;
  }
  
  public static void main(String args[]) throws IOException
  { 
	  int info[] = {0 ,15, 11, 0 ,20 ,16,26, 0 ,10 ,39, 0 ,23,0 ,5 ,9,0, 9 ,7};   
	   
	  String[] results = circles(info); 
	  for(String i : results)
		    { System.out.println(i); } 
  } 
  
}
