public class RetailProduct extends Product
{
  private String manufacturer;

  public RetailProduct()
  {
    this("000000000000","","", 0);
  }

  public RetailProduct(String no, String nm, String man, int up)
  {
    super(no, nm, up);
    setManufacturer(man);
  }

  public void setManufacturer(String man)
  {
    manufacturer = man;
  }

  //getmethods

  public String getManufacturer()
  {
    return manufacturer;
  }

  public int calculateTax(int taxRate)
  {
    return (int) (getUnitPrice() * taxRate/100.0);
  }

  public int calculateTotalCost(int taxRate)
  {
    return getUnitPrice() + calculateTax(taxRate);
  }

  public String getOutputString()
  {
    return super.getOutputString() + " from " + getManufacturer() + ", unit price " + getUnitPrice() + "c, total price " + calculateTotalCost(TAXRATE) + "c";
  }


  public int compareTo(Product other)
  {
    String thisField = getBarcodeNumber().charAt(0) + getName();
    String otherField;
    char otherProductCode = other.getBarcodeNumber().charAt(0);
    if(otherProductCode == '2')
    {
      otherField = otherProductCode + other.getName() + ((WeightBasedProduct)other).getWeight();
    }

    else
    {
      otherField = otherProductCode + other.getName();
    }
    return thisField.compareTo(otherField);
  }

  public static void main(String[] args)
  {
    RetailProduct prod1 = new RetailProduct("178030640224", "Milk 1L", "Clover", 1550);
    System.out.println(prod1.getOutputString());
  }


}
