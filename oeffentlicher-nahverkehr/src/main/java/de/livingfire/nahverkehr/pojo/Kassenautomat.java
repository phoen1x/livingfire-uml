package de.livingfire.nahverkehr.pojo;

import java.util.List;

public class Kassenautomat implements TicketVerkauf {

	public Zielort fahrplanAuskunft() {
		return null;
	}

	public float muenzenEinwerfen(Muenze muenze) {
		return 0;
	}

	public float verbleibenderBetragBerechnen() {
		return 0;
	}

	public List<Muenze> muenzRueckgabe() {
		return null;
	}


	/**
	 * @see de.livingfire.nahverkehr.pojo.TicketVerkauf#ticketKaufen()
	 */
	public Ticket ticketKaufen() {
		return null;
	}


	/**
	 * @see de.livingfire.nahverkehr.pojo.TicketVerkauf#preisAuskunft()
	 */
	public Fahrpreis preisAuskunft() {
		return null;
	}


	/**
	 * @see de.livingfire.nahverkehr.pojo.TicketVerkauf#ticketAuswählen(de.livingfire.nahverkehr.pojo.Ticket)
	 */
	public Fahrpreis ticketAuswählen(Ticket ticket) {
		return null;
	}

}
