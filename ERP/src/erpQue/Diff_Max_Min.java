package erpQue;

public class Diff_Max_Min {

	public static void main(String[] args) {
		int a[]= {11,9,2,55,7,12};
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++)
		{
			if(max<a[i])
				max=a[i];
			if(min>a[i])
				min=a[i];
		}
		System.out.println("Diff "+(max-min));
		
	}

}
