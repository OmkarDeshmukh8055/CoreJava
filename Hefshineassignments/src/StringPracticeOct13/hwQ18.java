package StringPracticeOct13;

public class hwQ18 {

	public static void main(String[] args) {
         String s="abc deef ghi ";
         String s1="";
         String []sa= s.split(" ");
         
         
         
         
         for (int i = 0; i < sa.length; i++) 
         {        s1=sa[i];
			    for (int j=s1.length()-1 ;j>=0; j--)
			    {
					System.out.print(s1.charAt(j));
				}
			    System.out.print(" ");
		} 
         
	}

}
