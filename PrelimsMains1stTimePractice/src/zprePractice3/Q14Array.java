package zprePractice3;

public class Q14Array {

	public static void main(String[] args) {

		int a[]= {1,2,3,4};
		int b[]= {1,2,3,1};
		if(a.length==b.length)
		{	
			boolean	No_Dup=true;
			for (int i = 0; i < b.length; i++) 
			{
				if(a[i]!=b[i])
				{
					No_Dup=false;
					System.out.println("ele not equal");
					break;
				}
			}
			if(No_Dup)
				System.out.println("Equal");
		}
		else
			System.out.println("length is not equal");

	}

}
