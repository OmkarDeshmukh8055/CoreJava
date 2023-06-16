package AssignmentOct18;

public class findElement {

	public static void main(String[] args) {
          
		int a[]= {1,2,3,4,5,9,6,7,8};
		int i=0;
		int num=9;
		findEle(a,i,num);
	
	}

	private static void findEle(int[] a, int i, int num)
	{
           
		if(i<a.length)
		{
		if(a[i]==num)
		{
			System.out.println("found "+i);
		}
		else
		{
			findEle(a,++i,num);
		}
	}	
		else
		
			System.out.println("not found");
	
		
}

}
