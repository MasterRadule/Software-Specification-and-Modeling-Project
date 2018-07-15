package modelTest;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import gge.model.Aplikacija;
import gge.model.Dokument;
import gge.model.ElementDokumenta;
import gge.model.Stanje;
import gge.model.TipDokumenta;
import gge.model.Tranzicija;

public class AplikacijaTest {

	@Test
	public void testObrisiStanje() {
		HashMap<Integer, ElementDokumenta> elementiDokumenta = new HashMap<Integer, ElementDokumenta>();
		Stanje stanje = new Stanje();
		elementiDokumenta.put(1, stanje);
		Dokument accessPermit = new Dokument(TipDokumenta.AccessPermit);
		accessPermit.setElementiDokumenta(elementiDokumenta);
		Aplikacija.getInstance().setAccessPermit(accessPermit);
		Aplikacija.getInstance().obrisiStanje(stanje, TipDokumenta.AccessPermit);
		assertTrue(accessPermit.getElementiDokumenta().isEmpty());
	}
	@Test
	public void testObrisiTranziciju() {
		HashMap<Integer, ElementDokumenta> elementiDokumenta = new HashMap<Integer, ElementDokumenta>();
		Tranzicija tranzicija = new Tranzicija();
		elementiDokumenta.put(1, tranzicija);
		Dokument accessPermit = new Dokument(TipDokumenta.AccessPermit);
		accessPermit.setElementiDokumenta(elementiDokumenta);
		Aplikacija.getInstance().setAccessPermit(accessPermit);
		Aplikacija.getInstance().obrisiTranziciju(tranzicija, TipDokumenta.AccessPermit);
		assertTrue(accessPermit.getElementiDokumenta().isEmpty());
	}

}
