package org.lab3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ZadTest {
	Intern intern = new Intern("name", "surname", "birthdate");
	WhiteCollar whiteCollar = new WhiteCollar("name", "surname", "birthdate");

	BoardMember boardMember = new BoardMember("name", "surname", "birthdate");

	@Test
	void testCalculateSalaryEquals() {
		double result = intern.calculateSalary();
		assertEquals(500, result);
	}
	@Test
	void testGetScholarshipNotNull() {
		boolean result = intern.getScholarship();
		assertNotNull(result);
	}
	@Test
	void testSetScholarship() {
		intern.setScholarship(true);
		boolean result = intern.getScholarship();
		assertTrue(result);
	}
	@Test
	void testGetWhiteCollarName() {
		assertNotNull( whiteCollar.getName());
	}
	@Test
	public void testException() {
		Throwable exception = assertThrows(
				IllegalArgumentException.class, () -> {
					intern.setManager("");
				}
		);
		assertEquals("Przekazano pusty parametr", exception.getMessage());
	}
	@Test
	void testSetManager() {
		whiteCollar.setManager("test");
		assertNotNull(whiteCollar.getManager());
	}
	@Test
	void testSetSalary() {
		whiteCollar.setSalary(123.23);
		assertEquals(123.23, whiteCollar.getSalary());
	}
	@Test
	void testSetPhoneNumber() {
		whiteCollar.setPhoneNmber("Test");
		assertEquals("Test", whiteCollar.getPhoneNmber());
	}
	@Test
	void testSetPercentageBonus() {
		whiteCollar.setPercentageBonus(123.23);
		assertEquals(123.23, whiteCollar.getPercentageBonus());
	}
	@Test
	void testSetAssistant() {
		boardMember.setAssistant("test");
		assertEquals("test", boardMember.getAssistant());
	}
	@Test
	void testSetBoardMeetingCounter() {
		boardMember.setBoardMeetingCounter(3);
		assertEquals(3, boardMember.getBoardMeetingCounter());
	}
}
