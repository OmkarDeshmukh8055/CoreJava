package Basic;

public class P78 {

	public static void main(String[] args) {
		loopi(0);
		}

		private static void loopi(int i)
		{
	    		if(i<5)
	    		{
	    			loopj(i,0);
	    			System.out.println();
	    			i++;
	    			loopi(i);
	    		}
		}

		private static void loopj(int i, int j) {
	          
			if(j<20)
			{
				if(j<=4&&(j-i<=0))
					System.out.print("*");
				else if(j>=5&&j<=9&& (j+i<=9))
				System.out.print("*");
				else if(j>=9&&j<=14&& (j-i>=10))
					System.out.print("*");
				else if(j>=14&& (j+i>=19))
					System.out.print("*");
				else
					System.out.print(" ");
				j++;
				loopj(i,j);
			}
		}
	}