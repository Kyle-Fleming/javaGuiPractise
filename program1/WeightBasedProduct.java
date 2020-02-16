public class WeightBasedProduct extends Product
{
  private int weight;

  public WeightBasedProduct()
  {
    this("000000000000","",0,0);
  }

  public WeightBasedProduct(String no, String nm, int up, int wt)
  {
    super(no, nm, up);
    setWeight(wt);
  }

  public void setWeight(int wt)
  {
    weight = wt;
  }

  public int getWeight()
  {
    return weight;
  }

  public int calculateTax(int taxRate)
  {
    return(int)(getUnitPrice() * (getWeight()/1000.0) * taxRate / 100.0);
  }

  public int calculateTotalCost(int taxRate)
  {
    return(int)(getUnitPrice() * (getWeight()/1000.0) + calculateTax(taxRate));
  }

  public String getOutputString()
  {
    return super.getOutputString() + ", unit price " + getUnitPrice() + "c/kg, weight " + getWeight() +" grams, total price " + calculateTotalCost(TAXRATE) + "c";
  }

  public int compareTo(Product other)
  {
    String thisField = getBarcodeNumber().charAt(0) + getName() + getWeight();
    String otherField;

    if(other instanceof WeightBasedProduct)
    {
      otherField = other.getBarcodeNumber().charAt(0) + other.getName() + ((WeightBasedProduct)other).getWeight();
    }
    else
    {
        otherField = other.getBarcodeNumber().charAt(0) + other.getName();
    }

    return thisField.compareTo(otherField);
  }

  public static void main(String[] args)
  {
    WeightBasedProduct prod1 = new WeightBasedProduct("245134867531", "Bananas", 4300, 540);
    System.out.println(prod1.getOutputString());
  }

}
