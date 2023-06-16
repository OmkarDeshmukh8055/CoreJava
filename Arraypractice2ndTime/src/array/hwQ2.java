package array;

public class hwQ2 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 6, 7 };
		int num = 4;
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] == num)
				System.out.println("value found "+a[i]+" at index "+i);

		}
		
	}

}
