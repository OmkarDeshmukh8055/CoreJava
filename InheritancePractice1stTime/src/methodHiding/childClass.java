package methodHiding;

public class childClass extends ParentClass {

	public void sub(int a,int b)
	{
		System.out.println(a-b);
	}
		public  static void print ()
		{
			System.out.println("Child class");
			
		}

}
