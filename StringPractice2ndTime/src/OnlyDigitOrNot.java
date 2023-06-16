
public class OnlyDigitOrNot {

	public static void main(String[] args) {
		String  s1="omkar12";
		int c=0;
		for (int i = 0; i <s1.length(); i++) {
			if(s1.charAt(i)<'0' || s1.charAt(i)>'9')
				c++;
		}
		if(c==0)
			System.out.println("contanis only didgits");
		else
			System.out.println(" not contanis only didgit");

	}

}
