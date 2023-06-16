package Testing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Hashmap {

	public static void main(String[] args) {
HashMap<Integer,String> list=new HashMap<Integer,String>();

list.put(10,"one");
list.put(20,"two");
list.put(1,"three");
list.put(5,"four");
list.put(101,"five");
System.out.println(list);

TreeMap<Integer,String> list1=new TreeMap<Integer,String>();

list1.put(10,"one");
list1.put(20,"two");
list1.put(1,"three");
list1.put(5,"four");
list1.put(101,"five");
System.out.println(list1);

LinkedHashMap <Integer,String> list2=new LinkedHashMap<Integer,String>();
list2.put(10,"one");
list2.put(20,"two");
list2.put(1,"three");
list2.put(5,"four");
list2.put(101,"five");
System.out.println(list1);



	}

}
