package testPracticetillOct23;

public class kaprekar {

	public static void main(String[] args) {
      
 int num=5;
 int num1=num;
int  digitcount=0;
 while(num1>0)
 {
	 digitcount++;
	 num1= num/10;
 }
 int squre=num*num;
 int d=(int)Math.pow(10, squre);
 
 int part1=squre/d;
 int part2=squre%10;
 if(part1+part2==num)
	 System.out.println("kaprekar Num"); 
 else
	 System.out.println("not");
	}

}
