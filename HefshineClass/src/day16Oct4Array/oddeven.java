package day16Oct4Array;

public class oddeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {1,2,3,4,5,6,7,8,9	};
int evencount=0;
for (int i = 0; i < a.length; i++) 
{
	if(a[i]%2==0)
	evencount++;
	}
int[] even=new int[evencount];
int[] odd=new int[a.length-evencount];
int j=0; int k=0;
for (int i = 0; i < a.length; i++)
{
	if(a[i]%2==0)
		
			even[j++]=a[i];
			else
			{
		odd[k++]=a[i];
	}
}System.out.println("even number"); 
for (int i = 0; i < even.length; i++)
{
	System.out.println(even[i]);
}
System.out.println("odd number");
for (int i = 0; i < odd.length; i++) {
	System.out.println(odd[i]);
}
}

}
