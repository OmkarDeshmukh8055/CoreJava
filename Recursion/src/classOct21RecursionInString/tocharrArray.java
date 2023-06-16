package classOct21RecursionInString;

import java.util.Arrays;

public class tocharrArray {

	public static void main(String[] args) {
         String s="abc@PQR";
         char []ca=new char [s.length()];
         int i=0;
         toCharArray(s,ca,i);
         System.out.println(Arrays.toString(ca)); 
	}

	private static void toCharArray(String s, char[] ca, int i) {
           if(i<ca.length)
           {
        	   ca[i]=s.charAt(i);
        	   toCharArray(s,ca,i+1);
           }
	}

}
