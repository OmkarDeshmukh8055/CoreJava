package patternNov8;

public class pat {

	public static void main(String[] args) {

//for (int i = 0; i < 5; i++)
//{
//      for (int j = 0; j < 5; j++) 
//      {
//    	  if(j-i<=0)
//		System.out.print(5-j);
//    	  if(j-i>0)
//    		  System.out.print(5-i);
//	}	
//      System.out.println();
//}
//for (int i = 0; i < 5; i++)
//{
//      for (int j = 0; j < 5; j++) 
//      {
//    	if(j-i==0)
//    		System.out.print(1);
//    	else
//    		System.out.print(0);
//	}	
//      System.out.println();
//}
//
//
//for (int i = 0; i < 6; i++) 
//{
//	for (int j = 0; j < 5; j++) 
//	{ 
//		if((i==0 || i==5) && j>0)
//		{
//		System.out.print("*");
//		}
//		else if((j==0)&& (i>0 && i<5))
//		System.out.print("*");
//		else
//			System.out.print(" ");
//	} 
//	System.out.println();
//}
//

//for (int i = 0; i <13; i++) 
//{
//	for (int j = 0; j < 17; j++)
//	{
//		if (j+i>=3 && i<=4&& j-i<=5 ||j+i>=11 && i<=4 &&j-i<=13 
//				|| i>=4 && j-i>=-4 && j+i<=20)
//			
//		System.out.print("*");
//		else
//			System.out.print(" ");
//	}
//	System.out.println();
//}
		
		for (int i = 0; i < 6; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				if((i==0 || i==5) &&j>0 )
			
				System.out.print("*");
				else if(j==0&&(i>0 && i<5))
					System.out.print("*");
				
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}

}
