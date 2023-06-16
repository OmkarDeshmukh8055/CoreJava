package solveProOfArraybyUsingColl;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListReverseprint {

	public static void main(String[] args) {

LinkedList<Integer> list=new LinkedList<>();
list.add(10);

list.add(20);
list.add(30);
list.add(40);
list.add(50);

System.out.println(list);

int i=0;
int j=list.size()-1;
while(j>i)
{
	int temp=list.get(i);
	list.set(i,list.get(j));
	list.set(j, temp);
	j--;
	i++;
}
System.out.println(list);


//ArrayList
ArrayList<Integer> list2=new ArrayList<>(list);
int i1=0;
int j1=list.size()-1;
while(j>i)
{
	int temp=list.get(i1);
	list.set(i1,list.get(j1));
	list.set(j1, temp);
	j1--;
	i1++;
}
System.out.println(list);

	}

}
