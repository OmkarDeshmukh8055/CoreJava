package ShopTestPracticeOct28;

public class output {

	public static void main(String[] args)
	{
	  shop shop=new shop();
		consumer c=new consumer(shop);
		producer p=new producer(shop);
		
		p.start();
		c.start();

	}

}
