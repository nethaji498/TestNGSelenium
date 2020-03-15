package eMexoCoreJava;

import java.util.Scanner;

public class Main130202 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter 1st value");
		int i =scn.nextInt();
		System.out.println("Enter 2nd value");
		int j=scn.nextInt();
		Add130202 a=new Add130202(i, j);
		a.add();

	}

}
