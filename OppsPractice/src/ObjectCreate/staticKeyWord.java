package ObjectCreate;

public class staticKeyWord {
	static int num=10;
	
	public static void  call()
	{
		System.out.println(num); 
		
	}
    
	public static void main(String[] args) {

	
		staticKeyWord.num=200;
		staticKeyWord.call();


	}

}
