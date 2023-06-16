package MCQ;

class h {
	public static void main(String[] args) {

		int x = 2;
		int y = 0;
		for (; y < 10; ++y) {
			if (y % x == 0)
				continue;
			else if (y == 8)
				break;
			else
				System.out.print(y + " ");
		}
		System.out.println();
	            String a = "hello i love java";
	            System.out.println(a.indexOf('e')+" "+a.indexOf('a')+" "+a.lastIndexOf('l')+" "+a.lastIndexOf('v'));
	        
	            Object[] names = new String[3];
	            names[0] = new Integer(0);
		
	}
}