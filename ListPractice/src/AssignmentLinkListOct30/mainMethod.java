package AssignmentLinkListOct30;

import java.util.Arrays;

public class mainMethod {

	public static void main(String[] args) {

		myLinkList<Integer> obj = new myLinkList();
		
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		obj.add(10);
		
		obj.print();
		System.out.println("set Method");
		obj.set(20,2);
		obj.print();
		
		System.out.println("size Method");
		System.out.println(obj.size());
		
       System.out.println("indexOf method");
		System.out.println(obj.myindexof(10));
		
		  System.out.println("latindexOf method");
			System.out.println(obj.mylastinsexof(10));
		
		System.out.println("contain method");
		System.out.println(obj.myContain(20));
		
		System.out.println("get method");
		System.out.println(obj.get(2));
		
		System.out.println("toArray method");
		Object []a=obj.toArray();
		System.out.println(Arrays.toString(a));
	
		System.out.println("Empty Method");
		System.out.println(obj.empty());
	
		
		obj.clear();
		System.out.println("clear method ");
		obj.print();
		
		System.out.println("Empty Method");
		System.out.println(obj.empty());
	
		
	}

}
