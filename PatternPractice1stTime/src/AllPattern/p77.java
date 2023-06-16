package AllPattern;

public class p77 {

	public static void main(String[] args) {

		int count = 1;
		for (int i = 0; i < 5; i++) {
			int count2 = count;
			int diff = 4;

			for (int j = 0; j < 5; j++) {
				if (j - i <= 0)
				{
					System.out.print(count2+" ");
				count2 = count2 + diff;
				diff--;
				}
				else
				{
					System.out.print(" ");
				}

			}

			System.out.println();
			count++;
		}
	}

}
