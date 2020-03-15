package practicePrograms;

import java.util.Scanner;

public class Swapping2Numbers {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	
	System.out.println("Enter First Number i");
	int i=scn.nextInt();
	
	System.out.println("Enter Second Number j");
	int j=scn.nextInt();
	scn.close();
	int k=i;
	i=j;
	j=k;
	System.out.println("First Number after swapping i "+i);
	System.out.println("Second Number after swapping j "+j);
}
}