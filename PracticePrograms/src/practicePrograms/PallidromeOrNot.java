package practicePrograms;

import java.util.Scanner;

public class PallidromeOrNot {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter an integer number to find Pallindrome or not");
		int i=scn.nextInt();
		scn.close();
		
		int sum=0,r=0,temp=i;
		
		while(i>0){
			
			r=i%10;
			sum=(sum*10)+r;
			i=i/10;
		}
		System.out.println(temp);
		System.out.println(sum);
		
				if(temp==sum) {
					
					System.out.println("Given number is Pallindrome");
				}
				else {
					System.out.println("Given number is not Pllindrome");
				}

	}

}
