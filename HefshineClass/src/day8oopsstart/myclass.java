package day8oopsstart;

public class myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student s1=new student();
student s2=s1;
s1.rn=22;
s2.rn=33;
System.out.println(s1.rn+" "+s2.rn);
	}

}
