package testpractice22sep;
import java.util.*;
public class profitorloss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enterMRP  "+"  enter costprice"); 
int mrp=sc.nextInt();
int costprice=sc.nextInt();
if(mrp<costprice)
	System.out.println("loss");
else
	System.out.println("profit");
	}

}
