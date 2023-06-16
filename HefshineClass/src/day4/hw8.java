package day4;

public class hw8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12321;
		int num1=num;
		int num2=0;
		while(num1>0) {
			int lastdigit=num1%10;
			
			num2=num2*2+lastdigit;
			num1=num1/10;
		}
		if(num==num2)
			System.out.println("panderm");
		else System.out.println("not");

	}

}
