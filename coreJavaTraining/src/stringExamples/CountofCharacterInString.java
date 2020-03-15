package stringExamples;

import java.util.Scanner;

public class CountofCharacterInString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String to find palindrome or not");
		String str1=scn.next();
		System.out.println("Enter character to find how many times repeated");
		char character=scn.next().charAt(0);
		scn.close();
		int count=0;
		for(int i=0;i<=str1.length()-1;i++) {
			
			if(str1.charAt(i)==character){
				count=count+1;
			}
			
		}
		System.out.println(count+" times "+ character +" repeated");
	}

}
