package AssignmentOct18;
public class minFind {

	public static void main(String[] args) {

		int a[]= {12,21,34,35,2,121};
		int i=0;
		int min =Integer.MAX_VALUE;
		mymin(a,i,min);
				
		
	}

	private static void mymin(int[] a, int i, int min) {
         
		if(i<a.length)
		{
			if(a[i]<min)
				min=a[i];
			mymin(a,i+1,min);
			
		}
		else
		{
			System.out.println(min);
		}
	}



}
