package ObjectCreate;

import java.util.Scanner;

public class calculator {
 
 int a;
 int b;
 
 
public calculator(int a, int b) {
	super();
	this.a = a;
	this.b = b;
}
public void add()
{   

	System.out.println("add "+(a+b));
}
public void sub()
{   

	System.out.println("sub "+ (a-b));
}

public void mul()
{   
	System.out.println("multi "+(a*b));
}
public static void main(String[] args) {
  
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value");
	int a=sc.nextInt();
	int b=sc.nextInt();
calculator cal=new calculator(a,b);
cal.add();
cal.sub();
cal.mul();

}
}
