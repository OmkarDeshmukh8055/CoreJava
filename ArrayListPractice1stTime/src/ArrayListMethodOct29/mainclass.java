package ArrayListMethodOct29;
 import java.util.ArrayList;
public class mainclass {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		System.out.println(list);
		
		System.out.println(	list.lastIndexOf(40));
		
		list.remove(2);
		System.out.println(list);
		
		System.out.println(	list.contains(10));
		 
		list.add(70);
		System.out.println(list);
		
		System.out.println(list.get(2));
		
		System.out.println(list.isEmpty());
		
		
		
	
		System.out.println(	list.size());
		
		list.toArray();
		
		list.clear();
		System.out.println(list);
		
		
		
	}

}
