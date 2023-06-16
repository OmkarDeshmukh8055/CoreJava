package day3;

public class cw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int basicsalery=30000;
if (basicsalery<=10000)
{
	double grossalery=basicsalery + basicsalery*0.2 + basicsalery*0.8;
System.out.println(grossalery);
}
else if(basicsalery<=20000) {
double grossalery=basicsalery + basicsalery*0.25 + basicsalery*0.95;
System.out.println(grossalery);
}
else  {
double grossalery=basicsalery + basicsalery*0.2 + basicsalery*0.8;
System.out.println(grossalery);
}

	}

}
