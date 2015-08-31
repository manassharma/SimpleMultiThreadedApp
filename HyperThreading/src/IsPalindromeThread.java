public class IsPalindromeThread extends Thread {

	String chk;
	char[] strarr;
	int flag = 0;

	public IsPalindromeThread(String check) {
		chk = check;
		strarr = check.toCharArray();
	}

	public void run() {
		String make = "";
		int length = chk.length();
		for (int i = length - 1; i >= 0; i--) {
			make = make + strarr[i];
		}
		System.out.println("Reversed String = " + make);
		if (chk.equals(make)) {
			// System.out.println("The string is a Palindrome");
			flag++;
		} else {
			// System.out.println("The string is not a Palindrome");
			flag = 0;
		}
	}

	public int getFlag() {
		return flag;
	}
}
