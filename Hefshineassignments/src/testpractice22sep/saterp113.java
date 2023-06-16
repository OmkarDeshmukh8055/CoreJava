package testpractice22sep;

public class saterp113 {
	public static void main(String[] args) 
	
	{
		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < 20; j++) {
				if (j+i>=2 && j-i>=4&&j>=4&&j-i<=8) {
					System.out.print("*");
				} else if (j-i>=-4&&j+i<=13){
System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
				System.out.println();
			}
			
		}

}
