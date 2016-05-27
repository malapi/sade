package com.blink.sade.integration.health;

import com.codahale.metrics.health.HealthCheck;

import external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse;
import external.services.ee.gcaba.gob.ar.IConsultaExpedienteServiceProxy;

public class ConsultarEEHealthCheck extends HealthCheck {
    

    public ConsultarEEHealthCheck() {
    	
    }

    @Override
    protected Result check() throws Exception {
    	IConsultaExpedienteServiceProxy prx = new IConsultaExpedienteServiceProxy();
    	ConsultaExpedienteResponse exp;
			 try {
				 exp = prx.consultaEE("EX-2015-00644292-   -MGEYA-DGDAI");
				// prx.con(sistemaOrigen, reparticion)
				//exp = prx.consultaEE("EX2012-00004587-   -MGEYA-MDUGC");
				exp = prx.consultaEEDetallado("EX-2015-00644292-   -MGEYA-DGDAI");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return Result.unhealthy(e);
			}
		
	   
        return Result.healthy(exp.getDescripcionTrata());
    }
}
