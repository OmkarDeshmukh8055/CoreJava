package array;

public class EvenNumUpto100 {
	static int  i=0;
	static int end=100;

	public static void main(String[] args)
	{
		even();

	}

	private static void even() {
		if(i%2==0)
		{
			System.out.println(i);
		}
		if(i<end)
		{
			i++;
			even();
		}
		
	}

}
