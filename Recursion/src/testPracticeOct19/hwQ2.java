package testPracticeOct19;

public class hwQ2 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5, 4 };
		int i = 0;
		int num = 8;
		print(a, i, num);
	}


private static void print(int[] a, int i, int num) 
{

	if (a.length > i)
	{
		if (a[i] == num) 
			System.out.println("found "+i);
		
		else
			print(a, i + 1, num);

	}
	else
		System.out.println("not found");
	
}


}
