package practice;

public class ArraydupicateFindPrint {

	public static void main(String[] args) {

			int a[]= {1,1,1,1,1,3,4,5,3,3,3,3};
			int cn=0;
		for (int i = 0; i < a.length; i++)
		{
			int count=0;
				//boolean dup=true;
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]==a[j])
				{
					cn++;
					count++;
				//	dup=false;
					break;
				}
			}
			if(count==0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("total duplicate "+cn);
	}

}
