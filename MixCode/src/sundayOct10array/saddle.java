package sundayOct10array;

public class saddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{6,3,1},
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
						if(k2==j)
						{
							if(a[i][j]<a[k][k2])
								large++;
					    }
						if(k==i)
						{
							if(a[i][j]>a[k][k2])
								small++;									
						}
				}
			}
			 if(small==0 && large==0)
				 System.out.println(a[i][j]);
		  } 	
		}
	}

}
