package external.service.eu.gcaba.gob.ar;

public class ConsultaUsuarioServiceProxy implements external.service.eu.gcaba.gob.ar.ConsultaUsuarioService {
  private String _endpoint = null;
  private external.service.eu.gcaba.gob.ar.ConsultaUsuarioService consultaUsuarioService = null;
  
  public ConsultaUsuarioServiceProxy() {
    _initConsultaUsuarioServiceProxy();
  }
  
  public ConsultaUsuarioServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initConsultaUsuarioServiceProxy();
  }
  
  private void _initConsultaUsuarioServiceProxy() {
    try {
      consultaUsuarioService = (new ConsultaUsuarioSade_ServiceLocator()).getConsultaUsuarioPort();
      if (consultaUsuarioService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)consultaUsuarioService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)consultaUsuarioService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (consultaUsuarioService != null)
      ((javax.xml.rpc.Stub)consultaUsuarioService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public external.service.eu.gcaba.gob.ar.ConsultaUsuarioService getConsultaUsuarioService() {
    if (consultaUsuarioService == null)
      _initConsultaUsuarioServiceProxy();
    return consultaUsuarioService;
  }
  
  public external.service.eu.gcaba.gob.ar.ConsultaUsuarioResponse[] consultaUsuarioSade(java.lang.String consultaUsuarioSadeRequest) throws java.rmi.RemoteException, external.service.eu.gcaba.gob.ar.ServicioWebException{
    if (consultaUsuarioService == null)
      _initConsultaUsuarioServiceProxy();
    return consultaUsuarioService.consultaUsuarioSade(consultaUsuarioSadeRequest);
  }
  
  
}