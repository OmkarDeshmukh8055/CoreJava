package array;

public class Q14 {

	public static void main(String[] args) {

		
		int a[]= {1,9,2,8,3,4,12,3,1};

		for (int i = 0; i < a.length; i++) 
		{			int cnt = 0;

			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]<a[j])
					cnt++;
			} 
			if(cnt==0)
			{
				System.out.println(a[i]);
			}
		}
	}

}
