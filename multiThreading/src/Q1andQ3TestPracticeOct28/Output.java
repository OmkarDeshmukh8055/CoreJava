package Q1andQ3TestPracticeOct28;

public class Output {

	public static void main(String[] args) throws Exception {

thread1 t1=new thread1();
thread2 t2=new thread2();
t1.start();
t1.setPriority(7);
System.out.println(t1.getPriority());
t2.start();
System.out.println(t2.getPriority());

	}

}
