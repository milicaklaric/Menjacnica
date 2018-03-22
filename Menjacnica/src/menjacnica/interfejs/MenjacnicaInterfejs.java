package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Valuta;

public interface MenjacnicaInterfejs {
	
	public void dodajKurs(Valuta v) throws Exception ;
	public void obrisiKurs(Valuta v) throws Exception ;
	public Valuta pronadjiKurs(GregorianCalendar datum, String naziv) throws Exception ;

	

}
