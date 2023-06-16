package multiThreadingOct27;

public class shopOp {

	public static void main(String[] args) {

 Shop shop=new Shop();
 producer  producer=new  producer(shop);
 consumer consumer=new  consumer(shop);
 producer.start();
 consumer.start();
	}

}
