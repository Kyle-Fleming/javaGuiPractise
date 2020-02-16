public class RoundThing extends Thing
{
  private int radius;
  private int area;

  public RoundThing(String color, int radius)
  {
    super(color);
    setRadius(radius);
  }

  public RoundThing()
  {
    this("",1);
  }

  public void setRadius(int r)
  {
    if (r<=0)
     {
      throw new InvalidThingException("Invalid RoundThing: radius must be greater than 0: Radius ="+ r);
    }
    else
    {
      radius = r;
    }
  }
  public int getRadius()
  {
    return radius;
  }
  public double getArea()
  {
    return Math.PI * (getRadius()*getRadius()) ;
  }
  public double getCircumference()
  {
    return 2 * Math.PI * getRadius() ;
  }
  public String toString()
  {
    return "I am a"+getColor()+" round thing with radius "+getRadius()+"with circumf: " + getCircumference();
  }


   //dont call compareto later on as string  have a compareTo
  /*public int compareTo(Thing other)
  {
    return this.getColor().compareTo(other.getColor());
  }
  */
//////////////
	public String tellAboutYourself()
	{
	  return "I am a "+getColor()+" rectangular thing. I just lie around and do nothing!"+"my area:"+ getArea();
	}

  public static void main(String[] args)
  {
    RoundThing rt1 = new RoundThing();
    try
    {
      rt1 = new RoundThing("Blue", 10);
      System.out.println("It worked!!");
    }
    catch(InvalidThingException error)
    {
      System.out.println(error);
    }
    System.out.println("And the program continues!!!");
    System.out.println(rt1);

    try
    {
      rt1 = new RoundThing("Red", -1);
      System.out.println("It works!@!@!@!");
    }
    catch(InvalidThingException error)
    {
      System.out.println(error);
    }
    System.out.println("And my program continues again!!!>>>");
    System.out.println(rt1);
    System.out.println("\n Assignment: Explain what just happened!!");
  }
  
}
