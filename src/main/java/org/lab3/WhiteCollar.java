package org.lab3;

public class WhiteCollar extends Employee {
	private String manager;
	private double salary;
	private double percentageBonus;
	private String phoneNmber;
	private int roomNumber;

	public WhiteCollar(String name, String surname, String birtdate) {
		super(name, surname, birtdate);
	}
	public String getInformation() {
		super.getInformation();
		System.out.println("Kierownik: " + manager);
		System.out.println("Pensja: " + salary);
		System.out.println("Procent premii: " + percentageBonus);
		System.out.println("Numer telefonu: " + phoneNmber);
		System.out.println("Numer pokoju: "+ roomNumber);
		return "Kierownik: " + manager;
	}

	public double calculateSalary () {
		return salary+ percentageBonus*salary/100;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String supervisor) {
		this.manager = supervisor;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getPercentageBonus() {
		return percentageBonus;
	}
	public void setPercentageBonus(double percentageBonus) {
		this.percentageBonus = percentageBonus;
	}
	public String getPhoneNmber() {
		return phoneNmber;
	}
	public void setPhoneNmber(String phoneNmber) {
		this.phoneNmber = phoneNmber;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

}

