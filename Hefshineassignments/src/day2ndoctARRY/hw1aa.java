package day2ndoctARRY;

public class hw1aa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {11,22,33,444,444,5,6,7};
		int num=33;
		int counter = 0;
		int index=0;
		for (int i = 0; i < a.length; i++) {
		 	
		if(a[i]==num)
		{
		counter++;
		index=i;
		break;
		}
		}
		if(counter==0) {
			System.out.println("not found");}
		else {
		System.out.println("index found "+index);
		}

	}

}
