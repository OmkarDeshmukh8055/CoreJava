package day17;

public class sadle {

	public static void main(String[] args) {
int [][]a= {{6,3,1},
		   {9,7,8},
		   {2,4,5}};
for (int i = 0; i < a.length; i++) {
	for (int j = 0; j < a.length; j++) {
		int smallelement=0;
		int largeelement=0;
		
		for (int k = 0; k < a.length; k++) {
			for (int k2 = 0; k2 < a.length; k2++) {
				if(k==i)
				{
					if (a[k][k2]<a[i][j])
						smallelement++;
				}
				else
					if(k2==j)
					{
						if(a[k][k2]>a[i][j])
							largeelement++;
					
				}
			}
		}
	if(smallelement==0 && largeelement==0)
		System.out.println("saddle point "+a[i][j]);
}}

}
	}


