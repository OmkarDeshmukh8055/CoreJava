package sundayOct10array;

public class maxmax2find {

	public static void main(String[] args) {
       
		int a[]= {1,2,3,45,6,3,4,56};
		
		int max=a[0];
		int max2=a[0];
		
		for (int i = 0; i < a.length; i++) 
		{
			if(max<a[i]) 
			{
				max=a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			
		
			if(max!=a[i])
			{
		 if(max2<a[i])
					max2=a[i];
			}
				
		}
		System.out.println(max);
		System.out.println(max2);
	}

}
