package LinkList1stEx;

public class myclass {

	public static void main(String[] args) {
myLinkedList list=new myLinkedList();
list.add(10);
list.add(20);
list.add(30);
list.add(40);

System.out.println(list);
list.clear();
System.out.println("after clear");
list.print();
	}

}
