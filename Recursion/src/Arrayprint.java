
public class Arrayprint {

	public static void main(String[] args) {
 int []a= {11,12,13,14,15,16,17};
 
 int i=0;
 printmyArrayPrint(a,i);

}

	private static void printmyArrayPrint(int[] a, int i)
	{
		if(i<a.length)
		{
			System.out.println(a[i]);
			printmyArrayPrint(a,(i+1)); 
		}
	}
	}
