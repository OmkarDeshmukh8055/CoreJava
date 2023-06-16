package collectionsortcomparable;

public class student implements Comparable<student> {

	int rn;
	String name;
	public student(int rn,String name)
	{
		super();
		this.rn=rn;
		this.name=name;
		
	}

	public String toString ()
	{
		return "student[rn=" +rn+",name= "+name +"]";
	}

	public int compareTo(student s) {
		if(rn>s.rn)
			return 1;
		if(rn<s.rn)
			return -1;
		else
			return 0;
	}
}