package multiThreadingOct27;

public class myclass {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Abcd abcd=new Abcd();
  thread1 n=new thread1(abcd);
  thread2 nn=new thread2(abcd);
  n.start();
  nn.start();
  n.join();
  nn.join();
  System.out.println(abcd.count);

	}

}
