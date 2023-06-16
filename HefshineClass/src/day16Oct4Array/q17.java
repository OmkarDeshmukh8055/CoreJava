package day16Oct4Array;

public class q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {1,2,3,4,5,7,8,11};
for (int i = 0; i < a.length; i++) {
	for (int j = i+1; j < a.length; j++) {
		if( a[j]%2==0)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}

}for (int i = 0; i < a.length; i++)
{
	System.out.println(a[i]);
}
	}

}
