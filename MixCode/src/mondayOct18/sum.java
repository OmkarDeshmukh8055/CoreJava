package mondayOct18;

public class sum {

	public static void main(String[] args) {

int i=0;
int sum=0;
int[]a= {1,2,3,4};

addition(a,i,sum);
	}

	private static int addition(int[] a, int i,int sum) 
	{
		if(i<a.length)
		{
			sum=sum+a[i];
			return addition(a,i+1,sum);
		}
		return sum;
	}

	

}
