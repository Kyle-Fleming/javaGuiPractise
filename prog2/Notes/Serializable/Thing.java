//comparable is generic and thing stays abstarct 
import java.util.*;
import java.io.*;

public abstract class Thing implements Serializable, Comparable<Thing>
{
  private String color;

  public Thing(String color)
  {
    setColor(color);
  }

  public Thing()
  {
    this("");
  }
  //Add so we dont repeat compare to as its the same formula all around 
  public abstract String tellAboutYourself();
  /*public int compareTo(Thing other)
  {
    return this.getColor().compareTo(other.getColor());
  }
  */
  
  public abstract double  getArea();
  // ADDED ROUND 2 
  public abstract double  getCircumference();
  // ADDED ROUND 2 compare for circumf 
   public int compareTo(Thing other1)
  {
    if(this.getCircumference() < other1.getCircumference())
		return -1;
	if(this.getCircumference() > other1.getCircumference())
		return 1;
	return 0;
	
  }
/* 
  public int compareTo(Thing other1)
  {
    if(this.getArea() < other1.getArea())
		return -1;
	if(this.getArea() > other1.getArea())
		return 1;
	return 0;
	
  }
  */
  
  public void setColor(String color)
  {
    this.color = color;
  }

  public String getColor()
  {
    return color;
  }

  public String toString()
  {
    return "I am a"+getColor()+" thing";
  }

  
  public static void main(String[] args)
   {
     //Thing t1 = new Thing("Blue");
    // System.out.println(t1);
  }
}
