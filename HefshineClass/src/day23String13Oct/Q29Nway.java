package day23String13Oct;

public class Q29Nway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] sa = { "abccd", "aaaa", "abc", "ht", "askkkkds", "a", "cccccdddd", "freghuykjhkhff" };

		for (String s : sa) {
			System.out.println(s);
		}

		for (int i = 0; i < sa.length; i++) {
			for (int j = i + 1; j < sa.length; j++) {
				if (sa[i].length() > sa[j].length()) {
					String temp = sa[i];
					sa[i] = sa[j];
					sa[j] = temp;
				}
				// alphabatically sort because if same length that time sort on alphabate base
				else if (sa[i].length() == sa[j].length()) {
					String temp = sa[i];
					sa[i] = sa[j];
					sa[j] = temp;

				}

			}
		}
		System.out.println();
		System.out.println("after");
		System.out.println();
		for (String s : sa) {
			System.out.println(s);
		}

	}

}
