package testOct20;

public class Q2 {

	public static void main(String[] args) {

		  int a[]= {3,7,90,20,5,50,40};
		  int i=0,sum=0;
		  Average(a,i,sum);
		  
	}

	private static void Average(int[] a, int i,int sum) {
             if(i<a.length)
             {
            	int j=i+1;
            	loopj(a,i,j,sum);
            	
            	System.out.println(sum/7);
             }
             Average(a,i+1,sum);
             
	}

	private static void loopj(int[] a, int i, int j,int sum) {
     if(j<a.length)
     {
    	 sum=sum+a[i];
     }
     Average(a,i,j+1,sum);
	}

	private static void Average(int[] a, int i, int j, int sum) {
       if(i<a.length) 
       {
	     System.out.println(sum/7);
       }
	}

}
