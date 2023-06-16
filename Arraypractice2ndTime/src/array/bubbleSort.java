package array;import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {

int a[]= {1,9,2,8,5,3,7,4,0};

for (int i = 0; i < a.length; i++)
{
	for (int j = 0; j < a.length-1; j++) 
	{
		if(a[j]>a[j+1])
		{
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
					
		}
	}
}
System.out.println(Arrays.toString(a)); 

	}

}
