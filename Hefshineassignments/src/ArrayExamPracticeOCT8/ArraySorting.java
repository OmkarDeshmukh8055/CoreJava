package ArrayExamPracticeOCT8;

public class ArraySorting {

	public static void main(String[] args) {
int[]a= {1,2,4,6,1,22,3,8,9};

int temp=0;
for (int i = 0; i < a.length; i++) 
{
	for (int j = 0; j < a.length; j++) 
	{
		if(i<j && a[i]>a[j])
		{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
		}
	}
}
for (int i = 0; i < a.length; i++) {
	System.out.print(a[i]+" ");
}
}
	}


