package day14Oct1Array;

public class array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={21,24,24,23,78,88};

		int num=2454;
		int counter=0;

		for (int i = 0; i < a.length; i++) 
		{
			if( a[i]==num) {
				counter++;
			System.out.println("found at index "+i);
			
		}}
			

		if (counter==0)

			System.out.println("not found");
	

		}}

	


