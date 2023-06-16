package day17;

public class transportmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][]b= {{1,2,3}
           ,{4,5,6},
            {7,8,9}};
int[][]a=new int[3][3];
for (int i = 0; i < a.length; i++)
{
	for (int j = 0; j < a.length; j++) 
	{
		a[i][j]=b[j][i];
		
	}
} 

   for (int i = 0; i < a.length; i++) 
   {
	   for (int j = 0; j < a[i].length; j++)
	   {
		System.out.print(a[i][j]+" ");
	   }
	   System.out.println();
    }


	}

}
