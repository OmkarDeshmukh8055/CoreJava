package myArrayList;

public class OutPut {

	public static void main(String[] args) {

		MyArrayList list=new MyArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		list.add(110);
		list.add(120);

		System.out.println(list.indexOf(90));
		System.out.println(list.size());
		System.out.println(list.contains(120));
		list.remove(2);
		list.remove(4);
		list.remove(6);
		list.remove(7);

		//System.out.println(	list.toString());
		int[] c=list.toArray();
		for (int i = 0; i < c.length; i++) 
		{
			System.out.print(c[i]+" ");
		}
	}

}
