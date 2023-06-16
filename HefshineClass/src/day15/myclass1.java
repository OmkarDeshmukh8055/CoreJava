package day15;

public class myclass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {1,2,3,4,5,6} ;

for (int i = 0; i < a.length; i++) {
	if(a[i]==4)
		a[i]=0;
	
		System.out.println(a[i]);

}
System.out.println("2nd time check");
	

for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]);
}

	}

}
