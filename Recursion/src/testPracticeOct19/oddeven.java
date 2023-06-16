package testPracticeOct19;

import java.util.Arrays;

public class oddeven {

	public static void main(String[] args) {
         
		int a[]= {1,2,3,4,5,22,6,7,8,9};
		int evencount=0;
		evencount=checkeven(a,0,evencount);
		int []evenArray=new int[evencount];
		int []oddArray=new int[a.length-evencount];
		 int evenindex=0; int oddindex=0;
		
		addelement(a,0,evenArray,evenindex,oddArray,oddindex);
		System.out.println("even");
		System.out.println(Arrays.toString(evenArray));
		System.out.println("odd");
		System.out.println(Arrays.toString(oddArray));	
	
		
	}

	private static void addelement(int[] a, int i, int[] evenArray, int evenindex, int[] oddArray, int oddindex) {
          if(i<a.length)
          {
        	  if(a[i]%2==0)
        	  {
        		  evenArray[evenindex++]=a[i];
        	  }
        	  else
        	  {
        		  oddArray[oddindex++]=a[i];
        	  }
        	  addelement(a,i+1,evenArray,evenindex,oddArray,oddindex);
          }
	}

	private static int checkeven(int[] a, int i, int evencount)
	{
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
