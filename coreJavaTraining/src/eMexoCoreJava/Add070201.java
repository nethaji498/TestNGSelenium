package eMexoCoreJava;

public class Add070201 {

	public static void main(String[] args) {
	/*  byte b1=10;
		byte b2=20;
		byte b3=(byte)(b1+b2);   //Casting. Can not convert from int0 byte
		System.out.println(b3);  */
		
		byte b1=20,b2=20;    //local variable may not have been initialized
		int i =b1+b2;        //byte b1=b2=20 not valid
		System.out.println(i);
		
	}

}
