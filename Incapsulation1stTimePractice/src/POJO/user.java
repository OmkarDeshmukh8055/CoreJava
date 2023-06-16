package POJO;

public class user {

	public static void main(String[] args) throws Exception {
		
// constructor without paramiter
car pojo=new car();

pojo.setNumOfWheels(5);
pojo.setNumOfGears(10);
System.out.println(pojo.getNumOfWheels());
System.out.println(pojo.getNumOfGears());

System.out.println(pojo.toString()); 

//constructor with paramiter
System.out.println();
System.out.println("2nd ");
System.out.println();

car pojo1=new car(4, 4);

System.out.println(pojo1.getNumOfWheels());
System.out.println(pojo1.getNumOfGears());

System.out.println(pojo1.toString()); 


}

}
