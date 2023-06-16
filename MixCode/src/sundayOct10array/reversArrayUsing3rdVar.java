package sundayOct10array;

public class reversArrayUsing3rdVar {

	public static void main(String[] args) {
 
		int []a= {1,2,3,4,5,6,7,8};
		
			int temp=0;
		
		for (int i = 0; i < a.length; i++) 
		{
		for (int j = i+1; j < a.length; j++) 
		{
			if(i<j && a[i]<a[j])
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
						
		}	
		System.out.println(a[i]);
		}
	}

}
