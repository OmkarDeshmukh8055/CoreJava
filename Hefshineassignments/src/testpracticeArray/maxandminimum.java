package testpracticeArray;

public class maxandminimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {11,32,11,23,43,545,76,65	};
int max=a[0];
for (int i = 0; i < a.length; i++) {
	if(max<a[i])
		max=a[i];
}
	System.out.println(max);
	
	int mini=a[0];
	for (int i = 0; i < a.length; i++) {
		if(mini>a[i])
			mini=a[i];
		
	}System.out.println(mini);
}

}
