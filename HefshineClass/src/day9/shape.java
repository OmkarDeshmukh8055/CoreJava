package day9;

public class shape {
	void area(int side) {
		
		System.out.println(side*side);
	}
	void area(int l,int b) {
		
		 int rectangle=l*b;
		System.out.println(rectangle+l*b);
	}
	void area(int a,int b,int c) {
		
		int trangle=a*b*c;
		System.out.println(trangle+"trangle");
	}

}
