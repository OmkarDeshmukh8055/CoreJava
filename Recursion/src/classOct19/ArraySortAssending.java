package classOct19;

public class ArraySortAssending {

	public static void main(String[] args) {
     int a[]= {1,9,8,7,5,4,3};
     int i=0;
     int j=i+1;
     sortArray(a,i,j);
     for (int j2 = 0; j2 < a.length; j2++) 
     {
		System.out.println(a[j2]+ " ");
	}
     
	}

	private static void sortArray(int[] a, int i, int j) {
		if(i<a.length & j<a.length)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			if(j<a.length-1)
			
				j++;
				else
				{
					i++;
					j=i+1;
				}
			sortArray(a,i,j);
			} 
		}
           
		
	

}
