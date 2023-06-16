package dec6;

public class palendromNum {

	public static void main(String[] args) {

		int num=1345431;
		int temp=num;
		int newNum=0;
		
		while(num>0)
		{
			int digit=num%10;
			newNum=newNum*10+digit;
			num=num/10;
		}
		if(temp==newNum)
		{
			System.out.println("pal"); 
		}
		else
		{
			System.out.println("not");
		}
	}

}
