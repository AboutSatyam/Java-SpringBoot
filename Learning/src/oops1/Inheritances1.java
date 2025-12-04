package oops1;

class Telusko {
	int age;

	void disp() {
		age = 110;
		System.out.println("The Telusko Is " + age + " Year Old");
	}
}

class Sir extends Telusko {

}

public class Inheritances1 {

	public static void main(String[] args) {
		Sir A1 = new Sir();
		A1.disp();
	}

}
