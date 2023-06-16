package Oct9ArrayPractice;

public class mergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,23,5,5,6};
int b[]= {34,5,4,6};
int cnt=0;

int[] c=new int [a.length+b.length];
for (int i = 0; i < a.length; i++) 
{
	c[i]=a[i];
	cnt++;
}
	for (int j = 0; j < b.length; j++)
	{
		c[cnt++]=b[j];
		
	}
	
for (int i = 0; i < c.length; i++) 
{
	
System.out.print(c[i]+" ");	
}
	}

}
