package eMexoCoreJava;

public class Main210201 {

	public static void main(String[] args) {
		
		ParentClass210201 pc=new ParentClass210201();
		pc.methodp1();
		pc.methodp2();
		
		ChildClass210201 cc=new ChildClass210201();
		cc.methodp1();
		cc.methodp2();
		
		ParentClass210201 pc1=new ChildClass210201();  //Up Casting
		pc1.methodp1();
		pc1.methodp2();
		
		ChildClass210201 cc1=(ChildClass210201)(new ParentClass210201());  //Down Casting
		cc1.methodp1();
		cc1.methodp2();

	}

}
