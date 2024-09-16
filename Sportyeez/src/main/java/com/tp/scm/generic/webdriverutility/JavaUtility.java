package com.tp.scm.generic.webdriverutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * @author MINIT SINGH
 */

public class JavaUtility {
	/**
	 * method to generate random number
	 * 
	 * @return randomNumber integer type
	 */
	public int getRandomNumber() {
		Random random = new Random();
		int randomNumber = random.nextInt(1000);
		return randomNumber;
	}

	/**
	 * method to generate system date
	 * 
	 * @return date String type
	 */

	public String getSysytemDateYYYYDDMM() {
		Date dateObj = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat();
		String date = sdf.format(dateObj);
		return date;
	}

	/**
	 * this method is to get the required date from current the current date with
	 * the help of the no. of days after or before
	 * 
	 * @param days
	 * @return reqDate String type
	 */
	public String getRequiredDateYYYYDDMM(int days) {
		SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, days);
		String reqDate = sim.format(cal.getTime());
		return reqDate;

	}

}
