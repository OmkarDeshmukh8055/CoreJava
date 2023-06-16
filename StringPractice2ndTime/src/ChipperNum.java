
public class ChipperNum {

	public static void main(String[] args) {
		String s = "abcdxyz";
		String s1 = "";
		s = s.toUpperCase();
		for (int i = 0; i < s.length(); i++)
		{
			int num = 155 - s.charAt(i);
			s1 = s1 + (char) num;
		}
		System.out.println(s1);
	}

}
