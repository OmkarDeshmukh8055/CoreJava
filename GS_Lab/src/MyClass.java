import java.util.Arrays;

public class MyClass {
     //StartOfMainMethod
	public static void main(String[] args) {
		int[] a={1,2,3,4,5,6,7,8};
		int index=0;
		int[] b=new int[a.length];
		 evenodd(a,index,b);
	
		 System.out.println();
	}//EndOfMainMethod

	private static void evenodd(int[] a, int index, int[] b) {
		
       //code here
		int bi=0;
	for (int i = 0; i < b.length; i++) 
	{
		if(a[i]%2==0)
			b[bi++]=a[i];
	}
	for (int i = 0; i < b.length; i++) 
	{
		if(a[i]%2!=0)
			b[bi++]=a[i];
	}
	System.out.println(Arrays.toString(b));
	}

}
