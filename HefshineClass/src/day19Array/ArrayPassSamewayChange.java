package day19Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPassSamewayChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]a= {1,2,3,4,5,7,8,9,6};
System.out.println(Arrays.toString(a));
print(a);
System.out.println(Arrays.toString(a));

}
	public static void  print(int[] b) {
		
		for (int i = 0; i < b.length; i++) {
			b[i]=0;
		}
	}
}