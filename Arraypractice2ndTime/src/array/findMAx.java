package array;

public class findMAx {

	public static void main(String[] args) {

int a[]= {1,2,34,4,5,96,7};
int max=Integer.MIN_VALUE;
for (int i = 0; i < a.length; i++) 
{
	if(max<a[i])
		max=a[i];
}
	System.out.println("max "+max);
	
	int max2=Integer.MIN_VALUE;
	for (int j = 0; j < a.length; j++) {
	
			if(max!=a[j]&& max2<a[j])
				max2=a[j];
		
	}
	System.out.println(max2);
	}

}
