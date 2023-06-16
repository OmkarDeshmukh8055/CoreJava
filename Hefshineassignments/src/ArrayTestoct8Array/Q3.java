package ArrayTestoct8Array;

public class Q3 {

	public static void main(String[] args) {
int []a= {1,6,8,4,5,9};

int temp=0;
int j=a.length-1;
for (int i = 0; i < a.length; i++) 
{
		if(i<=j)
		{
			
			temp=a[i+1];
		a[i+1]=a[j];
		a[j]=temp;
		
	}
	}

for (int i = 0; i < a.length-1; i++)
{
	System.out.print(a[i]);
	
}
	}

}
