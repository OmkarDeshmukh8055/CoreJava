package passValueChildToParent;

public class parentClass {
	
	 int num1;
	 int num2;
	
public parentClass(int num1, int num2)
    {
	this.num1=num1;
	this.num2=num2;
	}

public void print()
{
	System.out.println(num1+" "+num2);
}
}
