package classOct19;

public class ArrayDisendingSorting {

	public static void main(String[] args) {
            int a[]= {1,9,8,5,6,7,4,3,2};
            
            int i=0;
           
            
            sorting(a,i);
            
	}

	private static void sorting(int[] a, int i) 
	{
          
		if(i<a.length)
		{
			int j=i+1;
			sort(a,i,j);
			sorting(a,i+1);
		print(a,i,j);
			
		}
	}

	

	private static void sort(int[] a, int i, int j) 
	{
		if(j<a.length)
		{
            
		if(a[i]>a[j])
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		
		}
		sort(a,i,j+1);
		
		}
		
	}
	private static void print(int[] a, int i, int j) {

System.out.print(a[i]);		
	}

}
