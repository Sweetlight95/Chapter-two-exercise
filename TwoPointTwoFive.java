import java.util.Scanner;

public class TwoPointTwoFive {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

int number;

System.out.print("Enter a number:");
number = input.nextInt();

if(number % 2 == 0 ) {
	System.out.printf("%d is Even", number);
}
 if (number % 2 == 1) {
 	System.out.printf("%d is Odd", number);
 }
}
}
