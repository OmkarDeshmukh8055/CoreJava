package treenov10;

public class palindrom {

	public static void main(String[] args) {
    
		int num=12321;
		int num1=num;
		int num2=0;
		
		while(num1>0) 
		{
			int lastdigit=num1%10;
			num2=num2*10+lastdigit;
			num1=num1/10;

			
		}
		if(num==num2)
		System.out.println("p");
		else
			System.out.println("n");

	}

}
