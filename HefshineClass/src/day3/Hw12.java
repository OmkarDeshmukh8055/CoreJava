package day3;

public class Hw12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1=41;
		int m2=40;
		int m3=42;
		int m4=42;
		int m5=41;
		int m6=40;
	
		int total=m1+m2+m3+m4+m5+m6;
		int avr=total/6;
		
		if(avr>=90) 
			System.out.println("A grade");
			else if(avr<90 && avr>80) 
				System.out.println("B grade");
				else if(avr<80 && avr>70) 
							System.out.println("c grade");
				else		
					System.out.println("D grade");
		
				
		}
			
		
	}

