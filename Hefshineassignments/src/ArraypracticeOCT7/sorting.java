package ArraypracticeOCT7;

public class sorting {

	public static void main(String[] args) {
int []a= {1,4,6,7,5,3,2};


for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a.length; j++) {
		
		//change only >  or < set ascending  and disending  arrray
		if(i<j && a[i]>a[j])
		{
			
	int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	     }
     }
}
   for (int k = 0; k < a.length; k++) 
	{	
System.out.print(a[k]);
	
	}
}}
