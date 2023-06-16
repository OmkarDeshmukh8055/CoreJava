package day18;



public class sortingAssending {

	public static void main(String[] args) {
		int []a= {12,70,24,44,56,53,76};
	
		for (int i = 0; i < a.length; i++)
		{
			int min=i;
			for (int j = i+1; j < a.length; j++) {
				
				if(a[j]<a[min])
					min=j;
				
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for (int i = 0; i < a.length; i++) {
			
		
		System.out.println(a[i]+" ");
	}	
}
}
