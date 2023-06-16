package day21String11ctStrat;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="";
		char []ca= {'h','e','f','s','h','i','n','e'};
	
		for (int i = 0; i < ca.length; i++) 
		{
		   s=s+ca[i];
		}
		System.out.println(s); 
		
		
		String s1=new String(ca);
		System.out.println(s1);
	}
	

}
