import java.util.Scanner;

public class TwoPointsOneSeven{
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int number1;
	int number2;
	int number3;
	int sum;
	int average;
	int product;
	int smallest;
	int largest;

	System.out.println("Enter number1:");
		number1 = input.nextInt();

	System.out.println("Enter number2:");
		number2 = input.nextInt();

	System.out.println("Enter number3:");
		number3 = input.nextInt();
		
	sum = number1 + number2 + number3;
	average = (number1 + number2 + number3) / 3;
	product = number1 * number2 * number3;
	smallest = number1;
	largest = number1;

	if (number2 < smallest)
		smallest = number2;
		
	if (number3 < smallest)
		smallest = number3;
		
	if (number2 > largest)
		largest = number2;
		
	if (number3 > largest)	
		largest = number3;
		
	System.out.printf("%d is sum, %d is average and %d is product%n", sum, average, product);
	System.out.printf("%d is the Smallest while %d is the Largest%n", smallest, largest);
	//Odoemela Adesuwa
}

}
