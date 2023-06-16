package passValueChildToParent;

public class childClass extends parentClass{
	int num3 ;
	int num4;


	childClass(int num1, int num2,int num3, int num4) 
	{
		// pass value through the super
		super( num1, num2);
		this.num3=num3;
		this.num4=num4;
		}

	
	public void display()
	{
		System.out.println(num3+" "+num4);
	}


}
