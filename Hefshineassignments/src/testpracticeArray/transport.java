package testpracticeArray;

public class transport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a= {{1,2,3}
        ,{4,5,6},
         {7,8,9}};
int[][]b=new int[3][3];
for (int i = 0; i < b.length; i++) 
{
	for (int j = 0; j < b.length; j++) 
	{
		
		b[i][j]=a[j][i];
		
	}
}
for (int i = 0; i < b.length; i++) 
{
	for (int j = 0; j < a[i].length; j++) 
	{
		System.out.print(b[i][j]+" ");
	}
System.out.println();
	}	
	}
}
