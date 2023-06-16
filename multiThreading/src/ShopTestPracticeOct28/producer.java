package ShopTestPracticeOct28;

public class producer extends Thread {

	shop shop;
	

 producer (shop shop)
	
	{
		this.shop=shop;
		
	}
	public void run()
	{
		while(true)
		{
			shop.producer();
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
 }

