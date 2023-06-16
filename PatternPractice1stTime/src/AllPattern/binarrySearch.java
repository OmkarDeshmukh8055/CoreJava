package AllPattern;

public class binarrySearch {

	public static void main(String[] args) {

		int a[]= {1,2,3,4,5,6,7,8};
		
			int num=3;
			int start=0;
			int end =a.length-1;
			while(true)
			{
				int mid=(start+end)/2;
				if(a[mid]==num)
				{
					System.out.println("found "+mid);
					break;
				}
				else if(num>a[mid])
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
