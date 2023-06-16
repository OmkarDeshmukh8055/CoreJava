package day15;

public class myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a= {1,2,3,4,5,6};

for (int i = 0; i < a.length; i++) {
	
	if(a[i]!=4)
		System.out.println(a[i]);
	
}
System.out.println("again print because above code for hide a element not remove ");
for (int j = 0; j < a.length; j++) {
	

System.out.println(a[j]);
}
	}

}
