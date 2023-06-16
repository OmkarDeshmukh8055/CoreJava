package Oct9ArrayPractice;

public class minMaxDiff
{

	public static void main(String[] args)
	{
int a[]= {1,2,3,4,5,3};

int min=a[0],max=a[0], diff=0;

for (int i = 0; i < a.length; i++) 
{
if(min>a[i]) 
{
	min=a[i];

}
 if(max<a[i])
 {
	max=a[i];
}
 diff=max-min;
 
 }
System.out.println(min);
System.out.println();
System.out.println(max);

System.out.println();
System.out.println(diff);

	}
	}

