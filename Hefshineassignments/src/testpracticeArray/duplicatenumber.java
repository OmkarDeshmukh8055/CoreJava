package testpracticeArray;

public class duplicatenumber
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
int []a= {1,22,33,44,44,33,22,1,23,33	};

int cnt=0;
for (int i = 0; i < a.length; i++)
{
	for (int j = i+1; j < a.length; j++) 
	{
		a[i]=a[j];
		cnt++;
		break;
	}
}
System.out.println(cnt);
System.out.println();

for (int i = 0; i < a.length; i++) 
{
	int k=0;
	
}


}  
	}
