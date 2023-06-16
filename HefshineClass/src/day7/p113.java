package day7;

public class p113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0;  i< 14;i ++) {
			for (int j = 0; j <18; j++) {
				if ((j+i>=3&&j-i>=-4&&j<=8&&j-i<=4))
					System.out.print("*");
			else if(j-i<=13 && j+i<=20&&j+i>=11&&j>=9)
				System.out.print("*");
			 else 
		System.out.print(" ");
				
			}
			System.out.println();

	}

}}
