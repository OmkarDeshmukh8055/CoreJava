package dec6;

public class wayStringDefine {

	public static void main(String[] args) {
		
		//string litterl location direct heap memory
		String s="p";
		
		//String  create using new keyword OR create object of String class
		// memory first in heap and then heap memory
		String s1=new String("P");
		System.out.println(s.compareTo(s1));
		
	}

}
