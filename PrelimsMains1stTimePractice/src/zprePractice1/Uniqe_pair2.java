package zprePractice1;

public class Uniqe_pair2 {

	// we can just store uniqe ele but can not print unique ele
	
	public static void main(String[] args) {

		int[] a= {1,1,1,1,111,1,2};
		
		String s=" ";
		int len=0;
		for (int i = 0; i < a.length; i++)
		{	int cnt=0;
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]==a[j])
				{
					cnt++;
					len++;
					break;
				}
			}
			if(cnt==0)
				s=s+a[i]+" ";
		}
	 System.out.println(s);
	}

}
