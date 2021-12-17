package lista;

import java.time.LocalDate;     
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

import jdk.jfr.DataAmount;

public class Data {

	public static void main(String[] args ) {
     
		 //Local Date 
         // 2021-06-19
		
         LocalDateTime localDateTime = LocalDateTime.now();
         localDateTime = localDateTime.minusMonths(6); 
         
         
         
         System.out.println(localDateTime);         
        	 
        		 
        		 
   
	


	}

}
