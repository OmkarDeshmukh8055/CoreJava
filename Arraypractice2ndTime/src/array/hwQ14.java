package array;

public class hwQ14 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 5, 6 };
		int b[] = { 1, 2, 3, 5, 9 };

		if(a.length==b.length)
		{ 
			int diff=0;
			for (int i = 0; i < b.length; i++) 
			{
				if(a[i]!=b[i])
				{
					diff++;
				break;
				}
				
			}
			
		
		if(diff==0)
			System.out.println("same");
		else
			System.out.println("not same by ele");
		}
		else
			System.out.println("Not same by length");
		}

}
