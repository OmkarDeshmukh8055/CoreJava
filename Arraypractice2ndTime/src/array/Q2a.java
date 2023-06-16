package array;

public class Q2a {

	public static void main(String[] args) {

		int a[]= {1,2,3,14,53,61,92};
			int num=3;
		int start=0;
		int end=a.length-1;
		
		while(true)
		{
			int mid=(start+end)/2;
			if(num==a[mid])
			{
				System.out.println("found at index "+mid);
				break;
			}
			else if(a[mid]<num)
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		
		if(end<start)
		{
			System.out.println("not found");
			break;
		}
		}

		
	}

}
