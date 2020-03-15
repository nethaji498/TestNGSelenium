package stringExamples;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String str1=scn.next();
		for(int i=0;i<=str1.length()-1;i++) {
			System.out.print(str1.charAt(i));
			System.out.print(" ");
		}
//		System.out.println(str1);
		
	}

}
