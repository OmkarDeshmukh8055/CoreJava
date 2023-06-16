package day14Oct1Array;

public class day15oct4sortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {11,10,3,4,5,6,7};
for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a.length; j++) {
		if( a[i]<a[j])
		{
			int temp = a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
}
for (int i = 0; i< a.length; i++) {
	
System.out.println(a[i]);
	}}

}
