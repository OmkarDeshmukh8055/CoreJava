package ArraypracticeOCT7;

import java.util.Arrays;
import java.util.Iterator;


public class abc {

	public static void main(String[] args) {
	 int a[]= {1,2,3,4,5};
	 for (int i = a.length-1; i >=0; i--) {
		 System.out.print(a[i]+" ");
		
	}
	 System.out.println();
	 System.out.println(Arrays.toString(a));
	 for (int i = 0; i < a.length/2; i++) 
	 {
		 int temp=a[i];
		 a[i]=a[a.length-i-1];
		 a[a.length-i-1]=temp;
		
	}
	 System.out.println();
System.out.println(Arrays.toString(a));
	}

}
