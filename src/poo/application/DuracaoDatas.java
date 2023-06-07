/**
 * 
 */
package poo.application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Classe que utiliza as classes do pacote java.time para Datas e Horas
 * 
 * @author Matos
 *
 */
public class DuracaoDatas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LocalDate dataUm = LocalDate.parse("2023-06-02");
		LocalDateTime dataDois = LocalDateTime.parse("2023-06-02T19:00:00");
		Instant dataTres = Instant.parse("2023-06-03T19:00:00Z");
		
		LocalDate pastWeeKDate = dataUm.minusDays(7);
		LocalDate nextWeeKDate = dataUm.plusDays(7);
		
		LocalDateTime pastWeeKDateTime = dataDois.minusDays(7);
		LocalDateTime nextWeeKDateTime = dataDois.plusDays(7);
		
		Instant pastWeeKDateInstant = dataTres.minus(7, ChronoUnit.DAYS);
		Instant nextWeeKDateInstant = dataTres.plus(7, ChronoUnit.DAYS);
		
		System.out.println("\nLocal Date - Past Week: " + pastWeeKDate);
		System.out.println("Local Date - Next Week: " + nextWeeKDate);
		
		System.out.println("\nLocal Date Time - Past Week: " + pastWeeKDateTime);
		System.out.println("Local Date Time - Next Week: " + nextWeeKDateTime);
		
		System.out.println("\nInstant - Past Week: " + pastWeeKDateInstant);
		System.out.println("Instant - Next Week: " + nextWeeKDateInstant);
		
		Duration t1 = Duration.between(pastWeeKDate.atStartOfDay(), dataUm.atStartOfDay());
		Duration t2 = Duration.between(nextWeeKDateTime, dataDois);
		Duration t3 = Duration.between(pastWeeKDateInstant, dataTres);
		Duration t4 = Duration.between(dataTres, pastWeeKDateInstant);
		
		System.out.println("T 1: " + t1.toDays());
		System.out.println("T 2: " + t2.toDays());
		System.out.println("T 3: " + t3.toDays());
		System.out.println("T 4: " + t4.toDays());
		
		
	}

}
