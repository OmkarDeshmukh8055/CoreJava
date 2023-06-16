package ex2Genrics;

import java.util.ArrayList;

public class Op {

	public static void main(String[] args) {

			ArrayList a=new ArrayList<>(); 
		Ex1<String>e=new Ex1<>();
		e.add("h");
		e.add("e");
		e.add("f");
		e.add("s");
		e.add("h");
		e.add("i");
		e.add("n");
		e.add("e");
		e.add(".");
		System.out.println("get : "+e.get(3));
		System.out.println("size: "+e.size());
		e.remove(0);
		System.out.println(e.toString());
		Object[] arr=e.toArray();
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]);
		}

	}

}
