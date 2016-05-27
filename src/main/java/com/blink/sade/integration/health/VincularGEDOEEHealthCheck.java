package com.blink.sade.integration.health;

import com.codahale.metrics.health.HealthCheck;

import external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse;
import external.services.ee.gcaba.gob.ar.IAdministracionDeDocumentosOficialesServiceProxy;

public class VincularGEDOEEHealthCheck extends HealthCheck {
    

    public VincularGEDOEEHealthCheck() {
    	
    }

    @Override
    protected Result check() throws Exception {
    	IAdministracionDeDocumentosOficialesServiceProxy prx = new IAdministracionDeDocumentosOficialesServiceProxy();
    	ConsultaExpedienteResponse exp;
			 try {
				 String[] listaDocumentos = {"IF-2012-00004994- -SECLYT"};
				String codigoEE = "EX-2015-00644292-   -MGEYA-DGDAI";
				String usuario = "DOMINGUEZRE";
				String sistemaUsuario = "CEP";
				prx.vincularDocumentosOficiales(sistemaUsuario, usuario, codigoEE, listaDocumentos);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return Result.unhealthy(e);
			}
		
	   
        return Result.healthy("Todo Ok");
    }
}
