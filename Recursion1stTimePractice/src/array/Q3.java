package array;

import java.util.Arrays;

public class Q3 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,7,8};
		int num=4;
		int b[]=new int [a.length-1];
		int index=0;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]!=num)
				b[index++]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}

}
