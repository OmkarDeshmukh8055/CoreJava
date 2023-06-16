package sep25oopsQue;

public class accountp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
accountManagement accountinformation=new accountManagement();

accountinformation.insertData(84089," sachin shinde", 150000);

accountinformation.displayData();
accountinformation.depositAmount(10000);
accountinformation.withdrawAmount(120000);
accountinformation.accountBalance();

	}

}
