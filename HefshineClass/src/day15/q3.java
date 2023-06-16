package day15;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int []a= {1,2,3,4,5,6,4,4,4,4,4,6,7	};
		
		int count=0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==4)
				count++;
		}
			int newsize=a.length-count;
			int[] b=new int[newsize];
			int i=0,j=0;
			while(i<a.length && j<b.length )
			{
				if(a[i]!=4)
				{
					b[j]=a[i];
					j++;
				}
				i++;
			}
			a=b;
			for (int j2 = 0; j2 < b.length; j2++) {
				System.out.println(a[j2]);
				
			}
			
		}
			
		}
		


