package Basic;

public class P75 {
	public static void main(String[] args) {
		
	loopi(0);
	}

	private static void loopi(int i)
	{
    		if(i<11)
    		{
    			loopj(i,0);
    			System.out.println();
    			i=i+2;
    			loopi(i);
    		}
	}

	private static void loopj(int i, int j) {
          
		if(j<11)
		{
			if(j-i<=0 && i!=j*2)
				System.out.print("*");
			else
				System.out.print(" ");
			j++;
			loopj(i,j);
		}
	}

}