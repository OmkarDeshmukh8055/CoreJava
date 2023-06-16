package ShopTestPracticeOct28;

public class consumer extends Thread{
	shop shop;

	 consumer(shop shop) {
		this.shop = shop;

	}

	public void run()
	{
		while (true) 
		{
			shop.consumer();
			try 
			{
				Thread.sleep(100);
			}
			catch (Exception e) 
			{
			}
		}
	}
}
