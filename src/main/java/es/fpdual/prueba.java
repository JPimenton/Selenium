package es.fpdual;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class prueba {

	prueba(){
		
	}
	
	public LocalDate calcNextFriday(LocalDate d) {
		  return d.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
	}
	
}
