package StringSortUsingTreeSet;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class myclass {

	public static void main(String[] args) {
String s="  Omakr Deshmukh  AtAmbajogai";

String []sa=s.split(" ");

mycomareTo obj=new mycomareTo() ;
Set<String> set=new TreeSet<String>(obj);

for (int i = 0; i < sa.length; i++) 
{
	set.add(sa[i]);
	
}
System.out.println(set);
	}

}
