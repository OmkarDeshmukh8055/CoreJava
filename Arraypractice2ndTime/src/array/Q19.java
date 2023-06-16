package array;

public class Q19 {

	public static void main(String[] args) {

		int a[][]= {{1,1,1,1,1},
				    {1,2,3,1,1},
				    {1,4,5,1,1},
				    {1,4,5,1,1},
				    {1,1,1,1,1}};
		int cnt=0;
		int sum=0;
		for (int i = 0; i < a.length; i++) 
		{
			 for (int j = 0; j < a.length; j++) 
			 {
				if(i!=0 && i!=a.length-1 && j!=0 && j!=a.length-1)
				{		
					cnt++;
					sum=a[i][j]+sum;
				}
			 }
		}
		 System.out.println(sum);
		 System.out.println(sum/cnt);

	}

}
