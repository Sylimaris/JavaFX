package tools;

import java.sql.Date;

public class DateConverter {

	public static String convertStringDate(String date) {
		return date.substring(8,10) + "/" + date.substring(5,7) + "/" + date.substring(0,4);
	}

	public static String convertStringDateTirets(String date) {
		return date.substring(6,10) + "-" + date.substring(3,5) + "-" + date.substring(0,2);
	}

	public static String convertSQLDateRequest(Date date) {
		return "to_date('" + date + "', 'yyyy-mm-dd')";
	}

	public static int getMonth(String date) {
		return Integer.parseInt(date.substring(3,5));
	}

	public static int getDay(String date) {
		return Integer.parseInt(date.substring(0,2));
	}

	public static int getMonthSQLDate(String date) {
		return Integer.parseInt(date.substring(5,7));
	}

	public static int getDaySQLDate(String date) {
		return Integer.parseInt(date.substring(8,10));
	}
}
