package ru.netology.javaDz15_1;

import java.util.Comparator;

public class TicketManager {
    private TicketRepo repo;

    public TicketManager(TicketRepo repo) {
        this.repo = repo;
    }

    public void addTicket(Ticket ticket) {
        repo.addNewTicket(ticket);
    }

    public Ticket[] findByFromAndTo(String from, String to) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : repo.findAllTicket()) {
            if (from == ticket.getAirportFrom() && to == ticket.getAirportTo()) {
                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = ticket;
                result = tmp;
            }
        }
        return result;
    }

    public Ticket[] findByTravelTimeComparator(String from, String to, Comparator<Ticket> comparator) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : repo.findAllTicket()) {
            if (from == ticket.getAirportFrom() && to == ticket.getAirportTo()) {
                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = ticket;
                result = tmp;
            }
        }
        return result;
    }
}
