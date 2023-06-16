package practiceArraytest;

public class q3again {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {1,4,54,7,5,98,89};
int max=0;

for (int i = 0; i < a.length; i++) {
	
	if(max<a[i]) {
		max=a[i];
}}	

System.out.println(max);

int max2=0;
for (int i = 0; i < a.length; i++) {
	if (max!=a[i] && max2<a[i])
		max2=a[i];
}
System.out.println(max2);
	}

}
