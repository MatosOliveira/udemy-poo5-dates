/**
 * 
 */
package poo.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

/**
 * Classe que utiliza Date e Calendar para tratar datas
 * 
 * @author Matos
 *
 */
public class DateAndCalendar {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formato01 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date data01 = Date.from(Instant.parse("2023-06-02T19:50:00Z"));
		
		System.out.println("Data: " + formato01.format(data01));
		
		//Somando uma unidade do tempo
		Calendar cal = Calendar.getInstance();
		cal.setTime(data01);
		cal.add(Calendar.HOUR_OF_DAY, 4);
		data01 = cal.getTime();
		
		System.out.println("Data + 4h: " + formato01.format(data01));
		
		//Obtendo uma unidade do tempo
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
	}

}
