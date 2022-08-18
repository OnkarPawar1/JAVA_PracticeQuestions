import java.util.Scanner;  // Import the Scanner class

public class Main
{
	public static void main(String[] args) {
	
	
	// Area Of Circle Java Program
System.out.println("Enter the Length : ");
	    
	    Scanner Length = new Scanner(System.in);
	    double B= Length.nextDouble(); 

System.out.println("Enter the Width : ");

	    Scanner Width = new Scanner(System.in);
	    double H= Width.nextDouble();  

double  Area = B*H ;
	
	System.out.println("area of Rectangle is " + Area);
	}
}
