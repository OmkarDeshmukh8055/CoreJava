package zprePractice1;

public class Compound_Interest {

	public static void main(String[] args) {
		int p=2000;
		int n=12;
		int t=5;
		double r=0.08;
		
		double b=n*t;
		double c=1+(r/n);
		double Compound_Interest=p*Math.pow(c,b);
		System.out.println(Compound_Interest);
	}

}
