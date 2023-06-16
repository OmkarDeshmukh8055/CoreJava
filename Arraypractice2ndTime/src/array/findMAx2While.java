package array;

public class findMAx2While {

	public static void main(String[] args) {

int a[]= {1,2,34,4,5,6,7};
int max=Integer.MIN_VALUE;
int i=0;
while( i<a.length)
{
	if(max<a[i])
		max=a[i];
	i++;
}
System.out.println(max);


int max2=Integer.MIN_VALUE;
int j=0;
while( j<a.length)
{
	if(max!=a[j] && max2<a[j])
		max2=a[j];
	j++;
}
System.out.println(max2);


	}

}
