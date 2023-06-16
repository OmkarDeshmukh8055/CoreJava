package day16Oct4Array;

public class duplicatefind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {1,2,2,3,4,5,3,2,5};

int count=0;
for (int i = 0; i < a.length; i++) 
{
	for (int j = i+1; j < a.length; j++) 
	{
		
	
	if(a[i]==a[j])
		{
		count++;
		break;
		
		}
	}
}
System.out.println(count);
	}

}
