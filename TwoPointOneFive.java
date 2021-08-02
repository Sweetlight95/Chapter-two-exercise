import java.util.Scanner;
public class TwoPointOneFive {
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int number1;
int number2; 
int sum;
int product; 
int difference; 
int quotient; 

System.out.println("Enter number1:");
number1 = input.nextInt();

System.out.println("Enter number2:");
number2 = input.nextInt();

sum = number1 + number2;
product = number1 * number2;
difference = number1 - number2;
quotient = number1 / number2;

System.out.printf("Sum is %d Product is %d Difference is %d and Quotient is %d%n", sum, product, difference, quotient);
}
}
