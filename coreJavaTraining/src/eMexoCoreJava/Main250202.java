package eMexoCoreJava;

class Student{
	private String name;
	private int id;
	private String schoolName;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	
	
	
}

public class Main250202 {

	public static void main(String[] args) {
		Student s=new Student();
		s.setName("Nethaji");
		s.setId(498);
		s.setSchoolName("LLF Hight School");
		System.out.println("ID"+"    "+"Name"+"       "+"School Name");
		System.out.println("-------------------------------------");
		System.out.println(s.getId()+"  "+s.getName()+"  "+s.getSchoolName());
		s.getName();
		s.getSchoolName();

	}

}
