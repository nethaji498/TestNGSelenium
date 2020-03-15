package practicePrograms;

import java.util.Scanner;

public class RepeatedPatternFinding {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String str1=scn.next();								//maavaaaacd  aa
		System.out.println("Enter Pattern to find");
		String str2=scn.next();
		int count=0;
		scn.close();
		System.out.println(str1.substring(0,2));
		System.out.println(str1.subSequence(0, 2));
		for(int i=0;i<=str1.length()-1;i++) {
			if(str1.subSequence(i,i+2)==str2)
				count=count+1;
			}
			System.out.println(str2+" is repeated "+count+" number of times");
			
		}
		
	}

