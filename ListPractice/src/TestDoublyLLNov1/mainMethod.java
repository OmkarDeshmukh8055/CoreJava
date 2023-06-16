package TestDoublyLLNov1;

import java.util.Arrays;

public class mainMethod {

	public static void main(String[] args) {

		 mylinkedList<Integer> list=new mylinkedList<>();
		 
		 list.add(10);
		 list.add(200);
		 list.add(30);
		 list.add(50);
		 list.add(10);


			 list.addwithIndex(3, 40);
		 list.forWordPrint();
		 list.set(1, 20);
		 list.forWordPrint();



		 System.out.println(list.contains(10));

		 System.out.println(list.lastindexof(10));
		 
		
		 Object []ar=list.toArray();
		 for (int i = 0; i < ar.length; i++) {
		 	System.out.println(ar[i]+" ");
		 }


		
		 System.out.println(list);
		 System.out.println();

		
		 System.out.println(list.size());
		 System.out.println();






	}

}
