package AssignmentArraylistOct29;

public class myMethod {

int a[]=new int [5];

int index=0;

public void add(int num)
{
	
	for (int i = 0; i < a.length; i++) 
	{
		 int b[]=new int [2*a.length];
		if(i>=index)
		{
			b[i]=a[i];
		}
		b=a;
	}
	a[index++]=num;
}
 
public void start()
{
	for (int i = 0; i < index; i++) {
		System.out.println(a[i]);
	}
}
}
