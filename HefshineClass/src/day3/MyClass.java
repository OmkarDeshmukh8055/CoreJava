package day3;

public class MyClass
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int units=30;
		bill(units);
	}
	//EndOfMainMethod
	private static void bill(int units) 
	{
		//code here
	double bill=0;
		if(units<=50) 
		bill=units*0.5;
		else if (units<=150)
		bill=(50*0.5) + ((units-50)*0.75);
		else if (units<=250)
		bill=(50*0.5) +(100*0.75)+((units-150)*1.2);
		else
		bill=(50*0.5)+(100*0.75)+(100*1.2)+((units-250)*1.5);
		double finallbill =1.2*bill;
		System.out.println(finallbill);
	}
}