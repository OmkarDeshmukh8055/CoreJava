package testPracticeOct19;

public class sorting {

	public static void main(String[] args) {
     
		int a[]= {1,23,4,5,6,7};
		sort(a,0);
	}

	private static void sort(int[] a, int i) {
     
		if(i<a.length)
		{
			int j=i+1;
			loopj(a,i,j);
			sort(a,i+1);
		}
	}

	private static void loopj(int[] a, int i, int j) {
          
		if(j<a.length)
		{
			if(a[i]>a[j])
			{
			int	temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
			
		}
		System.out.println(a[i]);
	}

}
