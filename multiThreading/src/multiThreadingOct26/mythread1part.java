package multiThreadingOct26;

public class mythread1part {

	public static void main(String[] args) {
		mythrad1 mythrad1 =new mythrad1();
		Thread Thread=new Thread(mythrad1);
		Thread.start();
	}

}
