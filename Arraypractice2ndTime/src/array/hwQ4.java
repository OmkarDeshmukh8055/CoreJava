package array;

import java.util.Arrays;

public class hwQ4 {

	public static void main(String[] args) {

int a[]= {1,0,9,8,3,4,7};

	int b[]=new int [a.length];
	
	for (int i = 0; i < b.length; i++) 
	{
		b[i]=a[i];
	}
	System.out.println(Arrays.toString(b)); 
	
	}

}
