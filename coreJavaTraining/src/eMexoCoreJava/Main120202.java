package eMexoCoreJava;

public class Main120202 {

	public static void main(String[] args) {
		
		//1st Approach
		Add120202 a =new Add120202();
		a.add();
		System.out.println(a.i);
		System.out.println(a.j);
		
		//2nd Approach
		Add120202.add();
		System.out.println(Add120202.i);
		System.out.println(Add120202.j);

	}

}
