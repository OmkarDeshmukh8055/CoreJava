package testpracticeArray;

public class q24again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {12,34,56,87,98,9,65,45,23,45,5};

int temp=a[0];

for (int i = 0; i < a.length-1; i++) {
	a[i]=a[i+1];
	
}
a[a.length-1]=temp;

for (int i = 0; i < a.length; i++) {
	System.out.print(a[i]+" "); 
} }


}
