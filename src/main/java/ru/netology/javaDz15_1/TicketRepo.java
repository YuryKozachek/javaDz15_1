package ru.netology.javaDz15_1;

import java.util.Comparator;

public class TicketRepo {
    private Ticket[] ticketsArray = new Ticket[0];

    public Ticket[] getTicketsArray() {
        return ticketsArray;
    }

    public void addNewTicket(Ticket ticket) {
        Ticket[] tmp = new Ticket[ticketsArray.length + 1];
        for (int i = 0; i < ticketsArray.length; i++) {
            tmp[i] = ticketsArray[i];
        }
        tmp[tmp.length - 1] = ticket;
        ticketsArray = tmp;
    }

    public Ticket[] findAllTicket() {
        return ticketsArray;
    }

    public void removeTicket(Ticket ticket) {
        Ticket[] tmp = new Ticket[ticketsArray.length - 1];
        int i = 0;
        for (Ticket ticketTmp : ticketsArray) {
            if (ticketTmp != ticket) {
                tmp[i] = ticketTmp;
                i++;
            }
        }
        ticketsArray = tmp;
    }
}
