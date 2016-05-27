package com.blink.sade.integration.health;

import com.codahale.metrics.health.HealthCheck;

import external.service.eu.gcaba.gob.ar.ConsultaUsuarioResponse;
import external.service.eu.gcaba.gob.ar.ConsultaUsuarioServiceProxy;
import external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse;

public class ConsultarUsuarioSADEHealthCheck extends HealthCheck {
    

    public ConsultarUsuarioSADEHealthCheck() {
    	
    }

    @Override
    protected Result check() throws Exception {
    	ConsultaUsuarioServiceProxy prx = new ConsultaUsuarioServiceProxy();
    	ConsultaUsuarioResponse[] exp;
			 try {
				 String consultaUsuarioSadeRequest = "SHEILASORIA";
				exp = prx.consultaUsuarioSade(consultaUsuarioSadeRequest);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return Result.unhealthy(e);
			}
		
	   
        return Result.healthy(exp.toString());
    }
}
