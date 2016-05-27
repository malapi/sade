package external.services.ee.gcaba.gob.ar;

public class IAdministracionDeDocumentosOficialesServiceProxy implements external.services.ee.gcaba.gob.ar.IAdministracionDeDocumentosOficialesService_PortType {
  private String _endpoint = null;
  private external.services.ee.gcaba.gob.ar.IAdministracionDeDocumentosOficialesService_PortType iAdministracionDeDocumentosOficialesService_PortType = null;
  
  public IAdministracionDeDocumentosOficialesServiceProxy() {
    _initIAdministracionDeDocumentosOficialesServiceProxy();
  }
  
  public IAdministracionDeDocumentosOficialesServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIAdministracionDeDocumentosOficialesServiceProxy();
  }
  
  private void _initIAdministracionDeDocumentosOficialesServiceProxy() {
    try {
      iAdministracionDeDocumentosOficialesService_PortType = (new external.services.ee.gcaba.gob.ar.IAdministracionDeDocumentosOficialesService_ServiceLocator()).getIAdministracionDeDocumentosOficialesServicePort();
      if (iAdministracionDeDocumentosOficialesService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iAdministracionDeDocumentosOficialesService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iAdministracionDeDocumentosOficialesService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iAdministracionDeDocumentosOficialesService_PortType != null)
      ((javax.xml.rpc.Stub)iAdministracionDeDocumentosOficialesService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public external.services.ee.gcaba.gob.ar.IAdministracionDeDocumentosOficialesService_PortType getIAdministracionDeDocumentosOficialesService_PortType() {
    if (iAdministracionDeDocumentosOficialesService_PortType == null)
      _initIAdministracionDeDocumentosOficialesServiceProxy();
    return iAdministracionDeDocumentosOficialesService_PortType;
  }
  
  public void eliminarDocumentosNoDefinitivos(java.lang.String sistemaUsuario, java.lang.String usuario, java.lang.String codigoEE) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException{
    if (iAdministracionDeDocumentosOficialesService_PortType == null)
      _initIAdministracionDeDocumentosOficialesServiceProxy();
    iAdministracionDeDocumentosOficialesService_PortType.eliminarDocumentosNoDefinitivos(sistemaUsuario, usuario, codigoEE);
  }
  
  public void desvincularDocumentosOficiales(java.lang.String sistemaUsuario, java.lang.String usuario, java.lang.String codigoEE, java.lang.String[] listaDocumentos) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException{
    if (iAdministracionDeDocumentosOficialesService_PortType == null)
      _initIAdministracionDeDocumentosOficialesServiceProxy();
    iAdministracionDeDocumentosOficialesService_PortType.desvincularDocumentosOficiales(sistemaUsuario, usuario, codigoEE, listaDocumentos);
  }
  
  public void vincularDocumentosOficiales(java.lang.String sistemaUsuario, java.lang.String usuario, java.lang.String codigoEE, java.lang.String[] listaDocumentos) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException{
    if (iAdministracionDeDocumentosOficialesService_PortType == null)
      _initIAdministracionDeDocumentosOficialesServiceProxy();
    iAdministracionDeDocumentosOficialesService_PortType.vincularDocumentosOficiales(sistemaUsuario, usuario, codigoEE, listaDocumentos);
  }
  
  public void vincularDocumentosOficialesConTransaccionFC(java.lang.String sistemaUsuario, java.lang.String usuario, java.lang.String codigoEE, java.lang.String documento, java.lang.Integer idTransaccionFC) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException{
    if (iAdministracionDeDocumentosOficialesService_PortType == null)
      _initIAdministracionDeDocumentosOficialesServiceProxy();
    iAdministracionDeDocumentosOficialesService_PortType.vincularDocumentosOficialesConTransaccionFC(sistemaUsuario, usuario, codigoEE, documento, idTransaccionFC);
  }
  
  public void desvincularDocumentosOficialesNumeroEspecial(external.services.ee.gcaba.gob.ar.RequestRelacionDocumentoOficialEE request) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException{
    if (iAdministracionDeDocumentosOficialesService_PortType == null)
      _initIAdministracionDeDocumentosOficialesServiceProxy();
    iAdministracionDeDocumentosOficialesService_PortType.desvincularDocumentosOficialesNumeroEspecial(request);
  }
  
  public void vincularDocumentosOficialesNumeroEspecial(external.services.ee.gcaba.gob.ar.RequestRelacionDocumentoOficialEE request) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException{
    if (iAdministracionDeDocumentosOficialesService_PortType == null)
      _initIAdministracionDeDocumentosOficialesServiceProxy();
    iAdministracionDeDocumentosOficialesService_PortType.vincularDocumentosOficialesNumeroEspecial(request);
  }
  
  public void vincularDocumentosOficialesAEEGuardaTemporal(java.lang.String sistemaUsuario, java.lang.String usuario, java.lang.String codigoEE, java.lang.String[] listaDocumentos) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException{
    if (iAdministracionDeDocumentosOficialesService_PortType == null)
      _initIAdministracionDeDocumentosOficialesServiceProxy();
    iAdministracionDeDocumentosOficialesService_PortType.vincularDocumentosOficialesAEEGuardaTemporal(sistemaUsuario, usuario, codigoEE, listaDocumentos);
  }
  
  public void hacerDefinitivosDocsDeEE(external.services.ee.gcaba.gob.ar.VinculacionDefinitivaDeDocsRequest request) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException{
    if (iAdministracionDeDocumentosOficialesService_PortType == null)
      _initIAdministracionDeDocumentosOficialesServiceProxy();
    iAdministracionDeDocumentosOficialesService_PortType.hacerDefinitivosDocsDeEE(request);
  }
  
  
}