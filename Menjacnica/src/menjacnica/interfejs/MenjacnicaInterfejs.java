package menjacnica.interfejs;

import java.util.GregorianCalendar;
import menjacnica.Valuta;

public interface MenjacnicaInterfejs {
	
	public void dodajKurs(GregorianCalendar datum);
	public void obrisiKurs(GregorianCalendar datum);
	public Valuta pronadjiKurs(GregorianCalendar datum, String naziv);
	

}
