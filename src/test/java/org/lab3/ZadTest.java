package org.lab3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class ZadTest {
	Intern intern = new Intern("name", "surname", "birthdate");
	Intern interMock	= mock(Intern.class);
	WhiteCollar whiteCollar = new WhiteCollar("name", "surname", "birthdate");
	WhiteCollar whiteCollarMock = mock(WhiteCollar.class);
	BoardMember boardMember = new BoardMember("name", "surname", "birthdate");
	@Test
	void testCalculateSalaryEqualsMock() {
		when(interMock.calculateSalary()).thenReturn(500.0);
		double result = interMock.calculateSalary();
		assertEquals(500, result);
	}
	@Test
	void testGetInformationEqualsMock() {
		when(interMock.getInformation()).thenReturn("Test");
		String result = interMock.getInformation();
		assertEquals("Test", result);
	}
	@Test
	void testGetScholarshipNotNullMock() {
		when(interMock.getScholarship()).thenReturn(false);
		boolean result = interMock.getScholarship();
		assertFalse(result);
	}
	@Test
	void testGetManagerMock() {
		when(whiteCollarMock.getManager()).thenReturn("Manager");
		String result = whiteCollarMock.getManager();
		assertEquals("Manager", result);
	}
	@Test
	void testGetSalaryMock() {
		when(whiteCollarMock.getSalary()).thenReturn(123.0);
		Double result = whiteCollarMock.getSalary();
		assertEquals(123.0, result);
	}
	@Test
	void testGetRoomNumber() {
		when(whiteCollarMock.getRoomNumber()).thenReturn(1);
		Integer result = whiteCollarMock.getRoomNumber();
		assertEquals(1, result);
	}
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
