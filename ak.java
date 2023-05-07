
import javax.swing.*
import java.awt.*;
import java.awt.event.*;
class PaswordF extends JFrame
{
JLabel l1;
JpasswordField k1;
JTextArea a1;
JPanel jp;
PasswordF()
JCombobox cb;
{
setSize(400, 400);
setBackground(Color.Blue);
setVisible(true);
a1=new TextArea(10,10);
jp=new Jpanel();
String Country[]={"USA","INdia","Japan","Pakistan"};
cb=new JCombobox(Country)
l1=new JLabel("enter the password");
k1=new JPasswordField();
setLayout(new FlowLayout());
add(l1);add(k1);
add(jp); jp.add(a1); add(cb);
}
public static void main(String args[])
{
passwordF obj=new PsswordF();
}