package eMexoCoreJava;

public class Add110201 {

	int i=20,j=30;
	
	public int add() {
		
		return(i+j);
	}
	
	
	public static void main(String[] args) {
		

		Add110201 a =new Add110201();
		int Sum=a.add();
		System.out.println(Sum);
		System.out.println(a.add());
	}

}
