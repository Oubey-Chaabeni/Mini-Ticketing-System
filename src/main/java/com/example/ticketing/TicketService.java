package com.example.ticketing;

import java.util.ArrayList;
import java.util.List;

public class TicketService {

    private List<Ticket> ticketList = new ArrayList<>();


    public void st(int key,String name,double price)
	{
		ticketList.add(new Ticket(key, name, price));
	}

    public List<Ticket> getTicketList() {

        ticketList.add(new Ticket(01,"Freak Party , Epstin Island",20.6969));
		ticketList.add(new Ticket(02,"Diddy s white party , Diddy s mansion",45.34));
		ticketList.add(new Ticket(03,"Lana Del Rey Concert , Feriena",3.00));
		ticketList.add(new Ticket(04,"The Game Awards , Los Kasserine",25.33));
        return ticketList;
    }
    public void add(Ticket T)
    {
        ticketList.add(T);
    }
    public Ticket findTicket(int id)
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
}
