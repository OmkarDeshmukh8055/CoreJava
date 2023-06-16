package multiThreadingOct26;

public class THREADONETEWO {

	public static void main(String[] args) {
    threadone one = new threadone();
    thradtwo two= new thradtwo();
    one.setPriority(7);                      //set priority
    System.out.println(one.getPriority());  //check priority
    one.start();
    System.out.println("i am here");
    two.start();

	}

}
