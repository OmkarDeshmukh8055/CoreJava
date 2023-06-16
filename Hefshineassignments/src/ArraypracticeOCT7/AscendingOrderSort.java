package ArraypracticeOCT7;

public class AscendingOrderSort {

	public static void main(String[] args) {
int []a= {12,45,76,8,7,98,54};
int temp=0;
for (int i = 0; i < a.length; i++) 
{
	for (int j = 0; j < a.length; j++)
	{
		if(i<j && a[i]<a[j])
		{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	    }
	}
}
	for (int j2 = 0; j2 < a.length; j2++)
	{
			System.out.print(a[j2]+" ");
		
			
}
	}

}
