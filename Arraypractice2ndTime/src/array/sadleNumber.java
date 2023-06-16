package array;


public class sadleNumber {

	public static void main(String[] args) {
		
		int a[][]= {{6,3,1},
				{9,7,8},
				{2,4,5}};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++)
			{
				int small=0;
				int large=0;
				for (int k = 0; k < a.length; k++) 
				{
					for (int k2 = 0; k2 < a.length; k2++) 
					{
						if(i==k && a[k][k2]<a[i][j])
						{
						
								small++;
						}
							if(j==k2 && a[k][k2]>a[i][j])
							{
								large++;
						    }
					}
				}
				if(small==0 && large==0)
				System.out.println(a[i][j]);
			}
		}
	}
}