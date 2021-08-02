import java.util.Scanner;
public class TwoPointOneSix{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int loveNumber;
int goveNumber;

	System.out.print("Enter loveNumber:");
		loveNumber = input.nextInt();

	System.out.print("Enter goveNumber:");
		goveNumber = input.nextInt();

	if (loveNumber > goveNumber) {
		System.out.printf("%d is larger than %d%n", loveNumber, goveNumber);
	}

	if (loveNumber == goveNumber) {
		System.out.printf("These numbers are equal%n");
	}
}
}
