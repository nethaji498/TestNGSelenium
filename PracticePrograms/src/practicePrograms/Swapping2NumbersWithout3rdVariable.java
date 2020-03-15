package practicePrograms;

import java.util.Scanner;

public class Swapping2NumbersWithout3rdVariable {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter First Number i");
		int i=scn.nextInt();
		
		System.out.println("Enter Second Number j");
		int j=scn.nextInt();
		scn.close();
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println("First Number after swapping i "+i);
		System.out.println("Second Number after swapping j "+j);

	}

}
