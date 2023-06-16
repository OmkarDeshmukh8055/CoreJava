package day18;

public class sortingArrayStudent  {

	public static void main(String[] args) {
student s1=new student(1, "somu",40);
student s2=new student(2, "gomu",41);
student s3=new student(3, "somya",38);
student s4=new student(4, "gomya",39);

student []s= {s1,s2,s3,s4};
for (int i = 0; i < s.length; i++) {
	for (int j = 0; j < s.length; j++) 
	{
		if(i<j && s[i].marks>s[j].marks)
		{
		student temp=s[i];
		s[i]=s[j];
		s[j]=temp;
		
		}}
}
	for (int i = 0; i < s.length; i++) {
		System.out.println(s[i].rn+" "+s[i].name+" "+s[i].marks);
	
	}}
}
