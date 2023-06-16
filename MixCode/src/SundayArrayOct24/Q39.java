package SundayArrayOct24;import java.util.Arrays;

public class Q39 {

	public static void main(String[] args) {
		int a[]= {1,1,1,1,1,2,2,3,4};
		int b[]= {1,2,2,4};
		
		for (int i = 0; i < b.length; i++) 
		{ 
			int count=0;
		    for (int j = 0; j < a.length; j++)
		    {
				if(a[j]==b[i])
				
					count++;
					if(count==2)
						break;
		    }
			int[] c=new int [a.length-count];
			 int removecount=0;
			int index=0;
			
					for (int k = 0; k < a.length; k++) 
					{ 
						 if(a[k]!=b[i] || removecount>=2)
						 {
							 c[index++]=a[k];
						 }
						 else
							 
							 removecount++;
					}
			     a=c;
			    
			}
		    for (int j = 0; j < a.length; j++)
		    {
				System.out.println(a[j]+" ");
			}
		
	}

}
