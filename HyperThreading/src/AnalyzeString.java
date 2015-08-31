import java.util.Scanner;

public class AnalyzeString {

	public static void main(String args[]) throws InterruptedException {
		System.out.println("Enter the string to assess");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		IsPalindromeThread worker = new IsPalindromeThread(str);
		DigitCountThread worker2 = new DigitCountThread(str);
		UpperCountThread worker3 = new UpperCountThread(str);

		worker.start();
		// worker3.join();

		worker2.start();
		// worker3.join();

		worker3.start();
		// worker3.join();

		// Block to make all threads finish execution before proceeding to print
		// results

		try {
			worker.join();
			worker2.join();
			worker3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Post the wait for all thread execution is complete

		System.out
				.println("Total digits in the string = " + worker2.digCount());
		System.out
				.println("Total number of upper case characters in the string = "
						+ worker3.uppCount());
		int flag = worker.getFlag();

		if (flag > 0) {
			System.out.println("The string is a palindrome");
		} else {
			System.out.println("The string is not a palindrome");
		}
	}

}
