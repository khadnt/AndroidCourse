package baitap1;


public class Programmer extends Employee {
	private String language;
	
	public Programmer(String aName, int aMonthSalary, String aLanguage) {
		super(aName, aMonthSalary);
		this.language = aLanguage;
	}
	
	public void display(){
		super.display(); 
		System.out.println("Has programming language: " + this.language);
	}
}
