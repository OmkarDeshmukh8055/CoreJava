package day2ndoctARRY;

public class minimum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,2,9,7,66};

int min=a[0];
for (int i = 0; i < a.length; i++) {
	if(min>a[i])
		min=a[i];
	
}System.out.println(min);
	}

}
