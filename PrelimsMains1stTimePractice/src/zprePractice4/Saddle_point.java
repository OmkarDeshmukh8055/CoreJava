package zprePractice4;

public class Saddle_point {

	public static void main(String[] args) {

		int a[][]= {{6,3,1},
					{9,7,8},
					{2,4,5}};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++)
			{
					boolean smallInrow=true;
					boolean largeIncol=true;
					
					for (int k = 0; k < a.length; k++) 
					{
						for (int l = 0; l < a.length; l++)
						{
							if(i==k)
							{
							if(a[i][j]>a[k][l])
								smallInrow=false;
							}
							if(j==l)
							{
							if(a[i][j]<a[k][l])
								largeIncol=false;
							}
						}
					}
					if(smallInrow&& largeIncol)
					{
						System.out.println(a[i][j]);
					}
			}
			
		}
	}

}
