package shop;

public class Shop {

	int pens=0;
	public synchronized void producer ()
	{
		if(pens>=50)
		{
			try {wait();}catch(Exception e) {}
				
		}
		pens++;
		System.out.println("p "+pens);
		if(pens>=5)
			notify();
	}
	public  synchronized void consumer()
	{
		if(pens <=0)
		{
			try {wait(); }catch(Exception e) {};
		}
		pens--;
		System.out.println("consumer "+pens);
		if(pens<=10)
			notify();
	}

}
