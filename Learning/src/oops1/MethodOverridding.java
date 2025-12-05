
package oops1;

class Animal {

	public void running() {
		System.out.println("animal is running");
	}

	void eating() {
		System.out.println("animal is eating");
	}

	private void craving() {
		System.out.println("animal is craving "); // // private member of class is not excuted conductor in case of
													// inheritances
	}

}

class Tiger extends Animal {

	public void running() {
		System.out.println("animal is running"); // if we write 'default' but in parent 'public' we do not decrese the
													// visibity of
													// access specifier ......... public --- default not posibiles
	}

	public void eating() {
		System.out.println("animal is eating"); // we can increase the visibity of access specifier " default --> public
												// ".
	}

//	private void craving() {
//		System.out.println("animal is craving ");
//	}

	void tigeronly() {
		System.out.println("Tiger only method");
	}
}

public class MethodOverridding {
	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.eating();
		t.running();
//t.craving(); // private member of class is not excuted conductor in case of inheritances
	}
}
