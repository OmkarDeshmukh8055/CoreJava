package Basic;

public class P16 {

	public static void main(String[] args) {
  
		loopi(0);
	}

	private static void loopi(int i)
	{
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
			if(i>=4 &&(j-i>=-4 && j+i<=12)||(i<=4&&(j+i>=4 &&j<=4 || j>=4 && j-i<=4)))
				System.out.print("*");
			else
				System.out.print(" ");
			j++;
			loopj(i,j);
		}
	}

}
