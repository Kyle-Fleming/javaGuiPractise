import java.util.*;
import java.io.*;
//for array.sort 
public class Read
{
	
  static ObjectInputStream input;
  
  public static void open()
  {
	  //open file method 
	  try
	  {
		  input = new ObjectInputStream(new FileInputStream("otherstuff.ser"));
	  }
	  catch(IOException e) 
	  {
		 System.out.println("Cannot open " + e);
	  }
  }	
	
  public static void close()
  {
	  //close file method 
	  try
	  {
		  input.close();
	  }
	  catch(IOException e) 
	  {
		 System.out.println("Cannot close " + e);
	  }
  }	
		
	
 public static void main(String[] args)
 {
	 open();
	 Thing something;
	 try
	 {
		 while(true)
		 {
			something = (Thing)input.readObject();
			System.out.println(something);
			if(something instanceof RectangleThing )
			{
				System.out.println("yippy I AM A RECTANGLE WITH WIDTH" +((RectangleThing)something).getWidth());
			}
		 }

	 }
	 catch(EOFException e) 
	 {
		 System.out.println("End of file " + e);
	 }
	 
	 catch(IOException e) 
	 {
		 System.out.println("prob class " + e);
	 }
	 catch(ClassNotFoundException e) 
	 {
		 System.out.println("prob class " + e);
	 }
	 catch(Exception e) 
	 {
		 System.out.println("Big prob " + e);
	 }
	  
     close();
   //check the ser file that has Aced00841 ect now has larger size 
 }
}