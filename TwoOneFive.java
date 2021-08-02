import java.util.Scanner;
public class TwoPointOneFive {
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int number1, number2 sum, product, difference, quotient; 

System.out.println("Enter number1:");
int number1 = input.nextInt();

System.out.println("Enter number2:");
int number2 = input.nextInt();

//Odoemela Adesuwa

sum = number1 + number2;
product = number1 * number2;
difference = number1 - number2;
quotient = number1 / number2;

System.out.printf("Sum is %d Product is %d Difference is %d and Quotient is %d", sum, product, difference, quotient);
}
}
