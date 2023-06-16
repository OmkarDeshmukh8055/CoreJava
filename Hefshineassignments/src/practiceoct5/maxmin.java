package practiceoct5;

public class maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,2,3,14,5};
		
		int max=a[0];
		
		int min=a[0];
		for (int i = 0; i < a.length; i++) {
			if(max<a[i])
			
				max=a[i];
							else if (min>a[i])
			
				min=a[i];
		
		}		
		System.out.println("max "+max); 
			System.out.println(min);
		
		}
	}
	


