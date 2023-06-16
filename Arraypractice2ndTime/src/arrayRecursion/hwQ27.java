package arrayRecursion;import java.util.Arrays;

public class hwQ27 {

	public static void main(String[] args) {

		char a[] = { 'a', 'b', 'c', 'd' };
		char b[] = { 'v', 'w', 'x', 'y', 'z' };
		char[] c = new char[a.length + b.length];
		int index = 0;
		int i = 0;

	char c1[]=i(a, b, index, c, i);
	System.out.println(Arrays.toString(c1 ));

	}

	private static char[] i(char[] a, char[] b, int index, char[] c, int i) 
	{

		if(i<a.length|| i<b.length)
		{
			if(i<a.length)
			c[index++]=a[i];
			if(i<b.length)
			c[index++]=b[i];
		return	i(a, b, index, c, i+1);
			
		}
		return c;
	}

}
