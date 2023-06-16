package day16Oct4Array;

public class sortinaaray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {8,6,9,5,7,3,2,1};
for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a.length; j++) {
		if(i<j && a[i]>a[j]) {
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			
		}
	}
}
for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]);
}
	}

}
