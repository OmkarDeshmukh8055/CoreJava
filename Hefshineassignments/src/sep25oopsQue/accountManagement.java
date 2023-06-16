package sep25oopsQue;

public class accountManagement {
	int accountnumber;
	String name;
	int accountbalance;
	
	
void insertData(int accountnumber,String name,int accountbalance)
{
	this. accountnumber=accountnumber;
	this. name=name;
	 this.accountbalance=accountbalance;
	
	}
void displayData()
{
System.out.println("a/cno= "+accountnumber+" name= "+name+"  a/cBal ="+accountbalance);
}
void depositAmount(int deposit)
{
	accountbalance=accountbalance+deposit;

}
void withdrawAmount(int withdraw)
{
	if (accountbalance>withdraw)
		System.out.println("succesfully withdrawal amount");
	else
		System.out.println("unsufficient balance");

	accountbalance=accountbalance-withdraw;

}
void accountBalance()
{
	System.out.println("currentBalance "+accountbalance); 
}

}
