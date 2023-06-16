package testoct5tillArray;

public class q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []a= {1,2,3,4,5,6,7};

int temp=a[a.length-1];
for (int i =  a.length-2; i >=0; i--) 
     {
	a[i+1]=a[i];
	
     }	
a[0]=temp;
for (int i= 0; i< a.length; i++) {
	
System.out.println(a[i]);
   }
        }
            
}
