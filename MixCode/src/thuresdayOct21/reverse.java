package thuresdayOct21;

public class reverse {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7,8};
		int j=a.length-1;
		reverse(a,0,j);
	
	}

	private static void reverse(int[] a, int i,int j) 
	{
		if(i<a.length)
		{
			if(j<a.length)
			{
				int temp=0;
		
			 temp=a[i];
			 a[i]=a[j];
			 a[j]=temp;
		reverse(a,--i,++j);
			}
			else
			{
				int index=0;
				element(a,index);
			}
		
		}
	
	}

	private static void element(int[] a, int index) {
		
		if(index<a.length)
		{
System.out.println(a[index]+" ");				
element(a,++index);	
		}
		
	}

}
