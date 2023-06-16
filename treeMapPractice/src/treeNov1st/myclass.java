package treeNov1st;

import java.util.Arrays;
import java.util.Iterator;

public class myclass {

	public static void main(String[] args) {
mytreeMap tree=new mytreeMap();


tree.add(10);
tree.add(11);
tree.add(5);
tree.add(12);
tree.add(7);
tree.print();


System.out.println(tree.contain(11));
System.out.println();
System.out.println(tree.size());

System.out.println(tree.isEmpty());
System.out.println();
System.out.println(tree.toString());
int a[]= tree.toArray();
//System.out.println(Arrays.toString(a));
for (int i = 0; i < a.length; i++) {
System.out.print(a[i]+" ");	
	}

	}

}
