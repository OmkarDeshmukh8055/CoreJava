package AllPattern;

public class p37 {

	public static void main(String[] args) {
		int cnt = 0;
		for (int i = 0; i < 6; i++) {
			int cnt1 = cnt;
			int diff = 5;
			for (int j = 0; j < 6; j++) {
				if (j - i <= 0)
					System.out.print((char) (cnt1 + 65));
				cnt1 = cnt1 + diff;

			}
			System.out.println();
			cnt++;

		}
	}

}
