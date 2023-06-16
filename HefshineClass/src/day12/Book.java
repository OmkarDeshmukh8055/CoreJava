package day12;

public class Book {
	
	String name;
	int price;
	String author;
	
	Author A=new Author("gomu",4321,"pune");
	Book(String name,int price,String author)
	{
		
		this.name=name;
		this.price=price;
		this.author=author;
		
	
	}
	
	void showdetails()
	{
		System.out.println("name "+name+" price "+"Authorname "+author);
	}

	
	

}
