package arrayExamples;

public class Multidimensional {

	public static void main(String[] args) {
		
		//a[rows][columns]
		
		int a[][] = new int[2][3];
		int b[][]= {{2,4,5},{3,4,7},{6,7,8}};
		
		a[0][0]=2;
		a[0][1]=4;
		a[0][2]=5;
		
		a[1][0]=3;
		a[1][1]=4;
		a[1][2]=7;
//		System.out.println(a[1][1]);
//		System.out.println(a.length);
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(b[i][j]+"\t");
		}
		System.out.println();
	}

}
}
