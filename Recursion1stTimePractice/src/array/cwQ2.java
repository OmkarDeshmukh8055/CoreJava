package array;

public class cwQ2 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6};
		int start=0;
		int end=a.length-1;
		int num=1;
			while(true)
			{
				int mid=(start+end)/2;

				if(a[mid]==num)
				{
					System.out.println("found at index "+mid);
					break;
				}
				else	if(a[mid]<num)
				{
					start=mid+1;
				}
				else
				{
					end=mid-1;
				}
					if(start>end)
					{
						System.out.println("not found");
						break;
					}
					
			}
		
	}

}
