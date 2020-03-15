package practicePrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Enter a number upto which fibonacci series to print");
		
		int number=new Scanner(System.in).nextInt();
		int temp=0;
		int first=0;
		int second=1;
		for(int i=0;first<=number;i++) {
			
			System.out.print(first + " \t");
			int sum = first + second;
            first = second;
            second = sum;
            			
		}

	}

}
