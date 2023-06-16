package ArraypracticeOCT7;

public class elementfindout {

	public static void main(String[] args) {
int []a= {23,45,24,75,43,556,68,545,3,24};

int num=23;
int count=0;
for (int i = 0; i < a.length; i++) 
{
	if(a[i]==num)
	{
		count++;
		System.out.println( "found at idex "+i);
		System.out.println("num "+num);
	}
	}
		if(count==0)
	{
		System.out.println("not found");
	}

}
}