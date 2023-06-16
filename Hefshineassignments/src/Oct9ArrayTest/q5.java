package Oct9ArrayTest;

public class q5 {

	public static void main(String[] args) {

		int []a= {1,2,3,4,5,6};
		int []b= {5,3,2,1,1,3};
		
	for (int j = 0; j < b.length; j++) {
		if(a[j]<a.length &&b[j]< b.length)
	
			a[j]=b[j];
	}
System.out.println("same");
		
	
	}

}
