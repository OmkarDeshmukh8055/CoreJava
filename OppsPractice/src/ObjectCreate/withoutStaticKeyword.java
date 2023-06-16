package ObjectCreate;

public class withoutStaticKeyword {

 int num=10;
	
	public  void  call()
	{
		System.out.println(num); 
		
	}

	public static void main(String[] args) {

		
		withoutStaticKeyword c=new withoutStaticKeyword();
		c.num=100;
		c.call();
		
		withoutStaticKeyword c1=new withoutStaticKeyword();
   c1.call();
	}

}
