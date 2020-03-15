package eMexoCoreJava;

import java.util.Scanner;

public class Main130201 {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter 1st value");
		int i=scn.nextInt();
		System.out.println("Enter second value");
		int j=scn.nextInt();
		Add130201 a =new Add130201(i, j);
		a.add();
		

	}

}
