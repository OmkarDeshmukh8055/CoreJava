package testOct23;

public class Q1 {

	public static void main(String[] args) {
double unit=230;
double bill =0;
double totalbill=0;
if(unit<50)

	bill=unit*(0.5);

	else if(unit<150)
	{
      bill=50*0.5+(unit-50)*0.75;
	}
	else if(unit<250)
	{
		bill=(50*0.5)+(100*0.75)+(unit-150)*1.2;
	}
	else 
	{
		bill=(50*0.5)+(100*0.75)+(100*1.2)*1.5;
	}
totalbill=bill*1.2;

System.out.println(totalbill);
	}
}
