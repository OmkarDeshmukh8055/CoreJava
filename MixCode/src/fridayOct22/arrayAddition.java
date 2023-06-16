package fridayOct22;



public class arrayAddition {

	public static void main(String[] args) {

		int[] a= {1,2,3,10,5,6,7,8,9,7};
		int j=a.length-1;
		for (int i = 0; i < a.length/2; i++)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			j--;
		}
		
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
    }

}
