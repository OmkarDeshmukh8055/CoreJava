package erpQue;

public class Even_Odd_Neg_Poss 
{
	public static void main(String[] args)
	{
		int a[]= {1,2,-3,-4,5,6,7,8,-9,10};
		
		int even=0,odd=0,negative=0,possitive=0;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]%2==0)
				even++;
			else
				odd++;
			if(a[i]<0)
				negative++;
			else
				possitive++;
		}
		System.out.println("even "+even);
		System.out.println("odd "+odd);
		System.out.println("negative "+negative);
		System.out.println("possitive "+possitive);
	}

}
