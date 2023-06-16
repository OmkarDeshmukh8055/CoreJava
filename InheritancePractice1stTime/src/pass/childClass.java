package pass;

public class childClass extends parentClass{
	int num3 ;
	int num4;


	childClass(int num1, int num2,int num3, int num4) 
	{
		super();
		this.num3=num3;
		this.num4=num4;
		this.num1=num1;
		this.num2=num2;
	}

	
	public void display()
	{
		System.out.println(num3+" "+num4);
	}


}
