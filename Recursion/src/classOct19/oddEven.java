package classOct19;

import java.util.Arrays;

public class oddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[]= {1,9,4,8,3,5,6};
		 int evencount=0;
		 int i=0;
		 evencount=checkeven(a,i,evencount);
		 int[] evenArray=new int[evencount];
		 int []oddArray=new int[a.length-evencount];
		 i=0;
		int  evenindex=0;int oddindex=0;
				 
		addElementinArray(a,i,evenArray,evenindex,oddArray,oddindex);	
		System.out.println("evenArray");
		System.out.println(Arrays.toString(evenArray));
		System.out.println("oddArray");
		System.out.println(Arrays.toString(oddArray));
	}


	private static void addElementinArray(int[] a, int i, int[] evenArray, int evenindex, int[] oddArray,
			int oddindex) {
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
        addElementinArray( a, 1+ i,  evenArray,  evenindex,  oddArray, oddindex);
	}

}
	private static int checkeven(int[] a, int i, int evencount) 
	{   
		if(i<a.length)
	   {
		if(a[i]%2==0)
			evencount++;
		//int count=checkeven(a,i+1,evencount);
		//return count;
		return checkeven(a,i+1,evencount);
	}
	else
		
		return evencount;
	}
}
	
	
	
	
