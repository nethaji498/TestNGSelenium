package practicePrograms;

public class SmallestNumberFromArray {

	public static void main(String[] args) {
        int[] a= {77,5,8,99,18};
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(min>a[i]) {
				min=a[i];
			}
		
			}
		
		System.out.println(min);
		}
		

	

	}

