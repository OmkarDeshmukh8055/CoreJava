package AssignmentmultiThreadingOct26;

public class Q3outPut {

	public static void main(String[] args) {
  Q3 one =new Q3();
  Q3p1 two =new Q3p1();
  Q3p2 three=new Q3p2();
  
  one.start();
  two.start();
  three.start();
  one.setPriority(7);
  
  
 three.setPriority(4);
 

 System.out.println(three.getPriority());
 System.out.println(one.getPriority());
 
 
//  two.setDaemon(true);   
 // System.out.println(two.getPriority());

	}

}
