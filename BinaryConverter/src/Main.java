import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int number, i = 0;
		int rest[] = new int[1000];
		Scanner sc = new Scanner(System.in);

		number = sc.nextInt();

		while (number != 0) {
			rest[i] = number % 2;

			number = number / 2;

			i++;

		}
		System.out.println("Binary: ");
		
		for(int j = i - 1; j>=0; j--) {
			System.out.print(""+rest[j]);
		}
		
	}

}
