package day9;

public class accountMgnt {
int accountno;
String name;
int accountbalance;
void insertdata(int accountno,String name,int accountbalance)

{
	this.accountbalance=accountbalance;
	this.accountno=accountno;
	this.name=name;

}
void displayData()
{
	System.out.println("a/cno "+accountno+" "+"name "+name+" "+"a/c balance "+accountbalance);	
}
void depositeamount(int deposit)
{
	
	accountbalance=accountbalance+deposit;	
	System.out.println("a/c bal "+accountbalance);
	}
void withdrawAmount(int withdrow)
{
accountbalance=accountbalance-withdrow;	
System.out.println("a/c bal "+accountbalance);	
}
void accountbalance()
{
System.out.println("currentbalnce "+accountbalance);	
}
}


