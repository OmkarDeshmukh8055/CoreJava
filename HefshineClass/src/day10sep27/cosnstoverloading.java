package day10sep27;

public class cosnstoverloading {

	
		int rn;
		String name;
		int marks;
		cosnstoverloading(int newrn)
		{
			rn=newrn;
		
		
		}
		
		cosnstoverloading(int newrn,String newname)
		{
			rn=newrn;
			name=newname;
		
		}
		
		
		cosnstoverloading(int newrn,String newname,int newmarks)
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


