import java.io.*;
import java.net.*;
import java.util.*;
 
public class Client {
 
   public static void main(String argv[])
      {
	   Scanner scan = new Scanner(System.in);
	   try{
		    Socket socketClient= new Socket("localhost",5555);
		    System.out.println("Client: "+"Connection Established");
 
		    BufferedReader reader = 
		    		new BufferedReader(new InputStreamReader(socketClient.getInputStream()));
 
		    BufferedWriter writer= 
	        		new BufferedWriter(new OutputStreamWriter(socketClient.getOutputStream()));
		    String serverMsg;
		    String inputString;
			/*
		    
			while((serverMsg = reader.readLine()) != null){
				System.out.println("Client: " + serverMsg);
				inputString = String.valueOf(scan.nextFloat());
				writer.write(inputString);
	            writer.flush();
			}
			*/
			
			System.out.println("Client: " + reader.readLine());
			inputString = String.valueOf(scan.nextFloat());
			writer.write(inputString);
	        writer.flush();
			
			System.out.println("Client: " + reader.readLine());
			inputString = String.valueOf(scan.nextFloat());
			writer.write(inputString);
	        
				
			System.out.println("Client: " + reader.readLine());
			
	   }catch(Exception e){}
      }
}