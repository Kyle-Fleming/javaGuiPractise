public class RectangleThing extends Thing
{
  private int width;
  private int length;
  private int area;
  public RectangleThing(String color, int length, int width)
  {
    super(color);
    setSides(length, width);
  }
  public RectangleThing()
  {
    this("",2,1);
  }

  public void setSides(int length, int width)
  {
    if (length<=0)
    {
        throw new InvalidThingException("Length of rectangle is invalid, must be greater than 0: Length ="+length);
    }
    if (width<=0)
    {
        throw new InvalidThingException("Width of rectangle is invalid, must be greater than 0: Length ="+length);
    }
    if (length<= width)
    {
        throw new InvalidThingException("value for length and width of rectangle are invalid, length must be greater than width: length= "+length+ " and width= "+width);
    }
    this.width = width;
    this.length = length;
  }

    public int getLength()
    {
      return length;
    }
    public int getWidth()
    {
      return width;
    }
	  public double getArea()
    {
	   
      return getLength() * getWidth() ;
    }
	//added  CIRCUMFERENCE  rectangle
	  public double getCircumference()
    {
	   
      return ((2 * getLength())+ (2 * getWidth())) ;
    }
  
    public String toString()
    {
      return "I am a "+getColor()+" rectangular thing with length "+getLength()+" and width "+getWidth()+ "with perimeter : " + getCircumference();
    }
	  //dont call compareto later on as string  have a compareTo
  /*public int compareTo(Thing other)
  {
    return this.getColor().compareTo(other.getColor());
  }
  */

    public String tellAboutYourself()
    {
      return "I am a "+getColor()+" rectangular thing. I just lie around and do nothing!"+"my area:"+ getArea();
    }

    public static void main(String[] args)
    {
      RectangleThing block = new RectangleThing("Green",20,10);
      System.out.println(block);
    }

}
