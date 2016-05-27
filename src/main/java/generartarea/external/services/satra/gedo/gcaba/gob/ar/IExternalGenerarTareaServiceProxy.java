package generartarea.external.services.satra.gedo.gcaba.gob.ar;

public class IExternalGenerarTareaServiceProxy implements generartarea.external.services.satra.gedo.gcaba.gob.ar.IExternalGenerarTareaService_PortType {
  private String _endpoint = null;
  private generartarea.external.services.satra.gedo.gcaba.gob.ar.IExternalGenerarTareaService_PortType iExternalGenerarTareaService_PortType = null;
  
  public IExternalGenerarTareaServiceProxy() {
    _initIExternalGenerarTareaServiceProxy();
  }
  
  public IExternalGenerarTareaServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIExternalGenerarTareaServiceProxy();
  }
  
  private void _initIExternalGenerarTareaServiceProxy() {
    try {
      iExternalGenerarTareaService_PortType = (new generartarea.external.services.satra.gedo.gcaba.gob.ar.IExternalGenerarTareaService_ServiceLocator()).getIExternalGenerarTareaServicePort();
      if (iExternalGenerarTareaService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iExternalGenerarTareaService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iExternalGenerarTareaService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iExternalGenerarTareaService_PortType != null)
      ((javax.xml.rpc.Stub)iExternalGenerarTareaService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public generartarea.external.services.satra.gedo.gcaba.gob.ar.IExternalGenerarTareaService_PortType getIExternalGenerarTareaService_PortType() {
    if (iExternalGenerarTareaService_PortType == null)
      _initIExternalGenerarTareaServiceProxy();
    return iExternalGenerarTareaService_PortType;
  }
  
  public generartarea.external.services.satra.gedo.gcaba.gob.ar.ResponseExternalGenerarTarea generarTareaGEDO(generartarea.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarTarea request) throws java.rmi.RemoteException, generartarea.external.services.satra.gedo.gcaba.gob.ar.ParametroNoExisteException, generartarea.external.services.satra.gedo.gcaba.gob.ar.ClavesFaltantesException, generartarea.external.services.satra.gedo.gcaba.gob.ar.ParametroInvalidoTareaException, generartarea.external.services.satra.gedo.gcaba.gob.ar.ErrorGeneracionTareaException, generartarea.external.services.satra.gedo.gcaba.gob.ar.ParametroInvalidoException, generartarea.external.services.satra.gedo.gcaba.gob.ar.UsuarioSinPermisoException, generartarea.external.services.satra.gedo.gcaba.gob.ar.CantidadDatosNoSoportadaException{
    if (iExternalGenerarTareaService_PortType == null)
      _initIExternalGenerarTareaServiceProxy();
    return iExternalGenerarTareaService_PortType.generarTareaGEDO(request);
  }
  
  
}