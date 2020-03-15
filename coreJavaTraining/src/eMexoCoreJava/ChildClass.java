package eMexoCoreJava;

public class ChildClass extends ParentClass {

	ChildClass(){
		super();
		System.out.println("Constructor of child");
		
	}
	void disp() {
		super.disp();
		System.out.println("Child Method");
		
	}
	public static void main(String[] args) {
		ParentClass c=new ChildClass();
		c.disp();

	}

}
