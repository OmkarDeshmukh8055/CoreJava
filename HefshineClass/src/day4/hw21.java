package day4;

public class hw21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=99;
		
	int num1=num;
	int noOfDigit=0;
	while(num1>0)
	{
		noOfDigit++;
		num1=num1/10;
	}
	int sq=num*num;
		
	
	int d=(int)Math.pow(10, noOfDigit);
	int firstpart=sq/d;
	int secpart=sq%d;
	
	if(firstpart+secpart==num) 
		System.out.println("kaprakar num");
		else
			System.out.println("not kaprakar num");
	}
	
	}

	


