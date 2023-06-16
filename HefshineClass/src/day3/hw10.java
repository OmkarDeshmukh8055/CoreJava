package day3;

public class hw10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch=8;
		
		if(ch>='a' && ch<='z' ||ch>='A' && ch<='Z')
		{
			System.out.println("Alphabet");
		}
		else if(ch>='o' && ch<='9')
		{
			System.out.println("number");
		}
		else
			System.out.println("symbol");

	}

}
