package testpracticeArray;

public class q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {12,2,32,44,55,123,105,108};


		for (int i = 0; i < a.length; i++) {
			int num=a[i];
			int cnt=0;
			for (int j = i+1; j < a.length; j++) {
				
			
		if(a[j]>num)
			cnt++;


		}
			if(cnt==0) 
				System.out.println(num);
			
}}}