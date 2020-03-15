package stringExamples;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String to find palindrome or not");
		String str1=scn.next();
		String str2="";
		
		for(int i=str1.length()-1;i>=0;i--) {
			str2+=str1.charAt(i);
		}
		System.out.println(str1);
		System.out.println(str2);
		if(str1.equals(str2)) {
			System.out.println("Palindrome");
		}
		else System.out.println("Not a palindrome");
	}

}