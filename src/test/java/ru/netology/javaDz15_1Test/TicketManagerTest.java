package ru.netology.javaDz15_1Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaDz15_1.Ticket;
import ru.netology.javaDz15_1.TicketManager;
import ru.netology.javaDz15_1.TicketRepo;

import java.util.Arrays;

public class TicketManagerTest {

    TicketRepo repo = new TicketRepo();
    TicketManager manager = new TicketManager(repo);

    Ticket ticket1 = new Ticket(141, 1499, "SVO", "LED", 60);
    Ticket ticket2 = new Ticket(132, 3199, "DME", "AER", 120);
    Ticket ticket3 = new Ticket(143, 4199, "DME", "AER", 120);
    Ticket ticket4 = new Ticket(161, 3499, "DME", "AER", 120);
    Ticket ticket5 = new Ticket(132, 3899, "DME", "AER", 120);
    Ticket ticket6 = new Ticket(133, 2899, "DME", "AER", 120);
    Ticket ticket7 = new Ticket(143, 3899, "DME", "AER", 120);

    @Test
    public void findByFromAndTo() {

        manager.addTicket(ticket1);
        manager.addTicket(ticket2);
        manager.addTicket(ticket3);
        manager.addTicket(ticket4);
        manager.addTicket(ticket5);
        manager.addTicket(ticket6);

        Arrays.sort(repo.getTicketsArray());

        Ticket[] expected = {ticket6, ticket2, ticket4, ticket5, ticket3};
        Ticket[] actual = manager.findByFromAndTo("DME", "AER");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findByFromAndToEquality() {


        manager.addTicket(ticket4);
        manager.addTicket(ticket5);
        manager.addTicket(ticket6);
        manager.addTicket(ticket7);

        Arrays.sort(repo.getTicketsArray());

        Ticket[] expected = {ticket6, ticket4, ticket5, ticket7};
        Ticket[] actual = manager.findByFromAndTo("DME", "AER");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findByFromAndNotFound() {


        manager.addTicket(ticket4);
        manager.addTicket(ticket5);
        manager.addTicket(ticket6);
        manager.addTicket(ticket7);

        Arrays.sort(repo.getTicketsArray());

        Ticket[] expected = new Ticket[0];
        Ticket[] actual = manager.findByFromAndTo("DME", "KZN");

        Assertions.assertArrayEquals(expected, actual);
    }


}
