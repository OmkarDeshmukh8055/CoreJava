package testpracticeArray;

public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,3,4,5,6,5,4,3,65,5,6};
		int max=a[0];
		for (int i = 0; i < a.length; i++) {
			
			if (max<a[i]) {
			max=a[i];	
			}
		}	System.out.println(max);
		
		int mini=a[0];
		for (int i = 0; i < a.length; i++) {
			if(mini>a[i])
				mini=a[i];
		}
		
		System.out.println(mini);
		
		
	}

}
