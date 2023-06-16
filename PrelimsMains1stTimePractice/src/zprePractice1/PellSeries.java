package zprePractice1;

public class PellSeries {

	public static void main(String[] args) {

		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < 11; i++) 
		{
			int pellS=a+b*2;
			a=b;
			b=pellS;
			System.out.println(pellS);
		}
	}

}
