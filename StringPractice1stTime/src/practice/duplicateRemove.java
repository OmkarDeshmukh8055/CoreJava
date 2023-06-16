package practice;

public class duplicateRemove {

	public static void main(String[] args) {

		String s="aaab";
		String dup="";
		String uni="";
		for (int i = 0; i < s.length(); i++) 
		{
			int cnt=0;
			for (int j = 0; j < i; j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					cnt++;
				dup=dup+s.charAt(i);
				}
			}
			if(cnt==0)
				uni=uni+s.charAt(i);
		}
		System.out.println(uni);
		System.out.println(dup);

	}

}
