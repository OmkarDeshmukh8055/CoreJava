package day2ndoctARRY;

public class hwq3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= { 1,2,5,3,4,5,5,6,7,	};
		 int []b=new int [a.length];
		 
		int i=0;
		int j=0;

		while(i<a.length && j<a.length)
		{

			if(a[i]!=5)
				
			{
		b[i]=a[i];
		j++;
			   } 
			i++;
			
			}a=b;
		for (int k = 0; k < b.length; k++) {
			System.out.println(b[k]);
		}

	}

}
