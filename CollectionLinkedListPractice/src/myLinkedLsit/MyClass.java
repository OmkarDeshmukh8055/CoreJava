package myLinkedLsit;

public class MyClass {

	public static void main(String[] args) {

		MyLinkedList<String> list=new MyLinkedList<>();
		list.add("pavan");
		list.add("sachin");
		list.add("omkar");
		list.add("swapnil");
		list.add("sagar");
		System.out.println(list.mytoString());
//		System.out.println(list.contains("pavan"));
//		System.out.println(list.indexOf("omkar"));
	}

}
