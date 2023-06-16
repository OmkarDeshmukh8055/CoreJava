package multiThreadingOct27;

public class Scyoutput {

	public static void main(String[] args) throws Exception{
		
  Scy1 a=new Scy1();
  scy2 b=new scy2();
  
  a.start();
  b.start();
  a.join();
  b.join();
 
  
	}

}
