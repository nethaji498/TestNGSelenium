package eMexoCoreJava;

interface Mobile{
	public abstract void os();
	void processor();
}

class Samsung implements Mobile{

	public void os() {
		System.out.println("Android");
		
	}

	public void processor() {
		System.out.println("Exynos");
		
	}
	
	public void cameralens() {
		System.out.println("Samsung Lens");
	}
	
}

public class Main250201 {

	public static void main(String[] args) {
		
		//Mobile m=new Mobile(); can not create object for Interface
		Samsung s=new Samsung();
		s.cameralens();
		s.os();
		s.processor();
		
		Mobile m=new Samsung();
		m.os();
		m.processor();
		
	}

}
