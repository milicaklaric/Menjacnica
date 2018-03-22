package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	
	private LinkedList<Valuta> valute = new LinkedList<>();

	@Override
	public void dodajKurs(Valuta v) throws Exception {
		if (v == null || valute.contains(v))
			throw new Exception("Valuta koju ste uneli je ili null ili vec postoji");
		
		valute.add(v);
		
	}

	@Override

	public void obrisiKurs(Valuta v) throws Exception {
		if (v == null || !valute.contains(v))
			throw new Exception("Valuta koju ste uneli je ili null ili ne postoji");
		
		valute.remove(v);
	}

	@Override
	public Valuta pronadjiKurs(GregorianCalendar datum, String naziv) throws Exception {
		if (datum == null || naziv == null)
			throw new Exception("Naziv i datum ne mogu biti null");
		
		Valuta v = new Valuta();
		
		for (int i = 0; i < valute.size(); i++) {
			if (valute.get(i).getNaziv().equals(naziv) && valute.get(i).getDatum().equals(datum)) {
				v = valute.get(i);
			}
		}
		
		return v;
	}
}
