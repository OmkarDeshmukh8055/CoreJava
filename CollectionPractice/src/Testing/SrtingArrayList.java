package Testing;

import java.util.ArrayList;

public class SrtingArrayList {

	public static void main(String[] args) {

ArrayList<Integer>list=new ArrayList();

list.add(100);
list.add(90);
list.add(10);
list.add(50);
list.add(80);
list.add(70);
list.add(20);
System.out.println(list);

System.out.println("sorted");

for (int i = 0; i < list.size(); i++) {
	
	for (int j = i+1; j < list.size(); j++) {
		if(list.get(i)>list.get(j))
		{
			int tempi=list.get(i);
		 int tempj=list.get(j);
		  
		  list.set(i, tempj);
		  list.set(j, tempi);
				  }
		
	}
	
}
System.out.println(list);
	}

}
