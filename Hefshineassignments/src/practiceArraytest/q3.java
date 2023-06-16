package practiceArraytest;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {1,2,4,6,7,3};

int max=0;
for (int i = 0; i < a.length; i++)
{

if(max<a[i])
	max=a[i];
}
System.out.println(max);
//sencond max
	int max2=0;
	for (int i = 0; i < a.length; i++) 
	{			
if(max!=a[i] && max2<a[i] )
	max2=a[i];
	}
	System.out.println(max2);
	//3rd max
	int max3=0;
	for (int i= 0; i< a.length; i++) {
	
	if(max!=a[i] && max2!=a[i])
		max3=a[i];
	}
	System.out.println(max3); 
	}
}
