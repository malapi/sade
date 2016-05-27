/**
 * IGenerarPaseExpedienteService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.services.ee.gcaba.gob.ar;

public interface IGenerarPaseExpedienteService_PortType extends java.rmi.Remote {
    public void generarPaseASolicitudArchivo(external.services.ee.gcaba.gob.ar.PaseExpedienteRequest datosPase) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException;
    public java.lang.String generarPaseEEConBloqueo(external.services.ee.gcaba.gob.ar.PaseExpedienteRequest datosPase) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException;
    public java.lang.String generarPaseEESinDocumento(external.services.ee.gcaba.gob.ar.PaseExpedienteRequest datosPase, java.lang.String numeroSadePase) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException;
    public java.lang.String generarPaseEE(external.services.ee.gcaba.gob.ar.PaseExpedienteRequest datosPase) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException;
    public java.lang.String generarPaseEEAdministrador(external.services.ee.gcaba.gob.ar.PaseExpedienteRequest arg0) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException;
    public void generarPaseEEAArchivo(external.services.ee.gcaba.gob.ar.PaseExpedienteRequest datosPase) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException;
    public java.lang.String generarPaseEEConBloqueoYAclaracion(external.services.ee.gcaba.gob.ar.PaseExpedienteRequest datosPase, java.lang.String aclaracion) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException;
    public java.lang.String generarPaseEEConDesbloqueo(external.services.ee.gcaba.gob.ar.PaseExpedienteRequest datosPase) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException;
}
