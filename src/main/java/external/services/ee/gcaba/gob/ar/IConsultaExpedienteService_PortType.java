/**
 * IConsultaExpedienteService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.services.ee.gcaba.gob.ar;

public interface IConsultaExpedienteService_PortType extends java.rmi.Remote {
    public byte[] obtenerDocumentoCaratulaVariable(java.lang.String codigoEE, java.lang.String usuario) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException;
    public external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponseDetallado consultaEEDetallado(java.lang.String codigoEE) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException;
    public external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse obtenerCaratulaPorNumeroExpediente(java.lang.String expedienteCodigo) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException;
    public external.services.ee.gcaba.gob.ar.CaratulaVariableResponse obtenerDatosCaratulaVariable(java.lang.String codigoEE, java.lang.String usuario) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException;
    public boolean validarEE(java.lang.String codigoEE) throws java.rmi.RemoteException;
    public int consultaIdFCPorExpediente(java.lang.String codigoEE) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException;
    public external.services.ee.gcaba.gob.ar.HistorialDePasesResponse obtenerHistorialDePasesDeExpediente(java.lang.String codigoEE) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException;
    public external.services.ee.gcaba.gob.ar.ExpedienteElectronicoResponse[] obtenerExpedientesEnGuardaTemporalMayorA24Meses(java.lang.Integer cantidadDeDias) throws java.rmi.RemoteException;
    public external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse consultaEE(java.lang.String codigoEE) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException;
    public java.lang.String[] consultaExpedientesPorSistemaOrigenUsuario(java.lang.String sistemaOrigen, java.lang.String usuario) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException;
    public external.services.ee.gcaba.gob.ar.ObtenerCaratulaPorCodigoEEResponse obtenerCaratulaPorCodigoEE(external.services.ee.gcaba.gob.ar.ObtenerCaratulaPorCodigoEERequest request) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException;
    public external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse consultarDatosExpedientePorCodigosDeTrata(java.lang.String[] listaDeCodigosTrata, java.lang.String expedienteEstado, java.lang.String expedienteUsuarioAsignado) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException;
    public external.services.ee.gcaba.gob.ar.ExpedienteElectronicoResponse[] obtenerExpedientesEnGuardaTemporalPorCodigoExpediente(java.lang.String codigoExpediente) throws java.rmi.RemoteException;
    public java.lang.String[] consultaExpedientesPorSistemaOrigenReparticion(java.lang.String sistemaOrigen, java.lang.String reparticion) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException;
}
