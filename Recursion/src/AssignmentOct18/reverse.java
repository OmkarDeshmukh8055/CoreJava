package AssignmentOct18;

public class reverse {

	public static void main(String[] args)
	{
		int a[] = { 1, 2,3,4,5,6,7,8,9 };

		int i = 0;
		int j = a.length - 1;

		reverse(a, i, j);

	}

	private static void reverse(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		if (i < a.length) 
		{
			if (i < j) 
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;

				reverse(a, ++i, --j);

			} 
			else
			{
				int index = 0;
				myArrayElement(a, index);
			}
		}
	}

	private static void myArrayElement(int[] a, int index)
	{
		
        if(index<a.length)
        {
		System.out.println(a[index] + " ");
		myArrayElement(a, ++index);
        }
	}

}
