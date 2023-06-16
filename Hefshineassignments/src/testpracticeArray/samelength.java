package testpracticeArray;

public class samelength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {1,2,3,4,5};
int[]b= {6,7,8,9,9};

if(a.length==b.length)
{
	int diffcount=0;
	for (int i = 0; i < b.length; i++) {
		if(a[i]!=b[i])
				{diffcount++;
		System.out.println("same");}
		else {
			System.out.println("not same"); 
	}}
}else {
	System.out.println("not same");

	
}
}}
