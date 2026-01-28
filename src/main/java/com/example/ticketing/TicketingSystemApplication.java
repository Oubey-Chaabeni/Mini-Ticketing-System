package com.example.ticketing;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TicketingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketingSystemApplication.class, args);
	}
	@GetMapping("/ticket")
	public List<Ticket> ticket()
	{
		List<Ticket> ticketList = new ArrayList<>();
		ticketList.add(new Ticket(01,"Freak Party , Epstin Island",20.6969));
		ticketList.add(new Ticket(02,"Diddy s white party , Diddy s mansion",45.34));
		ticketList.add(new Ticket(03,"Lana Del Rey Concert , Feriena",3.00));
		ticketList.add(new Ticket(04,"The Game Awards , Los Kasserine",25.33));
		return(ticketList);
	}

}
