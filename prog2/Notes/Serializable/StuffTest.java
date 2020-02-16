import java.util.*;
import java.io.*;
//for array.sort 
public class StuffTest 
{
	
  public static final int MAX_NO_OF_THINGS = 5;
  
  static ObjectOutputStream output;
  
  public static void open()
  {
	  //open file method 
	  try
	  {
		  output = new ObjectOutputStream(new FileOutputStream("stuff.ser"));
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
		  output.close();
	  }
	  catch(IOException e) 
	  {
		 System.out.println("Cannot close " + e);
	  }
  }	
		
	
 public static void main(String[] args)
 {
	open();
   Thing[] stuff = new Thing[5];
   
   stuff[0] = new RoundThing("Blue",5);
   stuff[1] = new SquareThing("Red",2);
   stuff[2] = new RoundThing("Green",1);
   stuff[3] = new RectangleThing("Purple",20,10);
   stuff[4] = new SquareThing("Cyan",20);
   
   for(int i = 0; i< MAX_NO_OF_THINGS; i++)
   {
	 System.out.println("stuff["+i+"] ="+stuff[i].tellAboutYourself() );
	 
   }
   Arrays.sort(stuff);
   System.out.println("After sorting...");
   for(int i = 0; i< MAX_NO_OF_THINGS; i++)
   {
	 
	 System.out.println("stuff["+i+"] ="+stuff[i].tellAboutYourself()+"Circumf"+ stuff[i].getCircumference() );
   }
   //new need to write 
   //checked and unchecke exception - IO is unchecked easier 
   //this is checked ...do //i handle it is there code ? thrown to catch it 
   
   for(int i = 0; i< MAX_NO_OF_THINGS; i++)
   {
		 //takes class object of object the super class 
		try
		{
			output.writeObject(stuff[i]);//this throws an exception 
		}
	   catch(IOException e)
		{
			System.out.println("Cannot open " + e);
			 
		}
	   
   //check the ser file that has Aced00841 ect now has larger size 
	}
	close();
}
}
  
 /*
   int count = 0;
   	
	try
	{
		Scanner input = new Scanner(new File("things.txt"));
		String inLine, color;
		int radius, length, width;
		
		int shape;
		
		while (input.hasNext())
		{
			inLine = input.nextLine();
			//number = #
			String fields[] = inLine.split("#");
			
			shape = Integer.parseInt(fields[0]);
			color = (fields[1]);
			//radius = Integer.parseInt(fields[2]);
			//length = Integer.parseInt(fields[3]);
			//width = Integer.parseInt(fields[4]);
			
			//cirlce
			if (shape == 1)
			{
				radius = Integer.parseInt(fields[2]);
				
				stuff[count] = new RoundThing(color, radius);
				//((RoundThing)Thing[count]).setOffice(office);
				
				
			}
			
			else if(shape == 2)
			{
				length = Integer.parseInt(fields[2]);
				stuff[count] = new SquareThing(color, length);
				
			}
			else if(shape == 3)
			{
				length = Integer.parseInt(fields[2]);
				width = Integer.parseInt(fields[3]);
				stuff[count] = new RectangleThing(color, length, width);
				//((Student)Thing[count]).setStatus(status);
				
			}
			else
			{
				System.out.println("Invalid input: " + inLine);
				count--;
			}
			count++;
		}
		
		for (int loop = 0; loop < count; loop++)
		{
			System.out.println(stuff[loop]);
		}
	}
	catch(FileNotFoundException e)
	{
		System.out.println("ERROR: " + e);
	}
	
 }
}
*/


   //replace with code to read from the file 
/*
   stuff[0] = new RoundThing("Blue",5);
   stuff[1] = new SquareThing("Red",2);
   stuff[2] = new RoundThing("Green",1);
   stuff[3] = new RectangleThing("Purple",20,10);
   stuff[4] = new SquareThing("Cyan",20);
   */
/////////////
/*
	
   for(int i = 0; i< MAX_NO_OF_THINGS; i++)
   {
	 System.out.println("stuff["+i+"] ="+stuff[i].tellAboutYourself() );
	 
   }
   Arrays.sort(stuff);
   System.out.println("After sorting...");
   for(int i = 0; i< MAX_NO_OF_THINGS; i++)
   {
	 
	 System.out.println("stuff["+i+"] ="+stuff[i].tellAboutYourself()+"Circumf"+ stuff[i].getCircumference() );
   }
 }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public class InvalidThingException extends RuntimeException
{
  public InvalidThingException()
  {
    super();
  }

  public InvalidThingException(String s)
  {
    super(s);
  }
}
//abstract suoer class get circumfrenece
//in 3 sup class 
//get circumf method 6 lines 
//change compare to method 
*/
