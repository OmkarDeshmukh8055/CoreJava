package multiThreadingOct27;

public class Abcd {
	static Abcd abcd=new Abcd();
	public static Abcd abcdkaobjforT1;
	int count;
	public synchronized  void add()
	{
		count=count+1;

	}

}
