package day18;

public class sortinganotherway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {11,78,24,56,23,50,82,64};
		for (int i = 0; i < a.length; i++) {
			int temp=a[i];
			int start=0;
			for (int j = i-1; j >=0; j--)
			{
				if(a[j]<temp)
				{
					start=j+1;
					break;
					
				}
			}
		 for (int k = i-1; k >=start; k--) 
		 {
			 a[k+1]=a[k];
		 }
		 a[start]=temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]+" "); 
		}
	}

}
