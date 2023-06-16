package array;

import java.util.Arrays;

public class Q24 {
	public static void main(String[] args) {

		//left shift
//int a[]= {1,2,3,4,5};
//	int temp=a[0];
//for (int i =0;i<a.length-1;i++) 
//{
//	a[i]=a[i+1];
//}
//a[a.length-1]=temp;
//System.out.println(Arrays.toString(a));


		//// right shift
int a1[]= {1,2,3,4,5};
int temp1=a1[a1.length-1];
for (int i =a1.length-1;i>0;i--) 
{
a1[i]=a1[i-1];
}
a1[0]=temp1;
System.out.println(Arrays.toString(a1));



	}

}
