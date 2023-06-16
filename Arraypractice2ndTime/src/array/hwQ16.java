package array;

public class hwQ16 {

	public static void main(String[] args) {

		int a[] = { 11, 22, 33, 44, 5, 55, 110, 77, 99 };
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) 
		{
			//max find
			if(a[i]>max)
				max=a[i];
			//min find
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("max "+max);
		System.out.println("min "+min);
		System.out.println("Diff "+(max-min));
	}

}
