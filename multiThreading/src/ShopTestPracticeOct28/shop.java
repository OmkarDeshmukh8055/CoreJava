package ShopTestPracticeOct28;

public class shop  extends Thread{
	int pen = 0;
	

	public  synchronized void producer() 
	{
		if(pen>=50)
		
		{
			try {
				wait();
			} catch (Exception e) {
			}
			
			
		}
		pen++;
     System.out.println("p "+pen);
     if(pen>=5)
		{
			notify();
		}
	}

	public synchronized void consumer()
	{
		if(pen<=0)
			try {
				wait();
			} catch (Exception e) {
			}
		
		
      pen--;
      System.out.println("c "+pen);
      if(pen<=10)
		{
			try {
				notify();
			} catch (Exception e) {
			}
	}

}
}