import java.io.*;

public class FileIO
    {
	public void FileW(double result){
		try
		{
			FileWriter myWriter = new FileWriter("Result.txt", true);  //File created to enter the value into
			String stDigit = String.valueOf(result);                     //String created for storing the result value sent from add method
			
			myWriter.write(stDigit+"\n");                                     //FileWriter object writes the value to the file assigned above
			myWriter.close();                                            //FileWriter closes
		}
				
		catch(Exception e){
			e.printStackTrace();                        //Incase of exception encountered, this method will print the exception details
		}
	}
	
	public void FileR(){
		try{
			FileReader fr=new FileReader("Result.txt"); //Reads from the file created and written in previously
			BufferedReader br = new BufferedReader(fr);         //Loads the text in the buffer reader object 
			String st;                                          //String for traversing the text 
					
			while ((st = br.readLine()) != null)                //While string has more lines to read in buffer reader object, and is not null
				System.out.println(st);                         //print the text inside the file in the commandline 
		}
		catch(Exception e){
			e.printStackTrace();                        //Incase of exception encountered, this method will print the exception details
		}
	}
}