package array;

import java.util.Arrays;

public class OddEven {

	public static void main(String[] args) {

int a[]= {1,2,4,5,6,7,8,9,0};

int evencount=0;

for (int i = 0; i < a.length; i++)
{
	if(a[i]%2==0)
		evencount++;
}
int evenA[]=new int [evencount];
int oddA[]=new int [a.length-evencount];
int ei=0,odi=0;

for (int i = 0; i < a.length; i++) 
{
	if(a[i]%2==0)
		evenA[ei++]=a[i];
	else
		oddA[odi++]=a[i];
}
System.out.println(Arrays.toString(evenA));
System.out.println(Arrays.toString(oddA));

	}

}
