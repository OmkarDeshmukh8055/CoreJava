package myDublyLinkedList;


public class Op {

	public static void main(String[] args) {

		MYList<Integer> list=new MYList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(50);
		list.add(50);
		list.add(60);
		list.printFWD();
		list.printReverse();

		
	}

}
