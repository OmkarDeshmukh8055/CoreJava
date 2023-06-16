package zprePractice3;

import java.util.Arrays;

public class HCL_COde {

		public static void main(String[] args) {

int arr[]= {1,1,2,2,3};
	int n=2;
for (int i = 0; i < arr.length; i++)
{	
	//arr[i]=n;
	if(arr[i]==n)
	{
		arr[i]=arr[i]+n;
		n=arr[i];
	}
	else
		arr[i]=n;
}
System.out.println(Arrays.toString(arr));
		
	}

}
