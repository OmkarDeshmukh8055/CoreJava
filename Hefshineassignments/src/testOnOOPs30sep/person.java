package testOnOOPs30sep;

public class person {
String Pname;
int addharnumber;
String Pjobname;
String jobId;
String jobLocation;

address a=new address(123,"pune","MHA","india");

person(String Pname,int addharnumber,String Pjobname,String jobId,String jobLocation)
{
	this. Pname=Pname;
	this. addharnumber=addharnumber;
this. Pjobname=Pjobname;
	this. jobId=jobId;
	this. jobLocation=jobLocation;

}
void DisplayPersonDetaila()
{
	System.out.println(Pname+addharnumber+Pjobname+jobId+jobLocation);
}
}
