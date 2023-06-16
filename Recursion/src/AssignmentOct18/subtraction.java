package AssignmentOct18;

public class subtraction {

	public static void main(String[] args) {

         int a[]= {10,5};
         int i=0;
         int sub=0;
         int s=mysub(a,i,sub);
         System.out.println(s);
		
	}

	private static int mysub(int[] a, int i, int sub) {

		if(i<a.length)
		{
			sub=sub-a[i];
			
			return mysub(a,i+1,sub);
		}
		return sub;
	}

}
