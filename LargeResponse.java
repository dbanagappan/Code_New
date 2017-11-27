import java.io.*;
import java.util.Scanner; 

public class LargeResponse 
{
	public static void main(String[] args) throws Exception 
	{
		int fsize=0;
		int tsize=0;
		int cnt=0;
		String st;
		String inp;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the file name : ");
		inp = scanner.next(); 
		 
		File file= new File( "D:\\Exam\\" + inp );
		BufferedReader br=new BufferedReader(new FileReader(file));
		
        while((st=br.readLine())!=null) 
        {   
        	String[] ar=st.split(" "); 
            fsize = Integer.valueOf(ar[9]);
            if ( fsize > 5000)
            {
            	tsize = tsize + fsize;
            	cnt = cnt + 1;
            }
        } 
        br.close(); 
        scanner.close();
        
        PrintWriter out = new PrintWriter(new FileWriter( "D:\\Exam\\bytes_" + inp) ); 
        out.println(cnt);
        out.println(tsize);
        out.close(); 
	}

}
