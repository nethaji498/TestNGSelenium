package eMexoCoreJava;

public class Quiz {

	public static void main(String[] args) {
		
		for(int i=0;i<=5;i++) {
			if(i==4)
			{
				break;
				//continue;
				//System.out.println("For loop broken");   Unreachable core error
			}
			
			System.out.println(i);
			
		}

	}

}
