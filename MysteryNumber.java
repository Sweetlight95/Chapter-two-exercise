import java.util.Scanner;

public class MysteryNumber {
public static void main(String[] args){

	int imaginaryNumber = 90;

Scanner input = new Scanner(System.in);

	System.out.println("Guess the Number");
		int guessNumber = input.nextInt();

	if (guessNumber > imaginaryNumber) {
		System.out.println("is too high");
	}

	if (guessNumber < imaginaryNumber) {
		System.out.println("is too low");
	}

	if (guessNumber == imaginaryNumber) {
		System.out.println("is correct");
	}

}
}
