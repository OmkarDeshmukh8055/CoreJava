package testpracticeArray;

public class sortingagain {

	public static void main(String[] args) {
		
		int []a= {11,14,15,13,12};
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
