package de.livingfire.nahverkehr.service;

import de.livingfire.nahverkehr.pojo.Fahrzeug;

public interface Tuev {

	public abstract boolean tuevPruefung(Fahrzeug fahrzeug);

	public abstract void tuevVerlaengern(Fahrzeug fahrzeug);

}
