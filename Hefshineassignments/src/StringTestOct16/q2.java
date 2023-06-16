package StringTestOct16;


public class q2 {

	public static void main(String[] args) {
    String s="abcdabcaba";
    int []a=new int[128];
    int []ia=new int[s.length()];
    for (int i = 0; i < s.length(); i++) 
    {
		a[(int)(s.charAt(i))]++;
	}
	for (int i = 0; i < a.length; i++) 
	{
		if(a[i]>0)
			System.out.println((char)(i)+" "+a[i]);
	}
	}

}
