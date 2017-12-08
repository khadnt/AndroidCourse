package baitap1;

public class Employee {
	private String name;
	private int monthSalary;
	
	public Employee(String aName, int aMonthSalary){
		this.name = aName;
		this.monthSalary = aMonthSalary;
	}
	
	public void display(){
		System.out.println("Employee name is: " + name);
		System.out.println("Month salary: " + monthSalary);
	}

}
