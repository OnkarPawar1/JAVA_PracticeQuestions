import java.util.Scanner;  // Import the Scanner class

public class Main
{
	public static void main(String[] args) {
	System.out.println("Enter the B and H : ");

	
	
	// Area Of Circle Java Program
	    Scanner Br = new Scanner(System.in);
	    Scanner Hi = new Scanner(System.in);


	double B= Br.nextDouble(); 
	double H= Hi.nextDouble();  

	double  Area = 0.5*B*H ;
	
	System.out.println("area of Triangle is " + Area);
	}
}
