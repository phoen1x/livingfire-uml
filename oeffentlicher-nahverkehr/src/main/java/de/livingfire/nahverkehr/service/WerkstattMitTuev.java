package de.livingfire.nahverkehr.service;

import de.livingfire.nahverkehr.pojo.Fahrzeug;

public class WerkstattMitTuev extends Werkstatt implements Tuev, Wartung {


	/**
	 * @see de.livingfire.nahverkehr.service.Tuev#tuevPruefung(de.livingfire.nahverkehr.pojo.Fahrzeug)
	 */
	public boolean tuevPruefung(Fahrzeug fahrzeug) {
		return false;
	}


	/**
	 * @see de.livingfire.nahverkehr.service.Tuev#tuevVerlaengern(de.livingfire.nahverkehr.pojo.Fahrzeug)
	 */
	public void tuevVerlaengern(Fahrzeug fahrzeug) {

	}


	/**
	 * @see de.livingfire.nahverkehr.service.Wartung#fahrzeugWarten(de.livingfire.nahverkehr.pojo.Fahrzeug)
	 */
	public void fahrzeugWarten(Fahrzeug fahrzeug) {

	}

}
