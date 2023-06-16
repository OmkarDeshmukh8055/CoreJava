
public class sum {

	public static void main(String[] args) {
		
		// we cannot use i++;
		int []a= {3,5,7,9};
		int i=0;
		int sum=0;
	int finalAddition=	myAddition(a,i,sum);
		System.out.println(finalAddition);
	}

	private static int myAddition(int[] a, int i, int sum) {

		  if(i<a.length)
		  {
		  sum=sum+a[i];
		 
		//int   result=myAddition(a,i+1,sum);
		//return result;
		  //or
		  return myAddition(a,i+1,sum);
		  }
		return sum;
	}

}
