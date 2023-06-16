package AssignmentOct18;

public class withou3rdVAriablereverse {

	public static void main(String[] args) {
      
		int a[]= {1,2,3,4,5,6,78,9};
		
		int  i=0;
		int j=a.length-1;
		reverse(a,i,j);
		
	}

	private static void reverse(int[] a, int i, int j) {
         
		if(i<j) 
		{
		   a[i]=a[i]+a[j];
		   a[j]=a[i]-a[j];
		   a[i]=a[i]-a[j];
		   reverse(a,++i,--j);
		   
		}
		else
		{
			int index=0;
			myArrayElement(a,index);
		}
	}

	private static void myArrayElement(int[] a, int index) {
          
		if(a.length>index)
		{
			System.out.println(a[index]);
			myArrayElement(a,++index);
		}
	}

}
