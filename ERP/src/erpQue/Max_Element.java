package erpQue;

public class Max_Element {

	public static void main(String[] args) {
		int a[]= {1,9,2,55,7,12};
		
		if(a.length>0)
		{
		int max=a[0];
		int maxIndex=0;
		for (int i = 0; i < a.length; i++)
		{
			if(max<a[i])
			{
				max=a[i];
				maxIndex=i;
			}
		}
		System.out.println(max);
		System.out.println(maxIndex);
		}
		else
			System.out.println("Array is empty");
	}

}
