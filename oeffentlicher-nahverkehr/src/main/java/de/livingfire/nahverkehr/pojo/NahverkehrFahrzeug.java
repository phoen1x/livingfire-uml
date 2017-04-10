package de.livingfire.nahverkehr.pojo;

public abstract class NahverkehrFahrzeug implements Fahrzeug {

	private Fahrplan[] fahrplan;

	private Fahrer[] fahrer;

	private Fahrgast[] fahrgastListe;

	public Haltestelle naechsteHaltestelle() {
		return null;
	}


	/**
	 * @see de.livingfire.nahverkehr.pojo.Fahrzeug#personAusteigen(de.livingfire.nahverkehr.pojo.Person)
	 */
	public void personAusteigen(Person person) {

	}


	/**
	 * @see de.livingfire.nahverkehr.pojo.Fahrzeug#personEinsteigen(de.livingfire.nahverkehr.pojo.Person)
	 */
	public void personEinsteigen(Person person) {

	}

}
