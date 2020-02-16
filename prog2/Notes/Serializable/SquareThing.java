public class SquareThing extends Thing
{
  private int length;
  private int area;

  public SquareThing(String color, int length)
  {
    super(color);
    setLength(length);
  }
  public SquareThing()
  {
    this("",1);
  }

  public void setLength(int length)
  {
    if (length<=0)
    {
      throw new InvalidThingException("Length of square is invalid, must be greater than 0: length=" + getLength());
    }
    this.length = length;
  }
  public int getLength()
  {
    return length;
  }
  //added area 
  
  public double getArea()
  {
      return getLength() * getLength();
  }
//added CIRCUMFERENCE Square
  public double getCircumference()
  {
	  //length * 4
      return getLength() + getLength()+getLength() + getLength();
  }

  public String toString()
  {
    return "I am a "+getColor()+" square thing with sides"+getLength()+" units long "+ "with perimeter :" + getCircumference();
  }
  public String tellAboutYourself()
  {
    return "I am a square thing. I do nothing cool....."+"my area:"+ getArea();
  }
  
  //compare to area can move to super class as we repeat it 
  //dont call compareto later on as string  have a compareTo

  
  public static void main(String[] args)
  {
    SquareThing block2 = new SquareThing("Green",10);
    System.out.println(block2);
  }

}
