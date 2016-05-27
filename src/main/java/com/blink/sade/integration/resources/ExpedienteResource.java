package com.blink.sade.integration.resources;
import io.dropwizard.hibernate.UnitOfWork;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.blink.sade.integration.core.Person;

import external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse;

@Path("/v1/expediente")
@Produces(MediaType.APPLICATION_JSON)
public class ExpedienteResource {

	public ExpedienteResource(){
			}
	   @GET
	    @UnitOfWork
	    public List<ConsultaExpedienteResponse> listExpedientes() {
	        //return peopleDAO.findAll();
		   List<ConsultaExpedienteResponse> myList = new ArrayList<ConsultaExpedienteResponse>();
		   ConsultaExpedienteResponse o1=new ConsultaExpedienteResponse();
		   o1.setCodigoEE("EEE1111");
		   o1.setCodigoDocCaratula("caratula eee1111");
		   myList.add(o1);
		   return myList;
	   }
}
