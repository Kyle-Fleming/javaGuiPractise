import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
//import javax.swing.JoptionPane;


public class BMI extends JFrame
{
  private JLabel weightL;
  private JTextField weightTF;

  private JLabel heightL;
  private JTextField heightTF;

  private  JRadioButton maleSelect;
  private JRadioButton femaleSelect;
  private ButtonGroup genderSelect;
  private int genderValue;

  private JButton calculate;
  private JLabel bmiL;
  private JLabel displayL;
  private GridLayout layout;

  public BMI()
  {
    super("BMI Calculator");
    layout = new GridLayout(5, 2);
    setLayout(layout);

    weightL = new JLabel("Enter weight in kg: ");
    weightTF = new JTextField("");

    heightL = new JLabel("Enter height in meters: ");
    heightTF = new JTextField("");

    maleSelect = new JRadioButton("Male");
    femaleSelect = new JRadioButton("Female");
    genderSelect = new ButtonGroup();
    genderSelect.add(maleSelect);
    genderSelect.add(femaleSelect);

    calculate = new JButton("Calculate BMI");
    bmiL = new JLabel("Your BMI is: ");
    displayL =  new JLabel("");

    add(weightL);//weight label
    add(weightTF);//weight textField

    add(heightL);
    add(heightTF);

    add(maleSelect);
    add(femaleSelect);

    add(calculate);

    add(bmiL);
    add(displayL);

    maleSelect.addItemListener(new RadioButtonHandler(0));
    femaleSelect.addItemListener(new RadioButtonHandler(1));

    CalculateHandler handler = new CalculateHandler();
    calculate.addActionListener(handler);
  }


  private class RadioButtonHandler implements ItemListener
  {
    private int gender;
    public RadioButtonHandler(int sel)
    {
      gender = sel;
    }


    public void itemStateChanged(ItemEvent e)
    {
      genderValue = gender;
    }
  }


  private class CalculateHandler implements ActionListener
  {
    public void actionPerformed(ActionEvent e)
    {
    double weight = Double.parseDouble(weightTF.getText());
    double height = Double.parseDouble(heightTF.getText());
    double bmi = weight/(height * height);
    bmiL.setText(String.format("your bmi is: %4.2f", bmi));

    }

/*
    if(genderValue == 0)
    {
      if(bmi < 22.5)
      {
        displayL.setText("M -- you are underweight");
      }
      else if(bmi > 29.5)
      {
        displayL.setText("M -- you are at an ideal weight");
      }
      else if(bmi > 32.9)
      {
        displayL.setText("M -- you are overweight");
      }
      else
      {
        displayL.setText("M -- you are obese");
      }
    }
    else
    {
      if(bmi < 18.5)
      {
            displayL.setText("M -- you are underweight");
      }
      else if(bmi < 24.5)
      {
        displayL.setText("M -- you are at an ideal weight");
      }
      else if(bmi < 29.5)
      {
        displayL.setText("M -- you are overweight");
      }

      else
      {
        displayL.setText("M -- you are obese");
      }
    }
*/
}
    public static void main(String[] args)
    {
      BMI bmi = new BMI();
      bmi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      bmi.setSize(500, 250);
      bmi.setVisible(true);
    }





}
