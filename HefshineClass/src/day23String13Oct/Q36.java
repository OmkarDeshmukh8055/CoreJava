package day23String13Oct;

import java.io.StringReader;

public class Q36 {

	public static void main(String[] args) throws Exception {
String s= "jdk";

StringReader sr=new StringReader(s);

int len=0;
while(sr.read()!=-1)
	len++;
System.out.println(len);
	}

}
