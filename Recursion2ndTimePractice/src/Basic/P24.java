package Basic;

public class P24 {

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
			if((i<=4&&(j+i>=4 && j+i<=9))||(i>=4&&(j-i>=-4 && j-i<=1)))
				System.out.print("*");
			else
				System.out.print(" ");
			j++;
			loopj(i,j);
		}
	}

}
