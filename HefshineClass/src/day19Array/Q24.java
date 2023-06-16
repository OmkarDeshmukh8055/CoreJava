package day19Array;

public class Q24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {12,23,45,66,44,22};

int j=0;

for (int i = 0; i < a.length; i++)
{
	if(i<j && a[i]>a[j])
	{
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}
	
	if(j==a.length-1)
	{ 
		j=0;
		i++;
		
	}
	else
		j++;
}
for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]+" ");
}
	}

}
