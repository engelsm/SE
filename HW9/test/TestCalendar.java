package test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.Calendar;

class TestCalendar {

	@ParameterizedTest
	@ValueSource(ints = {4,24,256,1024,2000})
	public void Should_return_true(int year) {
		Calendar c = new Calendar(year);
		assertTrue(c.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = {3,7,9,1111,1563})
	public void Should_return_false(int year) {
		Calendar c = new Calendar(year);
		assertFalse(c.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = {1,2,3,4,5})
	public void Should_return_if_year_is_leap(int year) {
		GregorianCalendar gc = new GregorianCalendar();
		assertTrue(gc.isLeapYear(year));
	}

	@Test
	public void boundary_testing(int rangelow,int rangehigh) {
		rangelow = -5;
		rangehigh = 5;
		for(int i = rangelow; i < rangehigh; i++) {
			Calendar c = new Calendar(i);
			assertTrue(c.isLeapYear());
		}
	}
}