package array;

import java.util.Arrays;

public class mergeArrayChovanSir{

	public static void main(String[] args) {

int a[]= {1,2,3,4,6};
int b[]= {11,12,1,21,1};
int bindex=0;
		int c[]=new int [a.length+b.length];
		for(int i = 0; i < c.length; i++)
		{
			if(i<a.length)
				c[i]=a[i];
			else
				c[i]=b[bindex++];
         }
System.out.println(Arrays.toString(c));
	}

}
