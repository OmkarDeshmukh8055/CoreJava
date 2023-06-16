package ArrayPractice;

public class BinarySearch {

	public static void main(String[] args) 
	{
		int [] a= {1,2,3,4,5,6,7,8};
		int num=2;
		int min=0;
		int max=a.length-1;
		while(true)
		{
			if(max<min)
			{
				System.out.println("not found");
			break;
			}
		int	mid =(min+max)/2;
		if(a[mid]==num)
		{
			System.out.println("found "+mid);
			break;
		}
		if(num>a[mid])
		
			min=mid+1;
			else
				max=mid-1;
		
			
			
			
		}
//		int min=0;
//		int max=a.length-1;
//		while(true)
//		{
//			if(max<min)
//			{
//				System.out.println("index not found");
//				break;
//			}
//			int mid=(min+max)/2;
//			if(num==a[mid])
//			{
//				System.out.println("index found at ="+mid);
//				break;
//			}
//			if(num>a[mid])
//				min=mid+1;
//			else
//				max=mid-1;
//		}


	}

}
