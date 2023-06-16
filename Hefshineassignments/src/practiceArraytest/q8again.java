package practiceArraytest;

public class q8again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {11,22,33,44,55,66,77};

int temp=a[a.length-1];
for (int i = a.length-2;i>=0; i--) {
	a[i+1]=a[i];
	
    }
	a[0]=temp;
	
for (int i = 0; i < a.length; i++) {
	System.out.println(a[i]);
}
	}

}
