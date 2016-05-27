package com.blink.sade.test;
import static org.junit.Assert.fail;

import java.rmi.RemoteException;

import org.junit.Test;

import external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse;
import external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException;
import external.services.ee.gcaba.gob.ar.IConsultaExpedienteServiceProxy;
import external.services.ee.gcaba.gob.ar.ParametroIncorrectoException;
import external.services.ee.gcaba.gob.ar.ProcesoFallidoException;

public class ConsultaExpedientesWsTest {
 
	@SuppressWarnings("unused")
	@Test
	public void test() {
		
		// Make a service
	    IConsultaExpedienteServiceProxy prx = new IConsultaExpedienteServiceProxy();
	    try {
			ConsultaExpedienteResponse exp ;
			exp = prx.consultaEE("EX-2015-00644292-   -MGEYA-DGDAI");
		} catch (ParametroIncorrectoException e2) {
			fail(e2.getMessage());
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (ProcesoFallidoException e2) {
			fail(e2.getMessage());
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (ExpedienteInexistenteException e2) {
			fail(e2.getMessage());
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (RemoteException e2) {
			// TODO Auto-generated catch block
			fail(e2.getMessage());
			e2.printStackTrace();
		}
	 
	    
	   
	    
		
		
		
	}

}
