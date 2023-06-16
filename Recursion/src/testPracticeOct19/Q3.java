package testPracticeOct19;

public class Q3 {

	public static void main(String[] args) {
      
		int a[] = { 1, 2, 3, 6,4, 5 };
		int i = 0;
         int num=6;
		print(a, i,num);
	}

	private static void print(int[] a, int i,int num) 
	{

		if (a.length > i)
		{
			if(num!=a[i])
					
			System.out.println(a[i]);
			print(a,i+1,num);
		
				
		}
	}

}
