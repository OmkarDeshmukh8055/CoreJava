
public class withoutReturn {

	public static void main(String[] args) {
int []a= {3,5,7,9};

int i=0;
int sum=0;
myAddition(a,i,sum);
	}

	private static void myAddition(int[] a, int i, int sum) 
	{
		if(i<a.length)
		{
		
		sum=sum+a[i];
		myAddition(a,i+1,sum);
		}
		else
		{
			System.out.println(sum);
		}
		
	}

}
