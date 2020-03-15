package practicePrograms;

public class Pattern04 {

public static void main(String[] args) {
		
	int rows=5;
	
    for (int i=1; i<=rows; i++) 
    { 
        for (int j=1; j<i; j++) // Print space in increasing order
        {
            System.out.print(" ");
        }
        for (int k=i; k<=rows; k++)  // Print star in decreasing order
        {
            System.out.print("*");
        }
        System.out.println();
    }
 


	}
}
