package dec6;

public class Stringreverseprint {

	public static void main(String[] args) {

		String s="i am so happy";
		String[] ca=s.split(" ");
		for (int i =ca.length-1; i >=0; i--)
		{
			System.out.print(ca[i]+" ");
		}
	}

}
