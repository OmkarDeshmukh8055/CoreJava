package dec6;

public class min {

	public static void main(String[] args) {

		String s="aaaaabbccc";
		int min=Integer.MAX_VALUE;
		char c='0';
		for (int i = 0; i < s.length(); i++) 
		{	
			int cnt=0;
			char ca='0';
			for (int j = 0; j < s.length(); j++) 
			{
				if(s.charAt(i)==s.charAt(j))
				{
					cnt++;
					ca=s.charAt(i);

				}
			}
				if(cnt<min)
				{
					min=cnt;
					c=ca;
				}
			}
		System.out.println(min+" "+c);
				
	}

}
