package cw2;

public class myClass {

	public static void main(String[] args) {
		//single inheritance
		System.out.println("single inheritance");

		childClass1 c=new  childClass1();
		c.add();
		c.sub(10, 5);
		
		//multileve inheritance

		System.out.println("multileve inheritance");
		childClassChild cc=new childClassChild();
		cc.add();
		cc.sub(10, 10);
		cc.display();
		
		//hirachical inheritance
		System.out.println(" hirachical inheritance");

		childClass2 c1=new childClass2();
		c1.add();
		c1.print();

	}

}
