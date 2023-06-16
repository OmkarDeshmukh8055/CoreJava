package BufferAndBuilder;

public class Method {

	public static void main(String[] args) {
		
		String s="omkar";
		StringBuffer s1=new StringBuffer(s);
		
		System.out.println(s1);
		
		s1.append(" Deshmukh ");
		System.out.println(s1);
		s1.insert(5, " Abasaheb");
		System.out.println(s1);
		
		s1.delete(2, 5);
		System.out.println(s1);
		s1.setCharAt(20, '.');
		System.out.println(s1);

		
	}

}
