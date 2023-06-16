package day2ndoctARRY;

public class q5ans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {11,32,13,4,5,61,7,98,49};
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
