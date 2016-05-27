package com.blink.sade.integration.health;

import com.codahale.metrics.health.HealthCheck;

import external.service.eu.gcaba.gob.ar.ConsultaUsuarioResponse;
import external.services.ee.gcaba.gob.ar.ArchivoDeTrabajoResponse;
import external.services.ee.gcaba.gob.ar.IAdministracionDocumentosDeTrabajoServiceProxy;

public class AdminDocumentosDeTrabajoHealthCheck extends HealthCheck {
    

    public AdminDocumentosDeTrabajoHealthCheck() {
    	
    }

    @Override
    protected Result check() throws Exception {
    	IAdministracionDocumentosDeTrabajoServiceProxy prx = new IAdministracionDocumentosDeTrabajoServiceProxy();
    	ArchivoDeTrabajoResponse exp;
			 try {
				 
				String usuario="DOMINGUEZRE";
				String nombre="CEP";
				String codigoEE = "EX-2015-00644292-   -MGEYA-DGDAI";
				exp = prx.obtenerArchivoDeTrabajo(codigoEE, usuario, nombre);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return Result.unhealthy(e);
			}
		
	   
        return Result.healthy(exp.toString());
    }
}
