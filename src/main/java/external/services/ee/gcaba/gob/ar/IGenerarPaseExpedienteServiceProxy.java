package external.services.ee.gcaba.gob.ar;

public class IGenerarPaseExpedienteServiceProxy implements external.services.ee.gcaba.gob.ar.IGenerarPaseExpedienteService_PortType {
  private String _endpoint = null;
  private external.services.ee.gcaba.gob.ar.IGenerarPaseExpedienteService_PortType iGenerarPaseExpedienteService_PortType = null;
  
  public IGenerarPaseExpedienteServiceProxy() {
    _initIGenerarPaseExpedienteServiceProxy();
  }
  
  public IGenerarPaseExpedienteServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIGenerarPaseExpedienteServiceProxy();
  }
  
  private void _initIGenerarPaseExpedienteServiceProxy() {
    try {
      iGenerarPaseExpedienteService_PortType = (new external.services.ee.gcaba.gob.ar.IGenerarPaseExpedienteService_ServiceLocator()).getIGenerarPaseExpedienteServicePort();
      if (iGenerarPaseExpedienteService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iGenerarPaseExpedienteService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iGenerarPaseExpedienteService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iGenerarPaseExpedienteService_PortType != null)
      ((javax.xml.rpc.Stub)iGenerarPaseExpedienteService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public external.services.ee.gcaba.gob.ar.IGenerarPaseExpedienteService_PortType getIGenerarPaseExpedienteService_PortType() {
    if (iGenerarPaseExpedienteService_PortType == null)
      _initIGenerarPaseExpedienteServiceProxy();
    return iGenerarPaseExpedienteService_PortType;
  }
  
  public void generarPaseASolicitudArchivo(external.services.ee.gcaba.gob.ar.PaseExpedienteRequest datosPase) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException{
    if (iGenerarPaseExpedienteService_PortType == null)
      _initIGenerarPaseExpedienteServiceProxy();
    iGenerarPaseExpedienteService_PortType.generarPaseASolicitudArchivo(datosPase);
  }
  
  public java.lang.String generarPaseEEConBloqueo(external.services.ee.gcaba.gob.ar.PaseExpedienteRequest datosPase) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException{
    if (iGenerarPaseExpedienteService_PortType == null)
      _initIGenerarPaseExpedienteServiceProxy();
    return iGenerarPaseExpedienteService_PortType.generarPaseEEConBloqueo(datosPase);
  }
  
  public java.lang.String generarPaseEESinDocumento(external.services.ee.gcaba.gob.ar.PaseExpedienteRequest datosPase, java.lang.String numeroSadePase) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException{
    if (iGenerarPaseExpedienteService_PortType == null)
      _initIGenerarPaseExpedienteServiceProxy();
    return iGenerarPaseExpedienteService_PortType.generarPaseEESinDocumento(datosPase, numeroSadePase);
  }
  
  public java.lang.String generarPaseEE(external.services.ee.gcaba.gob.ar.PaseExpedienteRequest datosPase) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException{
    if (iGenerarPaseExpedienteService_PortType == null)
      _initIGenerarPaseExpedienteServiceProxy();
    return iGenerarPaseExpedienteService_PortType.generarPaseEE(datosPase);
  }
  
  public java.lang.String generarPaseEEAdministrador(external.services.ee.gcaba.gob.ar.PaseExpedienteRequest arg0) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException{
    if (iGenerarPaseExpedienteService_PortType == null)
      _initIGenerarPaseExpedienteServiceProxy();
    return iGenerarPaseExpedienteService_PortType.generarPaseEEAdministrador(arg0);
  }
  
  public void generarPaseEEAArchivo(external.services.ee.gcaba.gob.ar.PaseExpedienteRequest datosPase) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException{
    if (iGenerarPaseExpedienteService_PortType == null)
      _initIGenerarPaseExpedienteServiceProxy();
    iGenerarPaseExpedienteService_PortType.generarPaseEEAArchivo(datosPase);
  }
  
  public java.lang.String generarPaseEEConBloqueoYAclaracion(external.services.ee.gcaba.gob.ar.PaseExpedienteRequest datosPase, java.lang.String aclaracion) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException{
    if (iGenerarPaseExpedienteService_PortType == null)
      _initIGenerarPaseExpedienteServiceProxy();
    return iGenerarPaseExpedienteService_PortType.generarPaseEEConBloqueoYAclaracion(datosPase, aclaracion);
  }
  
  public java.lang.String generarPaseEEConDesbloqueo(external.services.ee.gcaba.gob.ar.PaseExpedienteRequest datosPase) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteNoDisponibleException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException{
    if (iGenerarPaseExpedienteService_PortType == null)
      _initIGenerarPaseExpedienteServiceProxy();
    return iGenerarPaseExpedienteService_PortType.generarPaseEEConDesbloqueo(datosPase);
  }
  
  
}