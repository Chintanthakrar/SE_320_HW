import java.io.*;
import java.net.*;
 
class Server
{
   public static void main(String argv[]) 
      {
 
   		 System.out.println(" Server is Running  " );
         ServerSocket mysocket = new ServerSocket(5555);
 
         while(true)
         {
            Socket connectionSocket = mysocket.accept();
 
            BufferedReader reader =
            		new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            BufferedWriter writer= 
            		new BufferedWriter(new OutputStreamWriter(connectionSocket.getOutputStream()));
 
            writer.write("*** Welcome to the Calculation Server (Addition Only) ***\r\n");            
            writer.write("*** Insert weight in KG : \n");
            writer.flush();
            String weight = reader.readLine().trim();
 
            writer.write("*** Insert heights in Meters : \n");
            writer.flush();
			
            String height = reader.readLine().trim();
			
            float num1=Float.parseFloat(data1);
            float num2=Float.parseFloat(data2);
 
            float result=weight /(height*height);            
			
            writer.write("\r\n=== Result is  : "+result);
            writer.flush();
            connectionSocket.close();
         }
      }
}