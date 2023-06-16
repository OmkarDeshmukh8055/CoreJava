package testpracticeArray;



public class sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {1,5,3,9,7,6,4,8,2};
int temp=0;
for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a.length; j++) {
		
		if(i<j && a[i]>a[j])
		{
			temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	} }
}for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]);
}
	}

}
