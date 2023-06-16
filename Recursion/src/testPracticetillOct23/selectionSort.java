package testPracticetillOct23;

public class selectionSort {

	public static void main(String[] args) {

    int a[]= {1,2,3,9,8,7,6,5,4};
    
    for (int i = 0; i < a.length; i++) 
    {  
	      for (int j = i+1; j < a.length; j++)
	      {
			if( i<j && a[i]>a[j])
			{
				int temp =a[i];
			a[i]=a[j];
			a[j]=temp;
			}
			
			
		 }	
	      System.out.println(a[i]);

	}
    

	}

}
