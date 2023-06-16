package AssignmentOct18;



public class Apattern6 {

	public static void main(String[] args) {
     
		loopi(0);
	}

	private static void loopi(int i) {
     
		if(i<9)
		{
			loopj(i,0);
			System.out.println();
			i++;
			loopi(i);
		}
	}

	private static void loopj(int i, int j) {
       
		if(j<5)
		{
			if(j-i>=0 && i<=4)
			{
				System.out.print((char)(j+65));
			}
			else if(j+i>=8 &&i>=4)
			{
				System.out.print((char)(j+65));
			}
			
			else
				System.out.print(" ");
			j++;
			loopj(i,j);
		}
	}

}
