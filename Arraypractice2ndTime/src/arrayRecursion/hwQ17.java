package arrayRecursion;

public class hwQ17 {

	public static void main(String[] args) {

int a[]= {1,0,0,1,0,1,0};


loopi(a,0);
	}

	private static void loopi(int[] a, int i) {

if(i<a.length)
{
	if(a[i]==0)
		a[i]=1;
	System.out.print(a[i]+" ");

	loopi(a,i+1);
}
	}

}
