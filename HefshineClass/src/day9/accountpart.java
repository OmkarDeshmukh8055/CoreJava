package day9;

public class accountpart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
accountMgnt xyzbank=new accountMgnt();

xyzbank.insertdata(8055,"sachin shinde",100000);

xyzbank.displayData();
System.out.println();
xyzbank.depositeamount(10000);
System.out.println();

xyzbank.withdrawAmount(30000);
System.out.println();

xyzbank.accountbalance();



	}

}
