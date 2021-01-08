package org.lab3;

public class Manager extends Employee {
	private double salary;
	private double percentageBonus;
	private double managerBonus;
	private String phoneNmber;
	private String mobilePhoneNmber;
	private String department;
	private int roomNumber;

	public Manager(String name, String surname, String birtdate) {
		super(name, surname, birtdate);
	}
	public String getInformation() {
		super.getInformation();
		System.out.println("Kierownik działu: " + department);
		System.out.println("Pensja: " + salary);
		System.out.println("Procent premii: " + percentageBonus);
		System.out.println("Premia kierwnicza: " + managerBonus);
		System.out.println("Numer telefonu: " + phoneNmber);
		System.out.println("Numer telefonu komórkowego: " + mobilePhoneNmber);
		System.out.println("Numer pokoju: "+ roomNumber);
		return "Kierownik działu: " + department;
	}

	public double calculateSalary () {
		return salary+percentageBonus*salary/100 + managerBonus;
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
	public double getManagerBonus() {
		return managerBonus;
	}
	public void setManagerBonus(double managerBonus) {
		this.managerBonus = managerBonus;
	}
	public String getPhoneNmber() {
		return phoneNmber;
	}
	public void setPhoneNmber(String phoneNmber) {
		this.phoneNmber = phoneNmber;
	}
	public String getMobilePhoneNmber() {
		return mobilePhoneNmber;
	}
	public void setMobilePhoneNmber(String mobilePhoneNmber) {
		this.mobilePhoneNmber = mobilePhoneNmber;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}


}

