package testoct5tillArray;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {1,2,3,8,5,6};

int large1=0;

for (int i = 0; i < a.length; i++) {
	if(large1<a[i])
		
		large1=a[i];
}System.out.println(large1);

int large2=0;

for (int i = 0; i < a.length; i++) {
	if(large1!=a[i])
	if(large2<a[i])
		large2=a[i];
		
}System.out.println(large2); 
	}
}
