package com.example.ticketing;

import java.util.ArrayList;
import java.util.List;

public class TicketService {

    private List<Ticket> ticketList = new ArrayList<>(
    List.of(
        new Ticket(1, "Rock Festival, Carthage", 120.00),
        new Ticket(2, "Tech Conference, Tunis", 250.00),
        new Ticket(3, "Football Match, Rades Stadium", 75.50),
        new Ticket(4, "Jazz Night, Sidi Bou Said", 60.00),
        new Ticket(5, "Rock Festival, Carthage", 120.00),
        new Ticket(6, "Tech Conference, Tunis", 250.00),
        new Ticket(7, "Startup Pitch, Ariana", 45.00),
        new Ticket(8, "Jazz Night, Sidi Bou Said", 60.00),
        new Ticket(9, "Gaming Expo, Tunis", 75.50),
        new Ticket(10, "Book Fair, Tunis", 30.00)
    )
);



    public void st(int key,String name,double price)
	{
		ticketList.add(new Ticket(key, name, price));
	}

    public List<Ticket> getTicketList() 
    {
        return ticketList;
    }
    public void add(Ticket T)
    {
        ticketList.add(T);
    }
    public Ticket findTicketById(int id)
    {
        for(Ticket t : ticketList)
        {
            if(t.getId()==id)
            {
                return (t);
            }
        }
        return (null);
    }
    public List<Ticket> filterTicketByevent(String event)
    {
        List<Ticket> s = new ArrayList<>();
        for(Ticket t : ticketList)
        {
            if(t.getEvent().equals(event))
            {
                s.add(t);
            }
        }
        return (s);
    }
    public List<Ticket> filterTicketByprice(double price)
    {
        List<Ticket> s = new ArrayList<>();
        for(Ticket t : ticketList)
        {
            if(t.getPrice()==price)
            {
                s.add(t);
            }
        }
        return (s);
    }
}
