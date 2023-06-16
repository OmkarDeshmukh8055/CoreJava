package day9;

public class cq1 {
int rollnumber;
String name;
int contactnumber;
int marks;
void input(int rn,String name,int contactnumber,int marks)
{
	rollnumber=rn;
	this.name=name;
	this.contactnumber=contactnumber;
	this.marks=marks;
	
	
	}
void display()
{System.out.println(rollnumber+" "+name+" "+contactnumber+" "+marks);

}
}
