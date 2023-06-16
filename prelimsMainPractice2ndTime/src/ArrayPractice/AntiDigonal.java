package ArrayPractice;

public class AntiDigonal {

	public static void main(String[] args) {

int a[][]= {{1,2,3,4},
		   {4,3,2,1},
		  {5,6,7,8},
		 {4,3,2,1}};
int sum=0;
int count=0;
for (int i = 0; i < a.length; i++) 
{
	for (int j = 0; j < a.length; j++) 
	{
		if(j+i!=3 && j-i!=0)
		{
			System.out.print(a[i][j]+" ");
		sum=sum+a[i][j];
		count++;
		}
		else
			System.out.print(" ");
	}
	System.out.println();
}
	
	System.out.println("sum " +sum);
	System.out.println("count "+count);

	}

}
