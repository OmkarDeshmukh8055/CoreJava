package day2ndoctARRY;

public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,34,616,98};

int max=a[0];
for (int i = 0; i < a.length; i++) {
	if(max<a[i])
	{
		max=a[i];
	}
}System.out.println(max);
	}

}
