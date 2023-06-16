package ArrayPractice;

public class findSecondmax {

	public static void main(String[] args) {

		int a[] = { 1, 3, 9, 12,5, 6 };
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++)
		{
				if(a[i]>max)
					max=a[i];
		}
		System.out.println(max);
		System.out.println("2nd mAX");
		int max2 = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++)
		{      if(max!=a[i])
		{
				if(a[i]>max2)
					max2=a[i];
		}
		}
		System.out.println(max2);
		
	}

}
