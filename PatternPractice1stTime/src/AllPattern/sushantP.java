package AllPattern;

public class sushantP {

	public static void main(String[] args) {
   
		int ci=0;
 for (int i = 0; i < 5; i++) 
 {
	 int cj=ci;
	for (int j = 0; j < 5; j++)
	{
		if(j+i<=4)
			System.out.print((char)((ci++)+65));
		else
			System.out.print(" ");
	}
	System.out.println();

}
	}

}
