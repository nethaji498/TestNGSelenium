package coreJavaTraining;

public class NestedLoop {

	public static void main(String[] args) {
		
		int k=3;		
		for (int i=1;i<=3;++i) {
			
			//System.out.println("Outer loop start");
			
			for(int j=1;j<=i;++j) {
				
				System.out.print(k+"\t");
				k=k+3;
			}
			
		System.out.println("\n");
		}
	}

}
