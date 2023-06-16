package day3;

public class grosssallery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int basicsallery=10000;

if(basicsallery<=10000) {
	double grossallery=basicsallery+basicsallery*0.2 + basicsallery*0.8;
	System.out.println(grossallery);
	
}
else if(basicsallery<=110000) {
	double grossallery=basicsallery+basicsallery*0.3+basicsallery*0.95;
	System.out.println(grossallery);
	
}
else {
	double grossallery=basicsallery+basicsallery*0.3+basicsallery*0.9;
	System.out.println(+grossallery);
}
}

	}
