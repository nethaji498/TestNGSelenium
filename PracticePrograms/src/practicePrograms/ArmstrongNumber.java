package practicePrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Please enter a number");
		int i =scn.nextInt();                  //345
		int count=0;
		int total=i;
		scn.close();
		
		while(i>0) {
			
			int a=i%10;
			i=i/10;
			count=count+(a*a*a);
		}
		System.out.println(i);
		System.out.println(total);
		System.out.println(count);
	if(total==count)System.out.println("Number is amstrong");
	else System.out.println("Number is not amstrong");
			
			
		}
	}


