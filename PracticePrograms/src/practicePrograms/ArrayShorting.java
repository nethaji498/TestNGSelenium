package practicePrograms;

public class ArrayShorting {

	public static void main(String[] args) {
		
		int[] i= {1,5,4,0,56,0,77,0,8,4,5};
		
		for(int j=0;j<i.length;j++){
			if(i[j]>0) {
				i[j]=i[j];
				System.out.print(i[j]+"\t");
			}
//			else i[i.length-j]=i[j];
				}
		System.out.println();
		for(int x:i) {
			System.out.print(x+"\t");
		}
		}
	}


