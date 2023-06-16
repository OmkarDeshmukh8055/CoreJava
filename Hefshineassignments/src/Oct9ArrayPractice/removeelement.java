package Oct9ArrayPractice;

public class removeelement {

	public static void main(String[] args) {
int a[]= {1,2,3,45,6,7};

int b[]=new int [a.length-1];
int num=45;
for (int i = 0; i < b.length; i++) 
{
	if(a[i]!=num)
		b[i]=a[i];
} 
for (int i = 0; i < b.length; i++) {
	System.out.println(b[i]);
}
	}

}
