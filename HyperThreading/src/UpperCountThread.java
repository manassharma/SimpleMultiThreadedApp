public class UpperCountThread extends Thread {
	private String chk;
	private int count = 0;

	public UpperCountThread(String check) {
		chk = check;
	}

	public void run() {
		// int count=0;
		int length;
		length = chk.length();
		char dummy[];
		dummy = chk.toCharArray();
		for (int i = 0; i < length; i++) {
			if (dummy[i] == 'A' || dummy[i] == 'B' || dummy[i] == 'C'
					|| dummy[i] == 'D' || dummy[i] == 'E' || dummy[i] == 'F'
					|| dummy[i] == 'G' || dummy[i] == 'H' || dummy[i] == 'I'
					|| dummy[i] == 'J' || dummy[i] == 'K' || dummy[i] == 'L'
					|| dummy[i] == 'M' || dummy[i] == 'N' || dummy[i] == 'O'
					|| dummy[i] == 'P' || dummy[i] == 'Q' || dummy[i] == 'R'
					|| dummy[i] == 'S' || dummy[i] == 'T' || dummy[i] == 'U'
					|| dummy[i] == 'V' || dummy[i] == 'W' || dummy[i] == 'X'
					|| dummy[i] == 'Y' || dummy[i] == 'Z') {
				count++;
			}
		}
		// System.out.println("Total number of upper case characters = "
		// +count);
	}

	public int uppCount() {
		return count;
	}

}
