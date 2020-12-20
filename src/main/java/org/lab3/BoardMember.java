package org.lab3;

public class BoardMember extends Employee {
	private double salary;
	private String assistant;
	private int boardMeetingCounter;
	private final int rateOfBoardMeeting = 500;

	public BoardMember(String name, String surname, String birtdate) {
		super(name, surname, birtdate);
	}

	public void getInformation() {
		super.getInformation();
		System.out.println("Pensja: " + salary);
		System.out.println("Asystent: " + assistant);
		System.out.println("Ilość spotkań rady nadzorczej: " + boardMeetingCounter);

	}

	public double calculateSalary() {
		return salary + boardMeetingCounter * rateOfBoardMeeting;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAssistant() {
		return assistant;
	}

	public void setAssistant(String assistant) {
		this.assistant = assistant;
	}

	public int getBoardMeetingCounter() {
		return boardMeetingCounter;
	}

	public void setBoardMeetingCounter(int boardMeetingCounter) {
		this.boardMeetingCounter = boardMeetingCounter;
	}

}
