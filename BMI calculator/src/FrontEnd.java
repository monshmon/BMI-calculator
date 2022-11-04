import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.DecimalFormat;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class FrontEnd implements ActionListener
{
	private static JFrame f;
	private static JPanel p;
	public JLabel l1,l2;
	private static JLabel l3;
	private static JLabel l4;
    private static JTextField t1;
    private static JTextField t2;
	private static JButton b1;
	public void frame()
{
	f=new JFrame();
	   f.setSize(500,500);
	   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   f.setVisible(true);
}
	 public void panel() 
{
		 p=new JPanel();
		 p.setLayout(null);
		 f.add(p);
}	
	 public void label1()
{
	l1= new JLabel("Enter Height in Meters :");
	l1.setBounds(80,50,180,30);
	p.add(l1);
}
	    public void text2(){
	 t2=new JTextField("EnterHeight");
	 t2.setBounds(240,50,168,25);
	 p.add(t2);
	 t2.setVisible(true);
}

	 public void lable2()
{
	l2=new JLabel("Enter your Bodyweight in Kgs :");
	l2.setBounds(40,100,200,20);
	l2.setVisible(true);
	p.add(l2);
}
  public void text1()
{
     t1 = new JTextField("Enterweight");
     t1.setBounds(240,100,168,25);
	 p.add(t1);
     t1.setVisible(true);
} 
public void button() {
		 b1 = new JButton("CALCULATE");
		 b1.setBounds(140,180,150,30);
         b1.setVisible(true);
         b1.addActionListener(new FrontEnd());
         p.add(b1);
          }
	 public void lable3()
	 {
		l3=new JLabel("Your BMI is :");
		l3.setBounds(160,150,200,20);
		l3.setVisible(true);
		p.add(l3);
     }
	 public void lable4() {
		 l4= new JLabel("YOUR Body condition");
		 l4.setBounds(130,240,300,20);
		 l4.setVisible(true);
		 p.add(l4);
	 }

public static void main (String[] args) {

FrontEnd n = new FrontEnd();	
	n.frame();
	n.panel();
	n.label1();
	n.lable2();
	n.lable3();
	n.text1();
    n.text2();
    n.button();
    n.lable4();
}
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
double Height=Double.parseDouble(t2.getText());
double weight=Double.parseDouble(t1.getText());
double i= Height*Height;
double ans = weight/i;
l3.setText("Your BMI is : "+ans);

if(ans<=18.4) 
{
 l4.setText("Your are very Skinny. so, gain healthy weight. ");
}
if(i>=18.4 && i<=24.9)
{
	l4.setText("Great,Your Healthy and Fit!");
}
if(i>=25 && i<=29.9) 
{
	l4.setText("Your Chubby And Cute!");
}
if(i>30 && i<34.9)
{
    l4.setText("You Are lighly Obese!!");	
}
if(i>35)
{
   l4.setText("You Are Extereamly Obese!!!!");	
}
}
}
