package AssignmentOct18;

public class removeSpecificElement {

	public static void main(String[] args) {
    
	
	int a[]= {1,23,2,3,4,5};
	int i=0;
		int num=23;
		remove(a,i,num);
	}

	private static void remove(int[] a, int i, int num) {
        if(i<a.length)
        {
        	if(a[i]!=num)
      
        		System.out.println(a[i]);
        	remove(a,i+1,num);
        }
	}

}
