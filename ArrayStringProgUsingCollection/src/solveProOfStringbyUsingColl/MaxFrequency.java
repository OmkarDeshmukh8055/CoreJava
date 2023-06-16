package solveProOfStringbyUsingColl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MaxFrequency {

	public static void main(String[] args) {
  String s="abbccddddcba";
  
  Map<Character, Integer> map=new LinkedHashMap<Character,Integer>();
  
  for (int i = 0; i <s.length(); i++)
  {
	
	  char ch=s.charAt(i);
	  if(map.containsKey(ch))
	  {
		  map.put(ch, map.get(ch)+1);
	  }
	  else
		  map.put(ch, 1);
}
  System.out.println(map);
  Set<Character> set=map.keySet();
  List<Character> list=new ArrayList<>(set);
  
  for (int i = 0; i < list.size(); i++) 
  {
	for (int j = i+1; j < list.size(); j++) 
	{
	 if(map.get(list.get(i))>map.get(list.get(j)))
			 {
		 char ch =list.get(i);
		 list.set(i, list.get(j));
		 list.set(list.get(j), ch);
			 }
	}
}
  System.out.println(list);
  System.out.println("least freq char is");
  System.out.println(list.get(0)+" "+map.get(list.get(0)));
  System.out.println("max freq");
  System.out.println(list.get(list.size()-1)+" "+map.get(list.get(list.size()-1)));
	}

}
