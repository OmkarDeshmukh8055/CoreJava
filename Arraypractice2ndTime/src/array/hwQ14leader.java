package array;

public class hwQ14leader {

	public static void main(String[] args) {

		 int a[]= {111,9,3,24,7,15,1};
		 for (int i = 0; i < a.length; i++) 
		 {	
			 int cnt=0;

			for (int j = i+1; j < a.length; j++) 
			{
				if(a[j]>a[i])
				{
					cnt++;
				}
			}
				if(cnt==0)
					System.out.println(a[i]);
			
		}
	}

}
