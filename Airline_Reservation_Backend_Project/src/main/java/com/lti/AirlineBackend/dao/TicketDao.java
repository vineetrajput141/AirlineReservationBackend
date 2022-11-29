package com.lti.AirlineBackend.dao;

import org.springframework.web.bind.annotation.PathVariable;

import com.lti.AirlineBackend.entity.Ticket;

public interface TicketDao {

	Ticket createTicket(Ticket ticket);
	Ticket findTicketByTicketId(int ticketId);
	Ticket cancelTicket(int ticketId);

}
