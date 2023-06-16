package Basic;

public class P23 {

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
          
		if(j<10)
		{
			if((i>=4&&(j+i>=8 && j+i<=12)||i<=4&&(j-i>=0 && j-i<=4 )))
				System.out.print("*");
			else
				System.out.print(" ");
			j++;
			loopj(i,j);
		}
	}

}
