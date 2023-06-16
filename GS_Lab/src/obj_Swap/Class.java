package obj_Swap;

public class Class {

	public static void main(String[] args) {
		Student s1 = new Student(1, "omkar", 80);
		Student s2 = new Student(2, "nilesh", 70);
		Student s3 = new Student(3, "suraj", 75);
		Student s4 = new Student(4, "sachin", 99);

		Student sa[] = { s1, s2, s3, s4 };
		for (int i = 0; i < sa.length; i++) 
		{
			for (int j = i + 1; j < sa.length; j++) 
			{
				if (sa[i].marks > sa[j].marks) 
				{
					Student t = sa[i];
					sa[i] = sa[j];
					sa[j] = t;
				}
			}
		}
		for (int i = 0; i < sa.length; i++)
		{
			System.out.println(sa[i].rn+" "+sa[i].name+" "+sa[i].marks);
		}

	}

}
