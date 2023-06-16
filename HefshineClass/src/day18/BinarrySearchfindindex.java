package day18;

public class BinarrySearchfindindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3,4,5,6,7,8,9,10};
		
		int num=3;
		int min=0;int max=a.length-1;
		
		while(true)
		{
	if(max < min)
		
	{
		System.out.println("not found");
		break;
	}
	int mid=(min+max)/2;
	if(a[mid]==num)
		{
		System.out.println("found at index "+mid);
		break;
		}
	else if(num>a[mid])
		min=mid+1;
	else
		max=mid-1;
	}

}
}