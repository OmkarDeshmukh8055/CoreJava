package shop;

public class consumer extends Thread{

Shop shop;
consumer(Shop shop)

{
	this.shop=shop;
	}
public void run()
{
	while(true)
	{
		shop.consumer();
		try {
			Thread.sleep(200);
			
		} catch (Exception e) {
		}
	}
}

}
