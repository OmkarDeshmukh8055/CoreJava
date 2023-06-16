package Basic;

public class Binary_Search {
	public static void main(String[] args) {
		int a[]= {11,22,33,44,55,66,77,88};
		int min=0,max=a.length-1,index=-1,num=414;
		index=BinarySearch(num,min,max,index,a);
		if(index==-1)
			System.out.println("not found");
		else
			System.out.println("found at index "+index);
	}
	private static int BinarySearch(int num,int min, int max, int index, int[] a)
	{
		while(max>=min)
		{
			int mid=(min+max)/2;
			if(a[mid]==num)
				return mid;
			else if(max<min)
				return index;
			else if(a[mid]<num)
				min=mid+1;
			else
				max=mid-1;
		}
		return index;
	}
}
