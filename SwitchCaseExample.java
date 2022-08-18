import java.util.Scanner;  // Import the Scanner class

public class Main
{
	public static void main(String[] args) {

System.out.println("Enter the Animal ");

Scanner in = new Scanner(System.in);
String  animal= in.next();

    switch (animal) {
        case "CAT":
            System.out.println(animal + " is domestic animal");
            break;
        case "TIGER":
            System.out.println(animal + " is wild animal");
            break;
        default:
            System.out.println("unknown animal");
            break;
    }
}
}
