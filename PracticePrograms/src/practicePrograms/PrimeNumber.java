package practicePrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number=");
		int n=sc.nextInt();
		sc.close();
		if(n==1)System.out.println("Prime Number");
		else {
		for(int i=2;i<n;i++) {
			
			if(n%i==0){
				flag=true;
				System.out.println("Nember is not a Prime Number");
				break;
			}
		}
		}
		if(flag==false)
			System.out.println("Number is a Prime");
		}

	}
