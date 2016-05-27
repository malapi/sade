package external.services.ee.gcaba.gob.ar;

public class IAdministracionDocumentosDeTrabajoServiceProxy implements external.services.ee.gcaba.gob.ar.IAdministracionDocumentosDeTrabajoService_PortType {
  private String _endpoint = null;
  private external.services.ee.gcaba.gob.ar.IAdministracionDocumentosDeTrabajoService_PortType iAdministracionDocumentosDeTrabajoService_PortType = null;
  
  public IAdministracionDocumentosDeTrabajoServiceProxy() {
    _initIAdministracionDocumentosDeTrabajoServiceProxy();
  }
  
  public IAdministracionDocumentosDeTrabajoServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIAdministracionDocumentosDeTrabajoServiceProxy();
  }
  
  private void _initIAdministracionDocumentosDeTrabajoServiceProxy() {
    try {
      iAdministracionDocumentosDeTrabajoService_PortType = (new external.services.ee.gcaba.gob.ar.IAdministracionDocumentosDeTrabajoService_ServiceLocator()).getIAdministracionDocumentosDeTrabajoServicePort();
      if (iAdministracionDocumentosDeTrabajoService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iAdministracionDocumentosDeTrabajoService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iAdministracionDocumentosDeTrabajoService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iAdministracionDocumentosDeTrabajoService_PortType != null)
      ((javax.xml.rpc.Stub)iAdministracionDocumentosDeTrabajoService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public external.services.ee.gcaba.gob.ar.IAdministracionDocumentosDeTrabajoService_PortType getIAdministracionDocumentosDeTrabajoService_PortType() {
    if (iAdministracionDocumentosDeTrabajoService_PortType == null)
      _initIAdministracionDocumentosDeTrabajoServiceProxy();
    return iAdministracionDocumentosDeTrabajoService_PortType;
  }
  
  public external.services.ee.gcaba.gob.ar.ArchivoDeTrabajoResponse obtenerArchivoDeTrabajo(java.lang.String codigoEE, java.lang.String usuario, java.lang.String nombre) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException{
    if (iAdministracionDocumentosDeTrabajoService_PortType == null)
      _initIAdministracionDocumentosDeTrabajoServiceProxy();
    return iAdministracionDocumentosDeTrabajoService_PortType.obtenerArchivoDeTrabajo(codigoEE, usuario, nombre);
  }
  
  public void adjuntarDocumentosTrabajo(java.lang.String sistemaUsuario, java.lang.String usuario, java.lang.String codigoEE, external.services.ee.gcaba.gob.ar.DocumentoTrabajo[] listaDocumentos) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException{
    if (iAdministracionDocumentosDeTrabajoService_PortType == null)
      _initIAdministracionDocumentosDeTrabajoServiceProxy();
    iAdministracionDocumentosDeTrabajoService_PortType.adjuntarDocumentosTrabajo(sistemaUsuario, usuario, codigoEE, listaDocumentos);
  }
  
  public void desadjuntarDocumentosDeTrabajo(java.lang.String sistemaUsuario, java.lang.String usuario, java.lang.String codigoEE, java.lang.String[] listaDocumentos) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException{
    if (iAdministracionDocumentosDeTrabajoService_PortType == null)
      _initIAdministracionDocumentosDeTrabajoServiceProxy();
    iAdministracionDocumentosDeTrabajoService_PortType.desadjuntarDocumentosDeTrabajo(sistemaUsuario, usuario, codigoEE, listaDocumentos);
  }
  
  
}