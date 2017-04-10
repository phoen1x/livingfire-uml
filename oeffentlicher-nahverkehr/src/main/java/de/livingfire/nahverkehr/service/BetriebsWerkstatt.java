package de.livingfire.nahverkehr.service;

import de.livingfire.nahverkehr.pojo.NahverkehrMitarbeiter;
import java.util.List;
import de.livingfire.nahverkehr.pojo.Fahrzeug;

public class BetriebsWerkstatt extends Werkstatt implements Wartung {

	private NahverkehrMitarbeiter[] mitarbeiterListe;

	public List getAngestellte() {
		return null;
	}


	/**
	 * @see de.livingfire.nahverkehr.service.Wartung#fahrzeugWarten(de.livingfire.nahverkehr.pojo.Fahrzeug)
	 */
	public void fahrzeugWarten(Fahrzeug fahrzeug) {

	}

}
