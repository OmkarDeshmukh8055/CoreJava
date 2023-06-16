package dec6;

public class kaprekarNum {

	public static void main(String[] args) {

		 int num=9;
		 int num1=num;
		 int sq=num*num;
		 
		 int cnt=0;
		 while(num1>0)
		 {
			 cnt++;
			num1= num1/10;
			 
		 }
		 int d=(int) Math.pow(10, cnt);
		 if(sq/d+sq%d==num)
		 {
			 System.out.println("kap");
		 }
		 else
			 System.out.println("not");
	}

}
