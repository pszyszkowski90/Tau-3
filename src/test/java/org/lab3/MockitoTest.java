package org.lab3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class MockitoTest {
  Intern interMock	= mock(Intern.class);
  WhiteCollar whiteCollarMock = mock(WhiteCollar.class);

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
  void testGetRoomNumberMock() {
    when(whiteCollarMock.getRoomNumber()).thenReturn(1);
    Integer result = whiteCollarMock.getRoomNumber();
    assertEquals(1, result);
  }
}

