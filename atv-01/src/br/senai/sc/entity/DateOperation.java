package br.senai.sc.entity;
import java.util.Date;

public class DateOperation {
	
		public static boolean validateDate(Date date) {
			Date today = new Date();
			try {
				if(date.after(today)) return false;
			} catch(Exception e) {
				return false;
			}
			return true;
	}
		
		public static boolean moreSixMonths(Date date) {
			if(date == null) return false;
			Date today = new Date();
			if((today.getTime() - date.getTime()) > 155520000000L) return true;
			return false;
		}
		
		@SuppressWarnings("deprecation")
		public static boolean aniversario(Date birthday){
			Date today = new Date();
			if(today.getMonth() == birthday.getMonth()) return true;
			return false;
		}
}
