package testpractice1Oct;

public class staffmember extends departnemnt{
staffmember(String deptname, String HODName) {
		super(deptname, HODName);
		// TODO Auto-generated constructor stub
	}
String membername;
String memberqualification;

void staffmember(String membername,String memberqualification)
{
	this. membername=membername;
	this. memberqualification=memberqualification;

}
void staffmemberdetails()
{
	System.out.println(membername+memberqualification);
}
}
