package Basic;



public class Apattern8 {

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
       
		if(j<9)
		{
			if(j-i>=0  && j+i<=16)
			{
				System.out.print((char)(j+65)+" ");
			}
				else
				{
					System.out.print(" ");
			    }
			
			j++;
			loopj(i,j);
		}
	}

}
