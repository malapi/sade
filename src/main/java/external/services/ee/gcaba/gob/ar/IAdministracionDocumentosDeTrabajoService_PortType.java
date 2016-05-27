/**
 * IAdministracionDocumentosDeTrabajoService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.services.ee.gcaba.gob.ar;

public interface IAdministracionDocumentosDeTrabajoService_PortType extends java.rmi.Remote {
    public external.services.ee.gcaba.gob.ar.ArchivoDeTrabajoResponse obtenerArchivoDeTrabajo(java.lang.String codigoEE, java.lang.String usuario, java.lang.String nombre) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException;
    public void adjuntarDocumentosTrabajo(java.lang.String sistemaUsuario, java.lang.String usuario, java.lang.String codigoEE, external.services.ee.gcaba.gob.ar.DocumentoTrabajo[] listaDocumentos) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException;
    public void desadjuntarDocumentosDeTrabajo(java.lang.String sistemaUsuario, java.lang.String usuario, java.lang.String codigoEE, java.lang.String[] listaDocumentos) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException;
}
