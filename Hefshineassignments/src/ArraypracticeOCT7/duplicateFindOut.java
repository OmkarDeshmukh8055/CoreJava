package ArraypracticeOCT7;

public class duplicateFindOut {

	public static void main(String[] args) {
int []a= {1,1,1,2,2,2};
		
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
		}//System.out.println(count);
		int []b=new int[a.length-count];
		int k=0;
		for (int i = 0; i < a.length; i++) {
		
			int countInB=0;
		
			for (int j = 0; j < b.length; j++)
			{
						if(b[j]==a[i])
					countInB++;
			}
			if(countInB==0)
			{
			b[k]=a[i];
			k++;
			
			}}
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		
			}

	}

}
