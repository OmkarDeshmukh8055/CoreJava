package day24String13Oct;

public class a {

	public static void main(String[] args) {
		int i = 0;
		m1(i);
	}

	private static void m1(int i) {
		System.out.println("hi");
		if (i < 5)
			m1(i + 1);
	}

}
