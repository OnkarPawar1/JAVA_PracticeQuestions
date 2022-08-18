import java.util.Scanner;  // Import the Scanner class

public class AreaOfRectangle
{
	public static void main(String[] args) {
	System.out.println("Enter the Radius of Circle : ");

	
	// Area Of Circle Java Program
	    Scanner R = new Scanner(System.in);

	double pie = 3.14 ;
	double Radius= R.nextDouble();  
	double  Area = 2*pie*Radius*Radius ;
	
	System.out.println("area of Circle is " + Area);
	}
}
