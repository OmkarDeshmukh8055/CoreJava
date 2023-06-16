package sundayOct10array;

public class smallandlarge {

	public static void main(String[] args) {
int []a= {1,2,3,45,67,8};
int min=a[0];
int max=a[0];

for (int i = 0; i < a.length; i++) 
{
	if(min>a[i]) {
		min=a[i];
	}
	if(max<a[i])
		max=a[i];
		
}
System.out.println(min);
System.out.println(max);

	}

}
