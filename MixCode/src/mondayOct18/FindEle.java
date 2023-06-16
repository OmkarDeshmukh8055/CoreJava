package mondayOct18;

public class FindEle {

	public static void main(String[] args) {
int a[]= {1,2,3,4,5,6,7};
int num=5;
int i=0;
found(a,i,num);
	}

	private static void found(int[] a, int i, int num) {

            if(i<a.length)
            {
            	if(num==a[i])
            	{
            		System.out.println("found "+i);
            	}
            	else 
            	{
            		found(a,++i,num);
            }
            }
            	else
            		System.out.println("not found");
         
	}

}
