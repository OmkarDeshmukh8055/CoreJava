package array;

import java.util.Arrays;

public class hwQ27 {

	public static void main(String[] args) {

		char a[] = { 'a', 'b', 'c', 'd','e','f' };
		char b[] = { 'v','w', 'x', 'y', 'z' };
		
		int index=0;
		char c[]=new char [a.length+b.length];
		
		for (int i = 0; i <a.length || i<b.length; i++) 
		{
			if(i<a.length)
			c[index++]=a[i];
			if(i<b.length)
			c[index++]=b[i];

		}
		System.out.println(Arrays.toString(c));

	}

}
