package shop;

public class producer  extends Thread{

Shop shop;
public producer(Shop shop)
{
	this.shop=shop;
}
public void run()
{
	while(true)
	{
		shop.producer();
		try {
			Thread.sleep(100);
			
		} catch (Exception e) {
		}
	}
}

}
