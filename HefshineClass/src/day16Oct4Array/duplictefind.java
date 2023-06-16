package day16Oct4Array;



public class duplictefind {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {2,2,2,4,4,4,4,4,2,6,6,6,6,6,6,6};
		
		int count=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					count++;
					break;
				}
			}
		}
		int []b=new int[a.length-count];
		int k=0;
		for (int i = 0; i < a.length; i++) {
			int num=a[i];
			int countInB=0;
		
			for (int j = 0; j < b.length; j++)
			{
						if(b[j]==num)
					countInB++;
			}
			if(countInB==0)
			{
			b[k]=num;
			k++;
			
			}}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		
			}
		}
	}
	


