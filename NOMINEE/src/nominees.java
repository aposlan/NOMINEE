import java.util.Scanner;

public class nominees {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Price: ");
		int sum = scan.nextInt();
		CountNominees(sum);
	}

	public static void CountNominees(int sum) {
		int counter = 0;
		int index = 0;
		int[] nominees = { 50, 20, 10, 5, 2, 1 };
		while (sum > 0) {
			if (sum / nominees[index] > 0) {
				sum = sum - nominees[index];
				counter++;
				System.out.println(sum + nominees[index] + "(-" + nominees[index] + " cents" + ") " + "Coins needed: " + counter);
			} else if (index + 1 < nominees.length)
				index++;
			else {
				System.out.println("NO MORE NOMINALS FOR THIS SUM : " + sum);
				break;
			}
		}
		System.out.println();
		System.out.println("Least coins to fulfill price: " + counter);
	}

}