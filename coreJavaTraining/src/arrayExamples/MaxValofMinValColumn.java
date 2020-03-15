package arrayExamples;

public class MaxValofMinValColumn {

	public static void main(String[] args) {
		int a[][] = { { 3, 3, 5 }, { 4, 11, 9 }, { 9, 3, 1 } };
		int min = a[0][0];
		int minnumcolumn = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (min > a[i][j]) {
					min = a[i][j];
					minnumcolumn = j;
				}
			}
		}
		System.out.println(minnumcolumn);
		int maxnumber = 0;
		for (int i = 0; i < 3; i++) {
			if (maxnumber < a[i][minnumcolumn]) {
				maxnumber = a[i][minnumcolumn];
			}
		}
		System.out.println(maxnumber);
	}

}
