package day2ndoctARRY;

public class q5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {121,32,13,4,5,61,7,98,419};
		int []b=new int[a.length];

	
		int i=a.length-1;
	                	int j=0;
		while(i>=0)
		{
			
			b[j]=a[i];
		i--;j++;
			
		}a=b;
		           for (int k = 0; k < b.length; k++) {
			System.out.println(a[k]);

			}

	}

}
