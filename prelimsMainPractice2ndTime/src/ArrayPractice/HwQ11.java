package ArrayPractice;

public class HwQ11 {

	public static void main(String[] args) {

          int a[]= {1,2,3,3,2,1,1};
          int count=0;
          for (int i = 0; i < a.length; i++)
          {
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]==a[j])
			    {
					count++;
					break;
				}

			}
		}
          System.out.println(count);
          int b[]=new int [a.length-count];
              int index=0;

          for (int i = 0; i < a.length; i++) 
          {
              int countB=0;

			for (int j = 0; j < b.length; j++) 
			{
				if(b[j]==a[i])
					countB++;
			}
				if(	countB==0)
					b[index++]=a[i];
		 }
          for (int i = 0; i < b.length; i++) 
          {
			System.out.println(b[i]);
		}
	}

}
