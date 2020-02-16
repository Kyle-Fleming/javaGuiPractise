import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class BMI extends JFrame
{
	//all objects
	private JLabel weightLabel, heightLabel, bmiLabel, displayLabel;
	private JLabel weightL;
	private JTextField weightTF;
	private JLabel heightL;
	private JTextField heightTF;
	private JRadioButton maleSelect;
	private JRadioButton femaleSelect;
	private ButtonGroup genderSelect;
	private int genderValue; // 0 - male, 1 - female
	private JButton calculate;
	private JLabel bmiL;
	private JLabel displayL;
	private GridLayout layout;

	public BMI()
	{
		super("BMI Calculator");
		layout = new GridLayout(5,2);
		setLayout(layout);

		weightL = new JLabel("Enter weight in KG: ");
		//no value
		weightTF = new JTextField("");
		heightL = new JLabel("Height in meters");
		heightTF = new JTextField("");
		maleSelect = new JRadioButton("male");
		femaleSelect = new JRadioButton("female");

		genderSelect = new ButtonGroup();
		genderSelect.add(maleSelect);
		genderSelect.add(femaleSelect);
		calculate = new JButton("Calculate BMI");
		bmiL = new JLabel("Your BMI is: ");
		displayL = new JLabel("");

		add(weightL);
		add(weightTF);
		add(heightL);
		add(heightTF);
		add(maleSelect);
		add(femaleSelect);
		//add(genderSelect);
		add(calculate);
		add(bmiL);
		add(displayL);
		//handler as parameter
		maleSelect.addItemListener(new RadioButtonHandler(0));
		femaleSelect.addItemListener(new RadioButtonHandler(1));

		//connect buttons
		//first objects then parameter
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
			if(bmi<22.5)
				displayL.setText("M- you are under weight ");
			else if(bmi<29.5)
				displayL.setText("M- you have ideal weight ");
			else if(bmi<39.5)
				displayL.setText("M- you are overweight  ");
			else
				displayL.setText("M- your a fat ass");

		}
		if(genderValue == 1)
		{
			if(bmi<30.5)
				displayL.setText("F- you are under weight ");
			else if(bmi<40.5)
				displayL.setText("F- you have ideal weight ");
			else if(bmi<50.5)
				displayL.setText("F- you are overweight  ");
			else
				displayL.setText("F- your a fat ass");

		}
		*/

	}


	public static void main(String[] args)
	{

		BMI bmi = new BMI();
		bmi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bmi.setSize(500,250);
		bmi.setVisible(true);
	}
}
