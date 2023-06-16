package Q25Array;

public class output {

	public static void main(String[] args) {
		student []s=new student[10];

		s[0] =new student(10, "abhi", 99);
		s[1]=new student(1, "balu", 71);
		s[2]=new student(2, "chandu", 52);
		s[3] =new student(3, "pooja", 90);
		s[4]=new student(4, "Elahi", 44);
		s[5] =new student(5, "jaydeep", 76);
		s[6] =new student(6, "kapil", 77);
		s[7] =new student(7, "sujit", 75);
		s[8] =new student(8, "omkar", 60);
		s[9]=new student(9, "sachin", 85);

		
		for (int i = 0; i <s.length; i++)
		{

		for (int j = i+1; j < s.length; j++) 
		{
			if(s[i].marks>s[j].marks)
			{
				student temp=s[i];
				s[i]=s[j];
				s[j]=temp;
			}
		}
		} 
		for (int i = 0; i < s.length; i++)
		{
			System.out.println(s[i]);
		}

	}

}
