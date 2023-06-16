package Oct9ArrayTest;

public class q6 {

	public static void main(String[] args) {
int []a= {1,2,3,4,5,6,7,8};
for (int i = 0; i < a.length; i++) {
	int j=a.length-1;
	
      a[i]=a[j];
	 a[i]=a[j]+a[i];
		a[j]=a[j]-a[i];
		a[j]=a[i];
}
for (int j = 0; j < a.length; j++) {
	
	System.out.print(a[j]);	
	
		
}
	}

}
