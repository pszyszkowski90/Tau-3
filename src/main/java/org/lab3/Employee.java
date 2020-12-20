package org.lab3;

public abstract class Employee implements ICaneBeAEmployee {
	private String name;
	private String surname;
	private String birthdate;

	public Employee (String name,String surname,String birtdate) {
		this.name = name;
		this.surname = surname;
		this.birthdate = birtdate;
	}

	public void getInformation() {
		System.out.println("Imię: " + name);
		System.out.println("Nazwisko: " + surname);
		System.out.println("Data urodzenia: " + birthdate );
	}

	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getBirthdate() {
		return birthdate;
	}


}
