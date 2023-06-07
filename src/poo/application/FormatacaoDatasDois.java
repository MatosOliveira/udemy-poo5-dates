/**
 * 
 */
package poo.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Classe que utiliza as classes do pacote java.time para Datas e Horas
 * 
 * @author Matos
 *
 */
public class FormatacaoDatasDois {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DateTimeFormatter formatoDataUm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatoDataDois = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDate primData = LocalDate.now();
		LocalDateTime segData = LocalDateTime.now();
		Instant terData = Instant.now();
		
		System.out.println("Data (LocalDate): " + primData);
		System.out.println("Data (LocalDateTime): " + segData);
		System.out.println("Data (Instant): " + terData);
		
		//Parse
		LocalDate quaData = LocalDate.parse("2023-06-01");
		LocalDateTime quiData = LocalDateTime.parse("2023-06-01T20:57:00");
		Instant sexData = Instant.parse("2023-06-01T20:57:00Z");
		Instant setData = Instant.parse("2023-06-01T20:57:00-03:00");
		
		System.out.println("\nData (LocalDate - Parse): " + quaData);
		System.out.println("Data (LocalDateTime - Parse): " + quiData);
		System.out.println("Data (Instant - Parse): " + sexData);
		System.out.println("Data (Instant - Parse): " + setData);
		
		//Parse and Formatter
		LocalDate oitData = LocalDate.parse("01/06/2023", formatoDataUm);
		LocalDateTime nonData = LocalDateTime.parse("01/06/2023 21:06", formatoDataDois);
		
		LocalDate decData = LocalDate.of(2023, 06, 01);
		LocalDateTime undData = LocalDateTime.of(2023, 06, 01, 21, 10);
		
		System.out.println("\nData (LocalDate - Parse/Formatter): " + oitData);
		System.out.println("Data (LocalDateTime - Parse/Formatter): " + nonData);
		System.out.println("Data (LocalDate - Parse/Formatter): " + decData);
		System.out.println("Data (LocalDate - Parse/Formatter): " + undData);
		
		
		

	}

}
