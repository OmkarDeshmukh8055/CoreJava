package erpQue;

public class SumOfArrays {

	public static void main(String[] args) {

		int a[]= {1,43,99,4,13,67};
		double sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
		double avg=sum/a.length;
		System.out.println(avg);
		
	}

}
