package day2ndoctARRY;

public class q4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int []a= {12,44,34,65,76};
	int []b=new int [a.length];
		int i=0;
		int j=0;

	while(i<a.length && j<b.length) {
			b[i]=a[i];
	i++;
		j++;
		
	}a=b;
	for (int k = 0; k < b.length; k++) {
			System.out.println(b[k]);
		}

	}

}
