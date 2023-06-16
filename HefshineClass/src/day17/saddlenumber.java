package day17;

public class saddlenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{6,3,1},
				   {9,7,8},
				   {2,4,5}};

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				int smallele=0;
				int largeele=0;
				
				for (int k = 0; k < a.length; k++)
				{
					for (int k2 = 0; k2 < a.length; k2++)
					{
						
						if(k==i)
						{	
						if(a[k][k2]<a[i][j])
						
							smallele++;
							}
						else
						
							if(k2==j)
							{
								if(a[k][k2]>a[i][j])
									largeele++;
							}
					}
				}if(smallele==0 && largeele==0)
					System.out.println(a[i][j]);
			}
		}
	}}


