package day16Oct4Array;

public class largestANDsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {2,3,4,5,6,7,8,44,66,44,43};
int min=a[0];


for (int i = 0; i < a.length; i++) {
	if(min>a[i])
	{
		min=a[i];
		
	}
}
		System.out.println(min);

int max=a[0];
for (int i = 0; i < a.length; i++) {
	if(max<a[i])
	{
		max=a[i];
	}
}System.out.println(max);
System.out.println("diff "+(max-min));
	}}
