package practicePrograms;

public class BeggestNumberFromArray {

	public static void main(String[] args) {
		
		int[] a= {1,5,8,99,18};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			
		if(max<a[i]) {
			max=a[i];
		}
				
			}
		System.out.println(max);
		}
		

	}
