package org.lab3;

public class Main {
	public static void main(String[] args) {
		Intern starzysta = new Intern("Janusz", "Jakiś", "1980-01-01");
		starzysta.setManager("Marcin Bąk");
		starzysta.setScholarship(true);
		printWorker(starzysta);

		Worker pracownikFizyczny = new Worker("Marek", "Wąski", "1980-01-01");
		pracownikFizyczny.setManager("Marcin Nowak");
		pracownikFizyczny.setHourlyRate(20);
		pracownikFizyczny.setOvertime(20);
		pracownikFizyczny.setWorkedHours(168);
		pracownikFizyczny.AddSkill("Licencja na zabijanie");
		printWorker(pracownikFizyczny);

		WhiteCollar pracownikUmysłowy = new WhiteCollar("Marcin", "Bąk", "1980-01-01");
		pracownikUmysłowy.setManager("Marcin Nowak");
		pracownikUmysłowy.setSalary(5000);
		pracownikUmysłowy.setPercentageBonus(15);
		pracownikUmysłowy.setPhoneNmber("123-456-789");
		pracownikUmysłowy.setRoomNumber(44);
		printWorker(pracownikUmysłowy);

		Manager kierownik = new Manager("Marcin", "Nowak", "1980-01-01");
		kierownik.setDepartment("Marketing");
		kierownik.setSalary(8000);
		kierownik.setPercentageBonus(15);
		kierownik.setManagerBonus(1200);
		kierownik.setPhoneNmber("123-456-789");
		kierownik.setMobilePhoneNmber("987-654-321");
		kierownik.setRoomNumber(44);
		printWorker(kierownik);

		BoardMember członekRadyNadzorczej = new BoardMember("Marcin", "Bąk", "1980-01-01");
		członekRadyNadzorczej.setSalary(8000);
		członekRadyNadzorczej.setAssistant("Nowak Janina");
		członekRadyNadzorczej.setBoardMeetingCounter(5);
		printWorker(członekRadyNadzorczej);


	}

	public static void printWorker(Employee worker) {
		worker.getInformation();
		System.out.println("Pensja to: " + worker.calculateSalary() + "\n");
	}
}
