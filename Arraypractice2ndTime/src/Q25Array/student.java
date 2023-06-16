package Q25Array;

public class student {

		int rollno;
		String name;
		int marks;
		student(int rollno,String name,int marks)
		{
			this.rollno=rollno;
			this.name=name;
			this.marks=marks;
		}
		@Override
		public String toString() {
			return "student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
		}
		
}
