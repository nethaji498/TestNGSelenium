package practicePrograms;

import java.util.Scanner;

public class NumberOfTimesCharacterRepeated {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String str1=scn.next();
		scn.close();
		int count=0;
		for(int i=0;i<=str1.length()-1;i++) {
			
			for(int j=0;j<=str1.length()-1;j++) {
				
				if(str1.charAt(i)==str1.charAt(j))
				count=count+1;
				
			}
			System.out.println(str1.charAt(i)+" is repeated "+count+" number of times");
			count=0;
		}
		//System.out.println(str1.charAt(i)+" is repeated "+count+" number of times");

	}

}
