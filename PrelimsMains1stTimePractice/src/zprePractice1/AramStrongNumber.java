package zprePractice1;

public class AramStrongNumber {

	public static void main(String[] args) {
		int num=15;		//1634 ,153
		int digitC=0;
		int num1=num;
		int num2=num;
		
		while(num1>0)
		{
			num1=num1/10;
			digitC++;
		}
		int sum=0;
		while(num2>0)
		{
			int f=num2%10;
			int n=(int) Math.pow(f, digitC);
			sum=sum+n;
			num2=num2/10;
		}
		if(num==sum)
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
