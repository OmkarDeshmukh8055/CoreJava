package AssignmentmultiThreadingOct26;

public class Q2p {

	public static void main(String[] args) {
// if we dont want any class extended that time impliments key is used
 Q2 one=new Q2();
 Q2p1 two=new Q2p1();
 Q2p2 three=new Q2p2();
 
Thread t=new Thread(one);
Thread t1=new Thread(two);
Thread t2=new Thread(three);

t.start();
t1.start();
t2.start();
	}

}
