package day2ndoctARRY;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {1,2,3,4,5,6,7};

int []b=new int [a.length];
int i=0;
int j=0;

while(i<a.length && j<b.length) {
	b[i]=a[i];
	i++;
	j++;
	
}for (int k = 0; k < b.length; k++) {
	System.out.println(b[k]);
}
	}

}
