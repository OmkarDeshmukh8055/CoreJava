package arrayRecursion;

public class findArrayEle {

	public static void main(String[] args) {

			int a[]= {1,2,3,5,6};
			int num=5;
			int i=0;
		i(a,i,num);
	}

	private static void i(int[] a, int i, int num) {

if(i<a.length)
{
	if(a[i]==num)
	{
		System.out.println(a[i]+" find at index"+i);
	}
	i(a, i+1, num);
}
	}

}
