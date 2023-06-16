package day3;

public class ifelsestatement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  amountInpocket=1100;
		if (amountInpocket>1000)
		{
			if (amountInpocket>5000) 
			{
			
			System.out.println("dinner in 5 star");
			}
			else if (amountInpocket>2000)
			{
				System.out.println("dinner in 3 star");
			}
				
			
		else
			System.out.println("dinner in tapri");
		}
		else{
			System.out.println("dinner in mess");
		}
	}

}
