package Basic;

public class Apattern30 {

	public static void main(String[] args) {
		printi(0,5);
	}

	private static void printi(int i,int cnt) 
	{
		if (i < 12) 
		{
			int c1=cnt;
			printJ(i, 0,c1);
			System.out.println();
			if(i<=4)
			cnt--;
			else
				cnt++;
			printi(i + 1,cnt);
		}
	}

	private static void printJ(int i, int j,int c1)
	{
		if (j <7) 
		{
			if (j+i<=5)
				System.out.print((char)(c1+65));
			else if(j-i<-5)
				System.out.print((char)(c1+64));
			else
				System.out.print(" ");
		
			printJ(i, j + 1,c1-1);
		}
	}

}
