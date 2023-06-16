package test23septillpattern;

import java.util.Iterator;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for (int i = 0; i < 9; i++) {
	for (int j = 0; j < 10; j++) {
		if (j-i<=0&&i>=4&&j+i<=12&&i>=4) 
		System.out.print("*");	
		else 

		System.out.print(" ");
		
	}
	System.out.println();
}
	}

}
