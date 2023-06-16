package array;

public class fact {

	public static void main(String[] args) {
		int num=5;
		int i=1;
		int fact=1;
		while(num>=i)
		{
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}

}
