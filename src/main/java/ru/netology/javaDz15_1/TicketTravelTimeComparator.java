package ru.netology.javaDz15_1;

import java.util.Comparator;

public class TicketTravelTimeComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket o1, Ticket o2) {
        if (o1.getTravelTime() < o2.getTravelTime()) {
            return -1;
        } else if (o1.getTravelTime() > o2.getTravelTime()) {
            return 1;
        } else {
            return 0;
        }
    }
}
