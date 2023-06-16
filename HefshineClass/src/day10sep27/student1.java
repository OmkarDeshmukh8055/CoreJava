package day10sep27;

public class student1 {
int rn;
int  marks;
String name;
public student1(student1 s)

{
	this.rn=s.rn;
	this.marks=s.marks; 
	this.name=s.name;
		
	}
public student1(int rn,String name,int marks)
{
	this.rn=rn;
	this.name=name;
	this.marks=marks;
}
public void print()
{
	System.out.println(rn+" "+name+" "+marks);
}
}
