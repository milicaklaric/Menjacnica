package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	
	private LinkedList<Valuta> valute = new LinkedList<>();

	@Override
	public void dodajKurs(Valuta v) {
		valute.add(v);

	}

	@Override
	public void obrisiKurs(Valuta v) {
		// TODO Auto-generated method stub

	}

	@Override
	public Valuta pronadjiKurs(GregorianCalendar datum, String naziv) {
		// TODO Auto-generated method stub
		return null;
	}

}
