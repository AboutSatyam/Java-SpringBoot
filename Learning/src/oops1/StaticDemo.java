package oops1;

class Demo1 {
	static int a;

	public static void disp() {
		int a = 12;
		System.out.println(a);
	}

}

class Demo2 extends Demo1 {

}

public class StaticDemo {

	public static void main(String[] args) {

		Demo2 d2 = new Demo2();
		d2.disp();
		Demo2.disp();
	}
}
