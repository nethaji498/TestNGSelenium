package arrayExamples;

public class MaxValueFromArray {

	public static void main(String[] args) {
		int a[][]= {{2,4,5},{3,4,7},{1,7,8}};
		int max=a[0][0];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(max<a[i][j]) {
					max=a[i][j];
				}
			}
		}
		System.out.println(max);

	}

}
