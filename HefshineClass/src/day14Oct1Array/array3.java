package day14Oct1Array;

public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={21,24,23,78,88};

		int num=23;
		int counter=0;
		int index = 0;

		for (int i = 0; i < a.length; i++) {
			if( a[i]==num) {
				counter++;
			index=i;
			break;
			
			}
		}
		

		if (num==0)

			System.out.println("not found");
			else
				System.out.println("found "+index); 

		}
	
	
}
