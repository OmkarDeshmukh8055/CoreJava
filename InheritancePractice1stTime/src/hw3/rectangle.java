package hw3;

public class rectangle  extends Squre{
	
	int length,breadth;


	public rectangle(int side, int length, int breadth) {
		super(side);
		this.length = length;
		this.breadth = breadth;
	}
	public void area()
	{
		int area=2*(length+breadth);
		System.out.println(area);
	}

}
