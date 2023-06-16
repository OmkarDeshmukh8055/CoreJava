package LinkedListNov9;

import java.util.Arrays;

public class myclass {

	public static void main(String[] args) {

      LinkeList l=new LinkeList();
      l.add(10);
      l.add(20);
      l.add(30);
      l.add(40);
      l.add(50);
//      l.set(0, 10);
//    System.out.println(l.indexof(30));
//    System.out.println(l.lastindexof(20));
//      l.print();
//      System.out.println(l.size());
//      l.addwithindex(0, 100);
//      l.print();
  //   l.addwithindex(1, 5);
  //   l.remove(2);
    System.out.println(Arrays.toString(l.toarray()));
      l.print();
	}

}
