package org.lab3;

import java.util.ArrayList;

public class Worker extends Employee {
	private String manager;
	private double hourlyRate;
	private double workedHours;
	private double overtime;
	private ArrayList<String> skills = new ArrayList <String>();

	public Worker(String name, String surname, String birtdate) {
		super(name, surname, birtdate);
	}
	public void getInformation() {
		super.getInformation();
		System.out.println("Kierownik: " + manager);
		System.out.println("Stawka godzinowa: " + hourlyRate);
		System.out.println("Przepracowane godziny: " + workedHours);
		System.out.println("Przepracowane Nadgodziny: " + overtime);
		System.out.println("Umiejętności: ");
		for (String string : skills) {
			System.out.println(string);
		}
	};

	public double calculateSalary () {
		return hourlyRate*workedHours+1.5*hourlyRate*overtime;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public double getWorkedHours() {
		return workedHours;
	}
	public void setWorkedHours(double workedHours) {
		this.workedHours = workedHours;
	}
	public double getOvertime() {
		return overtime;
	}
	public void setOvertime(double overtime) {
		this.overtime = overtime;
	}
	public ArrayList<String> getSkills() {
		return skills;
	}
	public void AddSkill(String skill) {
		this.skills.add(skill);
	}
}
