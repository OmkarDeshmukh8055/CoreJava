package day22String12Oct;

public class intern {

	public static void main(String[] args)
	{
		//intern method  it's check relation heap and SCP
		String s1=new String("abcd");
		String s2=s1.intern();
		String s3="abcd";

		System.out.println(s1==s3);
		System.out.println(s1==s3);
		System.out.println(s2==s3);  
	}

}
