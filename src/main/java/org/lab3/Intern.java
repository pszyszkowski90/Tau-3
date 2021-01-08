package org.lab3;

public class Intern extends Employee {
	private final int scholarshipAmount = 500;
	private String manager;
	private boolean scholarship;


	public Intern(String name, String surname, String birtdate) {
		super(name, surname, birtdate);
	}
	public String getInformation() {
		super.getInformation();
		System.out.println("Opiekun: " + manager);
		System.out.println("Stypendium?: " + (scholarship ? "Tak" : "Nie"));
		return "Opiekun: " + manager +"Stypendium?: " + (scholarship ? "Tak" : "Nie");
	};

	public double calculateSalary () {
		return scholarshipAmount;
	}
	public boolean getScholarship() {
		return scholarship;
	}
	public void setScholarship(boolean scholarship) {
		this.scholarship = scholarship;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		if (manager.isEmpty()) {
			throw new IllegalArgumentException("Przekazano pusty parametr");
		}
		this.manager = manager;
	}

}
