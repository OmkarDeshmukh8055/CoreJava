package ArraypracticeOCT7;

public class q26SubarrayAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {3,7,90,20,5,50,40	};
int k=3;
int min=Integer.MAX_VALUE;
int index=0;

for (int i = 0; i < a.length-k+1; i++)
{
	int sum=0;
	for (int j = i; j <i+k; j++) 
	{
		sum=sum+a[j];
		
	}
	int avg=sum/k;

if(avg<min)
{
min=avg;
index=i;
}
}	
System.out.println("index "+index);
System.out.println("min "+min);

	System.out.println("first sub Array");
for (int i = 1; i < index+1; i++) 
{
	
	System.out.print(a[i]+" "); 
	
}
}
	}
