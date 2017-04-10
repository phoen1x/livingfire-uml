package de.livingfire.nahverkehr.pojo;

public interface TicketVerkauf {

	public Ticket ticketKaufen();

	public abstract Fahrpreis preisAuskunft();

	public abstract Fahrpreis ticketAuswählen(Ticket ticket);

}
