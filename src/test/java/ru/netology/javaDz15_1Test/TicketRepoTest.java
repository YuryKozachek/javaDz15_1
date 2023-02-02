package ru.netology.javaDz15_1Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaDz15_1.Ticket;
import ru.netology.javaDz15_1.TicketRepo;

public class TicketRepoTest {

    Ticket ticket1 = new Ticket(171, 3499, "SVO", "LED", 60);
    Ticket ticket2 = new Ticket(162, 3499, "DME", "AER", 120);
    Ticket ticket3 = new Ticket(163, 3499, "VKO", "KZN", 100);
    Ticket ticket4 = new Ticket(121, 3499, "DME", "AER", 120);
    Ticket ticket5 = new Ticket(132, 3899, "DME", "AER", 120);

    TicketRepo repo = new TicketRepo();

    @Test
    public void addTicket() {

        repo.addNewTicket(ticket3);

        Ticket[] expected = {ticket3};
        Ticket[] actual = repo.findAllTicket();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addTicketMoreOne() {
        repo.addNewTicket(ticket1);
        repo.addNewTicket(ticket2);
        repo.addNewTicket(ticket3);

        Ticket[] expected = {ticket1, ticket2, ticket3};
        Ticket[] actual = repo.findAllTicket();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeTicket() {
        repo.addNewTicket(ticket1);
        repo.addNewTicket(ticket2);
        repo.addNewTicket(ticket3);

        repo.removeTicket(ticket2);

        Ticket[] expected = {ticket1, ticket3};
        Ticket[] actual = repo.findAllTicket();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void removeTicketMoreOne() {
        repo.addNewTicket(ticket1);
        repo.addNewTicket(ticket2);
        repo.addNewTicket(ticket3);
        repo.addNewTicket(ticket4);
        repo.addNewTicket(ticket5);

        repo.removeTicket(ticket2);
        repo.removeTicket(ticket4);


        Ticket[] expected = {ticket1, ticket3, ticket5};
        Ticket[] actual = repo.findAllTicket();

        Assertions.assertArrayEquals(expected, actual);
    }

}
