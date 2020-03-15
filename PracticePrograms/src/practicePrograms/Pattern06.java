package practicePrograms;

import java.util.Scanner;

public class Pattern06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows");
		int rows=sc.nextInt();
		sc.close();
		for(int i=1;i<=rows;i++) {
			
			for(int j=i;j<=rows;j++) {
				System.out.print(" ");
				}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			for(int l=1;l<=rows;l++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}

	}

}
