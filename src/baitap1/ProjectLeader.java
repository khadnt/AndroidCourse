package baitap1;
import java.util.ArrayList;
import java.util.List;

public class ProjectLeader extends Programmer{
	private List<Programmer> programmers;  
	
	public ProjectLeader(String aName, int aMonthsalary, String alanguage){
		super(aName, aMonthsalary, alanguage);
		this.programmers = new ArrayList<Programmer>(); 
	
	}
	
	public void addProgrammer(Programmer programmer){
		programmers.add(programmer);
	}
	
	public void display(){
		System.out.println("ProjectLeader is: ");
		super.display(); 
		System.out.println("lead members:: ");
		for (Programmer programmer : programmers) {
			  programmer.display();
			 } 
	}
}
