package day4;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=30;
int b=20;
int c=100;
if(a<b && b<c || a<c && c<b) {
	System.out.println("a is youngest");
		
}
if(b<a && a<c || b<c && c<a) {
	System.out.println("b is youngest");
	
}
else
{
	System.out.println("c is youngest");
	}
	 if(a>b && b>c || a>c && c>b) 
		System.out.println("a is oldest");

	 if(b>a && a>c || b>c && c>a) {
		System.out.println("b is oldest");
		
	}
	else {
		System.out.println("c is oldest");
	}
	
	}

}
