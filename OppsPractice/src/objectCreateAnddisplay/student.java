package objectCreateAnddisplay;

public class student {


int rn;
String name;
long Contact;
double marks;

public void information(int Rollnum,String Studentname,long ContactNo,double mark)
{
  rn=Rollnum;
  name=Studentname;
  Contact=ContactNo;
  marks=mark;
}	
public void Display()
{
	System.out.println("rn: "+rn+"\nname: "+name+"\ncontactNum: "+Contact+"\nmark: "+marks);
}
}
