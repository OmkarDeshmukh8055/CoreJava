package array;

public class Q10 {

	public static void main(String[] args) {
int a[][]= {{1,2,4},
		    {1,5,3}};
int max=Integer.MIN_VALUE;

for (int i = 0; i < a.length; i++)
{
	for (int j = 0; j < a.length; j++) 
	{
		if(a[i][j]>max)
			max=a[i][j];
	} 
} 
System.out.println(max);
	}

}
