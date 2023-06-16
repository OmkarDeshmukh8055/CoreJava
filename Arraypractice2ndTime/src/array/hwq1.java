package array;

import java.util.Scanner;

public class hwq1 {

	public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
int a[]= {1,8,6,4,3};
System.out.println("Enter number");
int num=sc.nextInt();
int index=-1;

for (int i = 0; i < a.length; i++) 
{
	if(num==a[i])
	{
		index=i;
		
	}
}
if(index==-1)
	System.out.println("not found");
else
	System.out.println("found at index "+index);
	}

}
