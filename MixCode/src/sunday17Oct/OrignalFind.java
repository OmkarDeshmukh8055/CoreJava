package sunday17Oct;

public class OrignalFind {

	public static void main(String[] args) {
		String s = "aabbbbccccccc";

		String s1 = "";

		for (int i = 0; i < s.length(); i++)
		{ 		int count = 0;

			for (int j = i + 1; j < s.length(); j++) 
			{
				if (s.charAt(i) == s.charAt(j)) 
				{
					count++;
					
				}
			}
				if(count==0)
				{
					s1=s1+s.charAt(i);
				}
				
			}			System.out.println(s1);

			
}
}
