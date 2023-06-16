package day18;

public class stack {
	static int[] a = new int[5];
	static int index = 0;

	public static void main(String[] args) {

		push(5);
		push(10);
		push(7);
		push(6);
		push(9);

		for (int i = 0; i < args.length; i++)
		{
			System.out.print(a[i] + " ");
		}


		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());

	}

	public static int pop() {
		if (index > 0) 
		{
			index--;
			return a[index];
		} else
			System.out.println("stack is empty");
		return 0;
	}

	public static void push(int num) {
		if (index < a.length)
		{
			a[index] = num;
			index++;
		} else
			System.out.println("stack is full");
	}
}
