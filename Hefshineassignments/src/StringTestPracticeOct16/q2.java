package StringTestPracticeOct16;

public class q2 {

	public static void main(String[] args) {
   
		String s="12345";
		int sum=0;
		
		for (int i = 0; i < s.length(); i++)
		{
			char ch=s.charAt(i);
		    if(ch>='0' && ch<='9')
		    	sum=sum+(char)(ch-48);
				    
		}
		System.out.println(sum);
	}

}
