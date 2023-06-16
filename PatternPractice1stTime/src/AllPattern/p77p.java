package AllPattern;

public class p77p {

	public static void main(String[] args) {

		int start=1;
for (int i = 0; i < 5; i++) 
{   int cnt2=start;
int diff=4;
	for (int j = 0; j < 5; j++) 
	{
		if(j-i<=0)
		{
			System.out.print(cnt2+" ");
		cnt2=cnt2+diff;
		diff--;
		}
		else 
			System.out.print(" ");
	}
	start++;
	System.out.println();
}
	}

}
