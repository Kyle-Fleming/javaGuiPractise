import java.io.*;

public abstract class Product implements Taxable, Serializable, Comparable<Product>
{
  public static final int TAXRATE = 15;
  public String barcodeNumber;
  private String name;
  private int unitPrice;

  public Product()
  {
    this("000000000000", "", 0);
  }

  public Product(String no, String nm, int up)
  {
    setBarcodeNumber(no);
    setName(nm);
    setUnitPrice(up);
  }

  public String getOutputString()
  {
    return "Barcode: " + getBarcodeNumber() + " is " + getName();
  }

  public void setBarcodeNumber(String no)
  {
    barcodeNumber = no;
  }

  public void setName(String nm)
  {
    name = nm;
  }

  public void setUnitPrice(int up)
  {
    unitPrice = up;
  }

  //get methods


  public String getName()
  {
    return name;
  }

  public String getBarcodeNumber()
  {
    return barcodeNumber;
  }

  public int getUnitPrice()
  {
    return unitPrice;
  }

  public abstract int calculateTotalCost(int taxRate);
}
