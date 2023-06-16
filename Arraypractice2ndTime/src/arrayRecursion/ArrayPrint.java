package arrayRecursion;

public class ArrayPrint {

	public static void main(String[] args) {

int a[]= {1,2,34,5};
i(0,a);

	}

	private static void i(int i, int[] a) {

if(i< a.length)

{	
	System.out.println(a[i]);

    i(i+1,a);
    }
	
	}

}
