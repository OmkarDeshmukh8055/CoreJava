package sundayOct10array;

public class indexevenodd 
{

	public static void main(String[] args)
	{
       int []a= {1,2,34,5,67,8,6543,22,67543,3,56,7};
       
       int evencount=0;
           
      for (int i = 0; i < a.length; i++) 
      {
		if(a[i]%2==0)
			evencount++;
		
   	  }
      int []even=new int [evencount];
      int []odd=new int [a.length - evencount];
      int j=0; int k=0;
   
      for (int i = 0; i <a.length; i++) 
      {
		if(a[i]%2==0) {
			even[j++]=a[i];
		}
		else {
			
					odd[k++]=a[i];
		}
			
	  }
      System.out.println("even");
      for (int i = 0; i < even.length; i++) 
      {
		System.out.println(even[i]);
	 }
      System.out.println("odd");
      for (int i = 0; i < odd.length; i++) 
      {
		System.out.println(odd[i]);
	 }
	
	}

}
