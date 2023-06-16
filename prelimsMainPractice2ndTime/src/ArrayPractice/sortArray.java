package ArrayPractice;

public class sortArray {

	public static void main(String[] args) {

int a[]= {11,9,8,3,4,7,5,2,6,0};
for (int i = 0; i < a.length; i++) 
{
	for (int  j=0;j<a.length-1; j++) 
	{
		int temp=a[0];
	     if(a[i]<a[j])
		{
			 temp = a[j];
			 a[j]=a[i];
			 a[i]=temp;
	}
				
	}
}
for (int i = 0; i < a.length; i++) 
{
	System.out.println(a[i]);
}
	}

}
