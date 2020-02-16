import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;


public class StuffTestF
{
  public static final int MAX_NO_OF_THINGS = 15;
  public static void main(String[] args)
  {
    Thing[] stuff = new Thing[MAX_NO_OF_THINGS];
    String inLine, color, idno;
    int radius, length, width;
    char cat;

    while (input.hasNext())
    {
      inLine = input.nextLine();
      String[] fields = inLine.split("#");
      idno = fields[0];
      cat = idno.charAt(0);
      color = fields[1];
      if (cat=='1')
      {
        radius = Integer.parseInt(fields[2]);
        stuff[count] = new RoundThing(color, radius);
        count++;
      }
      else if (cat=='2')
      {
        length = Integer.parseInt(fields[2]);
        stuff[count] = new RoundThing(color, radius);
        count++;
      }
      else if (cat=='3')
      {
        length = Integer.parseInt(fields[2]);
        width = Integer.parseInt(fields[3]);
        stuff[count] = new RoundThing(color, radius);
        count++;
      }

      else
      {
        System.out.println("Invalid input" + inLine);
      }
    }
  }
  int num = Integer.parseInt(JoptionPane.showInputDialog("How many? "));

  System.out.println("Only" + num + " items will be displayed");
  String outstring = "";
  for(int i = 0; i < num; i++)
  {
    outstring += "stuff["+i +"] = "+ stuff[i]+ "\n";

  }
  JoptionPane.showMessageDialog(null, outstring);
}
