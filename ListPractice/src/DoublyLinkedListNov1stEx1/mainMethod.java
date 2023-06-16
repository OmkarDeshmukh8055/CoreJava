package DoublyLinkedListNov1stEx1;

import java.util.Arrays;

public class mainMethod {

	public static void main(String[] args) {

 myLinkedList<Integer> list=new myLinkedList<>();
 
list.add(10);
list.add(200);
list.add(30);
list.add(50);
list.add(10);


System.out.println("....forword print.....");
list.forWordPrint();
System.out.println();

System.out.println("....backWord print.....");
list.backWordPrint();
System.out.println();

System.out.println(".add with Index method.");
list.addwithIndex(3, 40);
list.forWordPrint();
System.out.println();


System.out.println("....set method....");
list.set(1, 20);
list.forWordPrint();
System.out.println();

System.out.println("......get method......");
System.out.println(list.get(1));
System.out.println();

System.out.println("....contain method....");
System.out.println(list.contains(10));
System.out.println();

System.out.println("....indexOf method....");
System.out.println(list.indexof(10));
System.out.println();

System.out.println("..lastindexOf method..");
System.out.println(list.lastindexof(10));
System.out.println();

System.out.println("....remove method....");
list.remove(1);
list.forWordPrint();
System.out.println();

System.out.println("....toArray method....");
Object []a=list.toArray();
System.out.println(Arrays.toString(a)); // inbuilt method used Arrays.toString()
System.out.println();
// second way of toArray method call
System.out.println("....toArray method....");
Object []ar=list.toArray();
for (int i = 0; i < ar.length; i++) {
	System.out.println(ar[i]+" ");
}


System.out.println("....toString method....");
System.out.println(list);
System.out.println();

System.out.println(".....size method.....");
System.out.println(list.size());
System.out.println();

System.out.println("....isEmpty method....");
list.isEmpty();
System.out.println();


System.out.println("....clear method....");
list.clear();


	}

}