package com.gagan.test;

import java.util.ArrayList;

import com.gagan.dates.MyDate;
import com.gagan.dates.service.DateDifferenceProvider;

public class DateDifferenceTest {

	public static void main(String[] args) {

		ArrayList<MyDateTestRecord> testData = new ArrayList<>();

		// case1
		testData.add(new MyDateTestRecord(new MyDate(06, 04, 2011), new MyDate(06, 04, 2011), 0));

		// case2
		testData.add(new MyDateTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 04, 2011), 12));

		// case3
		testData.add(new MyDateTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 05, 2011), 42));

		// case4
		testData.add(new MyDateTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 06, 2011), 73));

		// case5
		testData.add(new MyDateTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2011), 256));

		// case6
		testData.add(new MyDateTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2012), 622));

		// case7
		testData.add(new MyDateTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2013), 987));

		// case8
		testData.add(new MyDateTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2113), 37511));

		// case9
		testData.add(new MyDateTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2413), 147084));

		// case10
		testData.add(new MyDateTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2813), 293181));

		// case11
		testData.add(new MyDateTestRecord(new MyDate(06, 01, 2011), new MyDate(06, 03, 2011), 59));

		// case12
		testData.add(new MyDateTestRecord(new MyDate(06, 01, 2012), new MyDate(06, 03, 2012), 60));

		// case13
		testData.add(new MyDateTestRecord(new MyDate(06, 02, 2012), new MyDate(06, 03, 2012), 29));

		// case14
		testData.add(new MyDateTestRecord(new MyDate(22, 01, 2012), new MyDate(15, 11, 2012), 298));

		// case15
		testData.add(new MyDateTestRecord(new MyDate(06, 02, 2012), new MyDate(06, 12, 2012), 304));

		for (MyDateTestRecord testCase : testData) {

			MyDate startDate = testCase.startDate;
			MyDate endDate = testCase.endDate;
			long expectedResult = testCase.expectedResult;
			long obtainedResult = DateDifferenceProvider.getDateDifference(startDate, endDate);

			if (expectedResult == obtainedResult)
				System.out.println("Test " + (1 + testData.lastIndexOf(testCase)) + " Passed " + obtainedResult
						+ " = obtainedResult " + expectedResult + " = expectedResult");
			else
				System.err.println("Test " + (1 + testData.lastIndexOf(testCase)) + " Failed " + obtainedResult
						+ " = obtainedResult " + expectedResult + " = expectedResult");

		}

	}
}
