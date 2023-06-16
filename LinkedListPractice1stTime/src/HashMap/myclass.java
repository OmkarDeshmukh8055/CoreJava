package HashMap;

public class myclass {

	public static void main(String []args)
	{
		myHashmap<Integer,String> H=new myHashmap<>();
		H.put(1, "sachin");
		H.put(2, "dada");
		H.put(1, "SACHIN");
		H.put(2, "DADA");
				H.print();
	}
}
