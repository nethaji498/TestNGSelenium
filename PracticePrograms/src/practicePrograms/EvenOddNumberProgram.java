package practicePrograms;

import java.util.Scanner;

public class EvenOddNumberProgram {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter an integer number to find Even or Odd");
		int i=scn.nextInt();
		
		if(i==0) {
			System.out.println("It is a first non negative even number");
		}
			else if(i%2==0){
				System.out.println("It is an Even Number");
			}
			else {
				System.out.println("It is a Odd Number");
			}
			scn.close();
		}

	}


