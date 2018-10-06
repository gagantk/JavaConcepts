package com.gagan.dates.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.gagan.dates.MyDate;
import com.gagan.dates.service.DateDifferenceProvider;

public class JUnitDateDifferenceTest {

	@Test
	public void testDateDifference1() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(06, 04, 2011);
		assertEquals(0, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}

	@Test
	public void testDateDifference2() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 04, 2011);
		assertEquals(12, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}

	@Test
	public void testDateDifference3() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 05, 2011);
		assertEquals(42, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}

	@Test
	public void testDateDifference4() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 06, 2011);
		assertEquals(73, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}

	@Test
	public void testDateDifference5() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2011);
		assertEquals(256, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}

	@Test
	public void testDateDifference6() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2012);
		assertEquals(622, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}

	@Test
	public void testDateDifference7() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2013);
		assertEquals(987, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}

	@Test
	public void testDateDifference8() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2113);
		assertEquals(37511, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}

	@Test
	public void testDateDifference9() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2413);
		assertEquals(147084, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}

	@Test
	public void testDateDifference10() {
		MyDate startDate = new MyDate(06, 04, 2011);
		MyDate endDate = new MyDate(18, 12, 2813);
		assertEquals(293181, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}

	@Test
	public void testDateDifference11() {
		MyDate startDate = new MyDate(06, 01, 2011);
		MyDate endDate = new MyDate(06, 03, 2011);
		assertEquals(59, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}

	@Test
	public void testDateDifference12() {
		MyDate startDate = new MyDate(06, 01, 2012);
		MyDate endDate = new MyDate(06, 03, 2012);
		assertEquals(60, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}

	@Test
	public void testDateDifference13() {
		MyDate startDate = new MyDate(06, 02, 2012);
		MyDate endDate = new MyDate(06, 03, 2012);
		assertEquals(29, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}

	@Test
	public void testDateDifference14() {
		MyDate startDate = new MyDate(22, 01, 2012);
		MyDate endDate = new MyDate(15, 11, 2012);
		assertEquals(298, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}

	@Test
	public void testDateDifference15() {
		MyDate startDate = new MyDate(06, 02, 2012);
		MyDate endDate = new MyDate(06, 12, 2012);
		assertEquals(304, DateDifferenceProvider.getDateDifference(startDate, endDate));
	}

}
