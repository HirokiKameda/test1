package test1;

import java.time.LocalDateTime;

public class Day {

	public int year;
	public int month;
	public int date;

	public Day(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;

	}

	public Day() {
		LocalDateTime d = LocalDateTime.now();
		this.year = d.getYear();
		this.month = d.getMonthValue();
		this.date = d.getDayOfMonth();
	}

	public String formatDay() {
		return year + "年" + month + "月" + date + "日";
	}

}
