package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	
	private LinkedList<Valuta> valute = new LinkedList<>();

	@Override
	public void dodajKurs(GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public void obrisiKurs(GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public Valuta pronadjiKurs(GregorianCalendar datum, String naziv) {
		// TODO Auto-generated method stub
		return null;
	}

}
