package sunday17Oct;

public class duplicatefindAndPrint {

	public static void main(String[] args) {
		String s = "aabbbbccccccc";

		int count = 0;
		String s1 = "";

		for (int i = 0; i < s.length(); i++)
		{
			for (int j = i + 1; j < s.length(); j++) 
			{
				if (s.charAt(i) == s.charAt(j)) 
				{
					count++;
					
					System.out.print(s.charAt(i));
				}
				break;
				
				}
			}
		System.out.println(count);
}

}
