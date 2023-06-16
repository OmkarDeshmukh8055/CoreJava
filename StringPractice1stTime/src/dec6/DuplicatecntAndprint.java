package dec6;

public class DuplicatecntAndprint {

	public static void main(String[] args) {

		String s="OOmkarrr";
		String dupStore="";
		int cnt=0;
		for (int i = 0; i < s.length(); i++)
		{
			for (int j = i+1; j < s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					cnt++;
					dupStore=dupStore+s.charAt(i);
					break;
				}
			}
		}
		System.out.println("Orignal String "+s);
		System.out.println("Duolicate count "+cnt);
		System.out.println("Duplicate element  "+dupStore);

	}

}
