package day10sep27;

public class student {

	int rn;
	String name;
	int marks;
	
		student(int newrn,String newname, int newmarks)
		{
			rn=newrn;
			name=newname;
			marks=newmarks;
		}
		void print()
		{
			System.out.println(rn+" "+name+" "+marks);
		}
	}


