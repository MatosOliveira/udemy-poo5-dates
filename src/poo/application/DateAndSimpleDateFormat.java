/**
 * 
 */
package poo.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

/**
 * Classe que utiliza Date e SimpleDateFormat para tratar datas
 * 
 * @author Matos
 *
 */
public class DateAndSimpleDateFormat {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat formato01 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formato02 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat formato03 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		formato03.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date data01 = new Date();
		Date data02 = new Date(System.currentTimeMillis());
		Date data03 = new Date(0L);
		Date data04 = new Date(1000L * 60L * 60 * 5L);
		
		Date dataFormatada01 = formato01.parse("02/06/2023");
		Date dataFormatada02 = formato02.parse("02/06/2023 19:46:00");
		Date dataFormatada03 = Date.from(Instant.parse("2023-06-02T19:50:00Z"));
		
		System.out.println("Data Um: " + data01);
		System.out.println("Data Dois: " + data02);
		System.out.println("Data Tres: " + data03);
		System.out.println("Data Quatro: " + data04);
		System.out.println("Data formatada 01: " + dataFormatada01);
		System.out.println("Data formatada 02: " + dataFormatada02);
		System.out.println("Data formatada 03: " + dataFormatada03);
		
		System.out.println("-------------------------------------");
		System.out.println("Data um: " + formato02.format(data01));
		System.out.println("Data dois: " + formato02.format(data02));
		System.out.println("Data tres: " + formato02.format(data03));
		System.out.println("Data quatro: " + formato02.format(data04));
		System.out.println("Data formatada 01: " + formato02.format(dataFormatada01));
		System.out.println("Data formatada 02: " + formato02.format(dataFormatada02));
		System.out.println("Data formatada 03: " + formato02.format(dataFormatada03));
		
		System.out.println("-------------------------------------");
		System.out.println("Data um: " + formato03.format(data01));
		System.out.println("Data dois: " + formato03.format(data02));
		System.out.println("Data tres: " + formato03.format(data03));
		System.out.println("Data quatro: " + formato03.format(data04));
		System.out.println("Data formatada 01: " + formato03.format(dataFormatada01));
		System.out.println("Data formatada 02: " + formato03.format(dataFormatada02));
		System.out.println("Data formatada 03: " + formato03.format(dataFormatada03));
		

	}

}
