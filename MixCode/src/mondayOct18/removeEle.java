package mondayOct18;

public class removeEle {

	public static void main(String[] args) {
int a[]= {1,2,3,44,4,5,6,7,8,9};
int num=44;
int i=0;
remove(a,i,num);
	}

	private static void remove(int[] a, int i, int num) {
if(i<a.length)
{
	if(num!=a[i])
		 System.out.println(a[i]);
	
		remove(a,++i,num);


}
}

}
