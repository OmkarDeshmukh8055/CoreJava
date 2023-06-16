package treeNov4;

public class myclass {

	public static void main(String[] args) {

  myTreeMap map=new myTreeMap();
  map.add(1, "one");
  map.add(2, "two");
  map.add(3, "three");
  map.add(4, "four");
  map.add(1, "onne");
 
  map.print();
  
  System.out.println("----get----");
  System.out.println(map.get(3));
 
	}

}
