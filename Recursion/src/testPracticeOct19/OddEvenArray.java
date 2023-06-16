package testPracticeOct19;

import java.util.Arrays;

public class OddEvenArray {

	public static void main(String[] args) {
     int a[]= {1,2,3,4,5,6,44,77,7,7,7,77,7};
     int evencount=0;
     evencount=checkeven(a,0,evencount);
     
     int[] evenA=new  int[evencount];
     int []oddA=new int[a.length-evencount];
     
     int i=0,evenindex=0,oddindex=0;
     checkArrayelement(a,i,evenindex,evenA,oddindex,oddA);
     System.out.println("even");
     System.out.println(Arrays.toString(evenA));
     System.out.println("odd");
     System.out.println(Arrays.toString(oddA));
	
	}

	private static void checkArrayelement(int[] a, int i, int evenindex, int[] evenA, int oddindex, int[] oddA) {

        if(i<a.length)
        {
        	if(a[i]%2==0)
        	{
        		evenA[evenindex++]=a[i];
        	}
        	else
        	{
        		oddA[oddindex++]=a[i];
        	}
        	checkArrayelement(a,i+1,evenindex,evenA,oddindex,oddA);
        }
	}

	private static int checkeven(int[] a, int i, int evencount) {
		  if(i<a.length)
		  {
			  if(a[i]%2==0)
			  
				  evencount++;
			  return checkeven(a,i+1,evencount);
			  }
			  
			  else
		 
		return evencount;
	}

}
