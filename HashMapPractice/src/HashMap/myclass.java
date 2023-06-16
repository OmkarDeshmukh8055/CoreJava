package HashMap;

public class myclass {

	public static void main(String []args)
	{
		myHashmap<Integer,String> H=new myHashmap<>();
		H.put(1, "One");
		H.put(6, "Two");
		H.put(11, "One");
		H.put(16, "Two");
		H.put(1, "1");
		H.put(21, "Two");
		H.put(15, "One");
		H.put(10, "Two");
	
		
	//H.replace(1, "OnnE");
//H.replace(3, "three"); // this method is used for only Update.  && put method works both 1.add new 2. update/replace
	//H.remove(16);	
		H.print();
	}
}
