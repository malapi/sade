package generardocumento.external.services.satra.gedo.gcaba.gob.ar;

public class IExternalGenerarDocumentoServiceProxy implements generardocumento.external.services.satra.gedo.gcaba.gob.ar.IExternalGenerarDocumentoService_PortType {
  private String _endpoint = null;
  private generardocumento.external.services.satra.gedo.gcaba.gob.ar.IExternalGenerarDocumentoService_PortType iExternalGenerarDocumentoService_PortType = null;
  
  public IExternalGenerarDocumentoServiceProxy() {
    _initIExternalGenerarDocumentoServiceProxy();
  }
  
  public IExternalGenerarDocumentoServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIExternalGenerarDocumentoServiceProxy();
  }
  
  private void _initIExternalGenerarDocumentoServiceProxy() {
    try {
      iExternalGenerarDocumentoService_PortType = (new generardocumento.external.services.satra.gedo.gcaba.gob.ar.IExternalGenerarDocumentoService_ServiceLocator()).getIExternalGenerarDocumentoServicePort();
      if (iExternalGenerarDocumentoService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iExternalGenerarDocumentoService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iExternalGenerarDocumentoService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iExternalGenerarDocumentoService_PortType != null)
      ((javax.xml.rpc.Stub)iExternalGenerarDocumentoService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public generardocumento.external.services.satra.gedo.gcaba.gob.ar.IExternalGenerarDocumentoService_PortType getIExternalGenerarDocumentoService_PortType() {
    if (iExternalGenerarDocumentoService_PortType == null)
      _initIExternalGenerarDocumentoServiceProxy();
    return iExternalGenerarDocumentoService_PortType;
  }
  
  public generardocumento.external.services.satra.gedo.gcaba.gob.ar.ResponseExternalGenerarDocumento generarDocumentoGEDO(generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumento request) throws java.rmi.RemoteException, generardocumento.external.services.satra.gedo.gcaba.gob.ar.ErrorGeneracionDocumentoException, generardocumento.external.services.satra.gedo.gcaba.gob.ar.ClavesFaltantesException, generardocumento.external.services.satra.gedo.gcaba.gob.ar.ParametroInvalidoException, generardocumento.external.services.satra.gedo.gcaba.gob.ar.CantidadDatosNoSoportadaException{
    if (iExternalGenerarDocumentoService_PortType == null)
      _initIExternalGenerarDocumentoServiceProxy();
    return iExternalGenerarDocumentoService_PortType.generarDocumentoGEDO(request);
  }
  
  public generardocumento.external.services.satra.gedo.gcaba.gob.ar.ResponseExternalGenerarDocumento generarDocumentoUsuarioExterno(generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumentoUsuarioExterno request) throws java.rmi.RemoteException, generardocumento.external.services.satra.gedo.gcaba.gob.ar.ErrorGeneracionDocumentoException, generardocumento.external.services.satra.gedo.gcaba.gob.ar.ClavesFaltantesException, generardocumento.external.services.satra.gedo.gcaba.gob.ar.ParametroInvalidoException, generardocumento.external.services.satra.gedo.gcaba.gob.ar.CantidadDatosNoSoportadaException{
    if (iExternalGenerarDocumentoService_PortType == null)
      _initIExternalGenerarDocumentoServiceProxy();
    return iExternalGenerarDocumentoService_PortType.generarDocumentoUsuarioExterno(request);
  }
  
  
}