package mondayOct18;

public class ReverseArray {

	public static void main(String[] args) {

      int a[]= {1,2,9,8,7,6,5,4};
      int i=0;
      int j=a.length-1;
      reverse(a,i,j);
	}

	private static void reverse(int[] a, int i, int j) {
          if(i<a.length)
          {
        	 if(i<j)
        	 {
        		 int temp=a[i];
        		 a[i]=a[j];
        		 a[j]=temp;
        		 reverse(a,++i,--j); 
        	 }
        	 else
        	 {
        		int index=0;
        		indexreverse(a,index);
        	 }
        	 
        	 
        		 
          }
	}

	private static void indexreverse(int[] a, int index) {

		if(index<a.length)
		{
			System.out.print(a[index]+" ");
			indexreverse(a,++index);
		}
	}

}
