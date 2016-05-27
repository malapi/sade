package com.blink.sade.integration.health;

import generardocumento.external.services.satra.gedo.gcaba.gob.ar.IExternalGenerarDocumentoServiceProxy;
import generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumento;
import generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumentoListaUsuariosDestinatariosExternosEntry;
import generardocumento.external.services.satra.gedo.gcaba.gob.ar.ResponseExternalGenerarDocumento;

import com.codahale.metrics.health.HealthCheck;

public class GeneraGEDOHealthCheck extends HealthCheck {
    

    public GeneraGEDOHealthCheck() {
    	
    }

    @Override
    protected Result check() throws Exception {
    	IExternalGenerarDocumentoServiceProxy prx = new IExternalGenerarDocumentoServiceProxy();
    	ResponseExternalGenerarDocumento exp;
			 try {
				 RequestExternalGenerarDocumento request = new RequestExternalGenerarDocumento();
				 String texto = "Test Sade";
				 request.setData(texto.getBytes());
				 request.setListaUsuariosDestinatarios(new String[1]);
				 request.setListaUsuariosDestinatarios(0, "SHEILASORIA");
				 request.setListaUsuariosDestinatariosCopia(new String[1]);
				 request.setListaUsuariosDestinatariosCopia(0, "MTAUS");
				 request.setListaUsuariosDestinatariosCopiaOculta(new String[1]);
				 request.setListaUsuariosDestinatariosCopiaOculta(0, "NSINESIA");
				 request.setListaUsuariosDestinatariosCopiaOculta(0, "NSINESIA");
				 RequestExternalGenerarDocumentoListaUsuariosDestinatariosExternosEntry[] ude = new RequestExternalGenerarDocumentoListaUsuariosDestinatariosExternosEntry[1];
				 
				 request.setListaUsuariosDestinatariosExternos(ude);
				 
				 
				 
				exp = prx.generarDocumentoGEDO(request);
						 //("EX-2015-00644292-   -MGEYA-DGDAI");
				//exp = prx.consultaEE("EX2012-00004587-   -MGEYA-MDUGC");
				//exp = prx.consultaEEDetallado("EX-2015-00644292-   -MGEYA-DGDAI");
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return Result.unhealthy(e);
			}
		
	   
        return Result.healthy(exp.getUrlArchivoGenerado());
    }
}
