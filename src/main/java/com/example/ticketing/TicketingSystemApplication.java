package com.example.ticketing;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TicketingSystemApplication {

    @Autowired
    private TicketService ticketService;

    public static void main(String[] args) {  
        SpringApplication.run(TicketingSystemApplication.class, args);
    }

    @GetMapping("/ticket/{key}")
    public Ticket searchticket(@PathVariable int key)
    {
        if(ticketService.findTicketById(key)==null)
        {
            return(ticketService.findTicketById(key));
        }
        return(ticketService.findTicketById(key));
    }


    @GetMapping("/tickets")
    public List<Ticket> tickets()
    {
        return(ticketService.getTicketList());
    }


    @GetMapping("/filterByEvent/{event}")
    public List<Ticket> filterticketbyevent(@PathVariable String event)
    {
        return(ticketService.filterTicketByevent(event));
    }


    @GetMapping("/FilterByPrice/{price}")
    public List<Ticket> filterticketbyevent(@PathVariable double price)
    {
        return(ticketService.filterTicketByprice(price));
    }


    @GetMapping("/Submiticket/{key}/{name}/{price}")
    public void st(@PathVariable int key,@PathVariable String name,@PathVariable double price)
    {
        ticketService.st(key, name, price);
    }
}
