public class DigitCountThread extends Thread {

	private String chk;
	private int count = 0;

	public DigitCountThread(String check) {
		chk = check;
	}

	public void run() {
		// int count=0;
		int length;
		length = chk.length();
		char dummy[];
		dummy = chk.toCharArray();
		for (int i = 0; i < length; i++) {
			if (dummy[i] == '1' || dummy[i] == '2' || dummy[i] == '3'
					|| dummy[i] == '4' || dummy[i] == '5' || dummy[i] == '6'
					|| dummy[i] == '7' || dummy[i] == '8' || dummy[i] == '9'
					|| dummy[i] == '0') {
				count++;
			}
		}
		// System.out.println("Total number of digits in the string = " +count);
	}

	public int digCount() {
		return count;
	}

}
