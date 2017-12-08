package baitap1;

public class Main {

	public static void main(String[] args) {
	
		SoftwareHouse sh = new SoftwareHouse("VNPT Tien Giang");
		
		Programmer p1 = new Programmer("kha", 100, "PHP");
		Programmer p2 = new Programmer("Duy", 500, "C++");
		Programmer p3 = new Programmer("Cuong", 700, "Java");
		
		ProjectLeader pl1 = new ProjectLeader("Mai Xuan 4", 1000, "C#");
		ProjectLeader pl2 = new ProjectLeader("Vo Vi Trung", 1000, "C--");
		
		pl1.addProgrammer(p3);
		pl1.addProgrammer(p2);
		
		pl2.addProgrammer(p1);
		
		sh.addProgrammer(p1);
		sh.addProgrammer(p2);
		sh.addProgrammer(p3);
		
		sh.addProjectLeader(pl1);
		sh.addProjectLeader(pl2);
		
		sh.displayStaff();
		
	}
}
