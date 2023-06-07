/**
 * 
 */
package poo.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * Classe que utiliza as classes do pacote java.time para Datas e Horas
 * 
 * @author Matos
 *
 */
public class FormatacaoDatasUm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//Parse
		LocalDate primData = LocalDate.parse("2023-06-01");
		LocalDateTime segData = LocalDateTime.parse("2023-06-01T20:57:00");
		Instant terData = Instant.parse("2023-06-01T20:57:00Z");

		DateTimeFormatter formatoDataUm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatoDataDois = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter formatoDataTres = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter formatoDataQuatro = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter formatoDataCinco = DateTimeFormatter.ISO_INSTANT;


		System.out.println("\nPrimeira Data (LocalDate - Parse/Formatter): " + primData.format(formatoDataUm));
		System.out.println("Primeira Data (LocalDate - Parse/Formatter): " + formatoDataUm.format(primData));
		System.out.println("Primeira Data (LocalDate - Parse/Formatter): " + primData.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("\nSegunda Data (LocalDate - Parse/Formatter): " + segData.format(formatoDataUm));
		System.out.println("Segunda Data (LocalDate - Parse/Formatter): " + segData.format(formatoDataDois));
		System.out.println("Segunda Data (LocalDate - Parse/Formatter): " + segData.format(formatoDataQuatro));
		
		System.out.println("\nTerceira Data (LocalDate - Parse/Formatter): " + formatoDataTres.format(terData));
		System.out.println("Terceira Data (LocalDate - Parse/Formatter): " + formatoDataCinco.format(terData));
		System.out.println("Terceira Data (LocalDate - Parse/Formatter): " + terData.toString());
		
	}

}
