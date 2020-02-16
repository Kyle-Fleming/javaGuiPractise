import java.io.*;
import java.util.*;

public class Basket
{
  public static final int NO_OF_PRODUCTS = 25;

  static ObjectOutputStream output;

  public static void openOutput()
  {
    try
    {
      output = new ObjectOutputStream(new FileOutputStream("basket.ser"));
    }catch (IOException e)
    {
      System.out.println("Cannot open output file.");
    }


  }

  public static void closeOutput()
  {
    try
    {
      output.close();

    }catch(IOException e)
    {
      System.out.println("Cannot close output file");
    }
  }
public static void main(String args[])
{
  Product productsList[] = new Product[NO_OF_PRODUCTS];
  int count = 0;
  try
  {
    Scanner input = new Scanner(new FileReader("productData.txt"));
    String inLine, barcode, name, manufacturer;
    int unitPrice, weight;
    char productCode;

    while(input.hasNext())
    {
      inLine = input.nextLine();
      String[] fields = inLine.split("#");
      barcode = fields[0];
      productCode = barcode.charAt(0);
      name = fields[1];
      if(productCode == '1')
      {
        manufacturer = fields[2];
        unitPrice = Integer.parseInt(fields[3]);
        productsList[count] = new RetailProduct(barcode, name, manufacturer, unitPrice);
        count++;
      }

      else if(productCode == '2')
      {
        unitPrice = Integer.parseInt(fields[2]);
        weight = Integer.parseInt(fields[3]);
        productsList[count] = new WeightBasedProduct(barcode, name, unitPrice, weight);
        count++;
      }

      else
      {
        System.out.println("Invalid input" + inLine);
      }
    }
  }catch(FileNotFoundException e)
      {
        System.out.println("Error: " + e);
      }

      Product[] tempList = Arrays.copyOf(productsList, count);
      Arrays.sort(tempList);
      for(int i = 0; i <tempList.length; i++)
      {
        System.out.println(tempList[i].getOutputString());
      }
      openOutput();
      try
      {
        for(int i = 0; i<count; i++)
        {
          output.writeObject(productsList[i]);
        }
      }catch(IOException e)
      {
        System.out.println("Problem writing to file: " + e);
      }
      closeOutput();
 }
}
