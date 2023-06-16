package sep25oopsQue;

public class student {
int rollnumber;
String name;
int marks;
int contactnumber;
void inputdata(int rn,String name,int contactnumber,int marks)
{
	rollnumber=rn;
	this.name=name;
	this.contactnumber=contactnumber;
	this.marks=marks;
	}
void display()
{
	System.out.println("RN="+rollnumber+" "+"Name="+name+" "+"phoneno="+contactnumber+" "+"marks="+marks);
}

}
