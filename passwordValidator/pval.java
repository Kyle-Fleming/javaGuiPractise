import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class pval extends JFrame
{
  private JLabel enterPass, confirmPass, confirmIndicator;

  private JTextField firstEntry, secondEntry;

  private GridLayout layout;
  private JButton validate;

  public pval()
  {
    super("Password validator!");
    layout = new GridLayout(5, 2);
    setLayout(layout);

    enterPass = new JLabel("Please enter a password: ");
    firstEntry = new JTextField("");

    confirmPass = new JLabel("Please confirm your password: ");
    secondEntry = new JTextField("");


    validate = new JButton("VALIDATE!!!");

    add(enterPass);
    add(firstEntry);
    add(confirmPass);
    add(secondEntry);
    add(confirmIndicator);
    add(validate);

    ValidateHandler handler = new ValidateHandler();
    validate.addActionListener(handler);
  }

  private class ValidateHandler implements ActionListener
  {
    public void actionPerformed(ActionEvent btnClick)
    {
      String pass1 = firstEntry.getText();
      String pass2 = secondEntry.getText();

      if(pass1 == pass2)
      {
          confirmIndicator.setText("Valid password, welcome");
      }
      else
      {
        confirmIndicator.setText("Invalid password, try again");
      }
    }
  }

  public static void main(String[] args)
  {
      pval meme = new pval();
      meme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      meme.setSize(500, 250);
      meme.setVisible(true);
  }
}
