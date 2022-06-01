package modulo6;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploDeCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Date fecha = new Date();
			
			Calendar cal = Calendar.getInstance();
			
			SimpleDateFormat sdf = new SimpleDateFormat("EEEEEEEEEEEEE-dd-MM-yyyy");
			System.out.println("La fecha es " + fecha);
			System.out.println("La fecha es " + sdf.format(fecha));
			
			System.out.println("\nEl dia es: " + cal.get(Calendar.DATE));
			System.out.println("El Mes es: " + cal.get(Calendar.MONTH)+1);
			System.out.println("El Año es: " + cal.get(Calendar.YEAR));
			
	}

}