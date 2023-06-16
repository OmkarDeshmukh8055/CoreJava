package day10sep27;

public class vehicle {

	String color="black";
	int wheelcount=4;
	int gearscount=5;
	
	vehicle()
	{
		System.out.println(color+" "+wheelcount+" "+gearscount);
	}
	
	
	
	vehicle(String color,int wheelcount)
	{
		this();
		this.color=color;
		this.wheelcount=wheelcount;
		System.out.println(color+" "+wheelcount+" "+gearscount);
	}

}
