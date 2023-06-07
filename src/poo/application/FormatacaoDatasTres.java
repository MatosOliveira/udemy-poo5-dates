/**
 * 
 */
package poo.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Classe que utiliza as classes do pacote java.time para Datas e Horas
 * 
 * @author Matos
 *
 */
public class FormatacaoDatasTres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LocalDate primData = LocalDate.parse("2023-06-01");
		LocalDateTime segData = LocalDateTime.parse("2023-06-01T20:57:00");
		Instant terData = Instant.parse("2023-06-01T20:57:00Z");
		
		LocalDate quaData = LocalDate.ofInstant(terData, ZoneId.systemDefault());
		LocalDate quiData = LocalDate.ofInstant(terData, ZoneId.of("Portugal"));
		LocalDateTime sexData = LocalDateTime.ofInstant(terData, ZoneId.systemDefault());
		LocalDateTime setData = LocalDateTime.ofInstant(terData, ZoneId.of("Portugal"));
		
		System.out.println("Instant: ");
		System.out.println("Quarta Data: " + quaData);
		System.out.println("Instant: " + quiData);
		System.out.println("Instant: " + sexData);
		System.out.println("Instant: " + setData);
		
		System.out.println("Dia: " + primData.getDayOfMonth());
		System.out.println("Mes: " + primData.getMonthValue());
		System.out.println("Ano: " + primData.getYear());
		
		System.out.println("Hora: " + segData.getHour());
		System.out.println("Minutos: " + segData.getMinute());

	}

}
