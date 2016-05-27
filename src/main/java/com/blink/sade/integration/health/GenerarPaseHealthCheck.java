package com.blink.sade.integration.health;

import com.codahale.metrics.health.HealthCheck;

import external.services.ee.gcaba.gob.ar.ArchivoDeTrabajoResponse;
import external.services.ee.gcaba.gob.ar.IGenerarPaseExpedienteServiceProxy;
import external.services.ee.gcaba.gob.ar.PaseExpedienteRequest;

public class GenerarPaseHealthCheck extends HealthCheck {
    

   

	public GenerarPaseHealthCheck() {
    	
    }

    @Override
    protected Result check() throws Exception {
    	IGenerarPaseExpedienteServiceProxy prx = new IGenerarPaseExpedienteServiceProxy();
    	String exp;
			 try {
				 
				
				PaseExpedienteRequest datosPase = new PaseExpedienteRequest();
				datosPase.setCodigoEE("EX-2015-00644292-   -MGEYA-DGDAI");
				datosPase.setEstadoSeleccionado("Tramitación");
				datosPase.setMotivoPase("Pruebas");
				datosPase.setReparticionDestino("MGEYA");
				datosPase.setSectorDestino("MESI");
				datosPase.setSistemaOrigen("SistemaX");
				datosPase.setUsuarioDestino("DOMINGUEZRE");
				datosPase.setUsuarioOrigen("DOMINGUEZRE");
				exp = prx.generarPaseEE(datosPase);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return Result.unhealthy(e);
			}
		
	   
        return Result.healthy(exp);
    }
}
