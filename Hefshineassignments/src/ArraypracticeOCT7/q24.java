package ArraypracticeOCT7;

public class q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,2,3,4,5};
//rotate right side
int temp=a[a.length-1];

for (int i =a.length-2;i >=0; i--) 
{
a[i+1]=a[i];
}
a[0]=temp;

	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	
	
	//rotate left side
	int []b= {6,1,2,3,4,5};
	
	int temp1=b[0];
	
	for (int i = 0; i < b.length-1; i++) 
	{
		b[i]=b[i+1];
	}
	b[b.length-1]=temp1;
	for (int j = 0; j < b.length; j++)
	{
	
	System.out.print(b[j]+" ");
	}
	}
	
	
}

	

