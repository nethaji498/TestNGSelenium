package newpackage;

class A {
	int x = m1();

	int m1() {
		System.out.println("Class A Method M1");
		return 50;
	}
}

class B extends A {
	int y = m1();

	int m1() {
		System.out.println("Class B Method M1");
		return 60;
	}
}

public class AB {

//	//public static void main(String[] args) {
//		B b = new B();
//		System.out.println(b.x);
//		System.out.println(b.y);

	//}

}
