package day15;

public class myclass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6};
	
		
		int []b=new int[a.length-1];
		int i=0;int j=0;
		
		while(i<a.length&&j<b.length)
		{
		if(a[i]!=4)
		{
			b[j]=a[i];
					j++;
		}
		i++;
		}
		for (int j2 = 0; j2 < b.length; j2++) 
		{
			System.out.println(b[j2]);
		}
	
			
	}
	
}
