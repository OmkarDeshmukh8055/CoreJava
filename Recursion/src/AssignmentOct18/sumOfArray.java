package AssignmentOct18;
public class sumOfArray {

	public static void main(String[] args) {
int a[]= {1,2,2,3};
int i=0;
int sum=0;
myaddition(a,i,sum);
	}

	private static void myaddition(int[] a, int i, int sum) {
if(a.length>i)		
{
	sum=sum+a[i];
	myaddition(a,i+1,sum);
}

else
{
	System.out.println(sum);
}
	}

}
