package baitap1;
import java.util.ArrayList;
import java.util.List;

public class SoftwareHouse {
	private String name; 
	private List<Programmer> programmers; 
	private List<ProjectLeader> projectLeaders; 
	
	public SoftwareHouse(String aName) {
		this.name = aName;
		this.programmers = new ArrayList<Programmer>(); 
		this.projectLeaders = new ArrayList<ProjectLeader>(); 
	}

	public void addProgrammer(Programmer programmer){
		programmers.add(programmer);
	}

	public void addProjectLeader(ProjectLeader projectLeader){
		projectLeaders.add(projectLeader);
	}
	
	void displayStaff() {
		System.out.println("Software House " + name + " has:");
		 for (Programmer programmer : programmers) {
			 programmer.display();
		 }
		 
		 System.out.println("With project has:");
		 for (ProjectLeader projectLeader : projectLeaders) {
			 projectLeader.display();
		 } 
	} 
}
