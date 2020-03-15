package practicePrograms;

import java.util.Scanner;

public class Pattern07 {

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

		for(int i=1;i<=rows;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
				}
			for(int k=i;k<=rows;k++) {
				System.out.print("* ");
			}
			for(int l=1;l<=i;l++) {
				System.out.print(" ");
			}
			
			System.out.println();
		}



	}

}
