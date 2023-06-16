package day12;

public class person {

	String PName;
	int PAdhaarNo;
	String JobName;
	String PJobId;
	String PJobLocation;
	
	college c=new college("sai","latur");
	
	
	person(String PName,int PAdhaarNo,	String JobName,	String PJobId,	String PJobLocation	)
	{
		
		this. PName=PName;
		this. PAdhaarNo=PAdhaarNo;
		this. JobName=JobName;
		this. PJobId=PJobId;
		this. PJobLocation=PJobLocation;
		
	}

	void Display()
	{
	
		System.out.println("PName="+PName+" "+" PAdhaarNo="+PAdhaarNo+" "+" JobName="+JobName+" "+ " PJobLocation="+PJobLocation);
	}
}
