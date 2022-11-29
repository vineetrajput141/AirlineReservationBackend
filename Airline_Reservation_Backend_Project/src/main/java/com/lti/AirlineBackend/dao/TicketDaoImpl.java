package com.lti.AirlineBackend.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.AirlineBackend.entity.Ticket;

@Repository
public class TicketDaoImpl implements TicketDao {

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	@Transactional
	public Ticket createTicket(Ticket ticket) {
		em.persist(ticket);
		
		return ticket;
	}

	@Override
	public Ticket findTicketByTicketId(int ticketId) {
		Ticket ticket = em.find(Ticket.class, ticketId);
		return ticket;
	}

	@Override
	@Transactional
	public Ticket cancelTicket(int ticketId) {
		
		TypedQuery qry=em.createQuery("SELECT t FROM Ticket t",Ticket.class);
		//Employee empList = (Employee) qry.getSingleResult();
		Ticket tempEmp=em.find(Ticket.class, ticketId);
		tempEmp.setStatus("Canceled");
		Ticket e=em.merge(tempEmp);
		return e;
	}

}
