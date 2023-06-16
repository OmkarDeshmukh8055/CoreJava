package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list {
public static void main(String[] args)
{
	ArrayList<Student> list=new ArrayList<>();
	list.add(new Student(1,"abhi",20.3f));
	list.add(new Student(8,"prthamesh",40.13f));
	list.add(new Student(3,"omkar",1.32f));
	list.add(new Student(5,"avinash",40.113f));
	list.add(new Student(9,"pavan",90.31f));
	list.add(new Student(2,"akash",42.32f));
	list.add(new Student(11,"pooja",23.3f));
	list.add(new Student(0,"pallavi",10.3f));
	Collections.sort(list,new Com());
	System.out.println(list);

}
}
