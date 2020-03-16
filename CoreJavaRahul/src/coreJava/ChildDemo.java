package coreJava;

public class ChildDemo extends ParentDemo {

	//String name="Nethaji";
	public void getString() {
		System.out.println(name);
		System.out.println(super.name);
	}
	public static void main(String[] args) {
		
		
		ChildDemo cd=new ChildDemo();
		cd.getString();
	}

}
