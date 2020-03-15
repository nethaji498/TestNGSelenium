package stringExamples;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String str1=scn.next();
		scn.close();
		String str2="";
		String str3="";
		
		for(int i=0;i<=str1.length()-1;i++) {
			if(97<=str1.charAt(i) && str1.charAt(i)<=122) {
				str2=str2+str1.charAt(i);
			}
			else str3=str3+str1.charAt(i);
		}
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str2+str3);
		
	}

	private static int charAt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
