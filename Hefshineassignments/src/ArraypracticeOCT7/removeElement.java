package ArraypracticeOCT7;

public class removeElement {

	public static void main(String[] args) {

		int []a= {1,2,3,4,5,3,6,7,8,9};
		int num=3;

		

		for (int i = 1; i < a.length; i++) 
		{
			if(a[i]==num)
				a[i]=0;
			
		}
		for (int j = 0; j < a.length; j++) {
			
		
			System.out.print(a[j]);
		}
	
	}
}
