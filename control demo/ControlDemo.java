import java.awt;//layout and event handlers
import javax.swing;//control library

public class ControlDemo extends JFrame
{
  private final JTextField textField1;
  private final JButton btn1;
  private final JLabel lbl1;
  public ControlDemo()
  {
    super("Testing JTextField and JLabel");
    setLayout(new FlowLayout());
    textField1 = new JTextField(10);
    add(textField1);

    lbl1 = new JLabel("");
    add(lbl1);

    
  }
}
