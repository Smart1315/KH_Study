package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public long leapDate(Calendar c) {
		long days = 0L;

		for (int i = 1; i <= c.get(Calendar.YEAR); i++) {
//			System.out.println(i + "��");
			if (i == c.get(Calendar.YEAR)) {
				for (int j = 1; j <= c.get(Calendar.MONTH) + 1; j++) {
//					System.out.println(j + "��");
					if (j == c.get(Calendar.MONTH) + 1) {
						for (int k = 1; k <= c.get(Calendar.DATE); k++) {
//							System.out.println(k + "��");
							days++;
						}
					} else {
						switch (j) {
						case 1:
						case 3:
						case 5:
						case 7:
						case 8:
						case 10:
						case 12:
							days += 31;
							break;
						case 4:
						case 6:
						case 9:
						case 11:
							days += 30;
							break;
						case 2:
							if (isLeapYear(i)) {
								days += 29;
							} else {
								days += 28;
							}
							break;
						}
					}
				}
			} else {
				if (isLeapYear(i)) {
					days += 366;
				} else {
					days += 365;
				}
			}
		}

		return days;
	}

}
