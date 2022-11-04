import java.util.Scanner;
import javax.swing.JFrame;
public class Backend {
private static double i;
private double height;
private double weight;
public void height() 
{
	double height;
		Scanner input = new Scanner(System.in);		
        System.out.println("Enter the Height in Meter");
		height = input.nextDouble();
		this.height=height;
}
public void weight()
{		
double weight;
		System.out.println("Enter the Weight in Kilogram");
		Scanner input = new Scanner(System.in);	
		weight =input.nextInt();
		this.weight=weight;
}
public void urweightcondition() 
{
		if(i<=18.4) 
		{
	     	System.out.println("Your UNDER weight");
	        System.out.println("");
	    }
		if(i>=18.4 && i<=24.9)
		{
			System.out.println("your NORMAL");
		}
	    if(i>=25 && i<=29.9) 
	    {
	    	System.out.println("Your Chubby and Cute");
	    }
	    if(i>=30 && i<34.9) {
	    	
	    }
	}
public void heightsq() 
{
double heightsq=height*height;
	    double i= (weight/heightsq);
		System.out.println("Your BMI is "+ i );
}
		public static void main(String[] arg )
{
			Backend b = new Backend();
			b.height();
			b.weight();
			b.heightsq();
            b.urweightcondition();
}}