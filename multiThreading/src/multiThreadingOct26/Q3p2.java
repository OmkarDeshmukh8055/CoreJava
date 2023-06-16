package multiThreadingOct26;

public class Q3p2 {

	public static void main(String[] args) {
 
		Q3 a=new Q3();
		Q3p1 b=new Q3p1();
		a.setDaemon(true);
	//a.setPriority(4);
	System.out.println(a.getPriority());
		
	}

}
