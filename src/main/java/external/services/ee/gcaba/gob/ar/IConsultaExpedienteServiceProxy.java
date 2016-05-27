package external.services.ee.gcaba.gob.ar;

public class IConsultaExpedienteServiceProxy implements external.services.ee.gcaba.gob.ar.IConsultaExpedienteService_PortType {
  private String _endpoint = null;
  private external.services.ee.gcaba.gob.ar.IConsultaExpedienteService_PortType iConsultaExpedienteService_PortType = null;
  
  public IConsultaExpedienteServiceProxy() {
    _initIConsultaExpedienteServiceProxy();
  }
  
  public IConsultaExpedienteServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIConsultaExpedienteServiceProxy();
  }
  
  private void _initIConsultaExpedienteServiceProxy() {
    try {
      iConsultaExpedienteService_PortType = (new external.services.ee.gcaba.gob.ar.IConsultaExpedienteService_ServiceLocator()).getIConsultaExpedienteServicePort();
      if (iConsultaExpedienteService_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iConsultaExpedienteService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iConsultaExpedienteService_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iConsultaExpedienteService_PortType != null)
      ((javax.xml.rpc.Stub)iConsultaExpedienteService_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public external.services.ee.gcaba.gob.ar.IConsultaExpedienteService_PortType getIConsultaExpedienteService_PortType() {
    if (iConsultaExpedienteService_PortType == null)
      _initIConsultaExpedienteServiceProxy();
    return iConsultaExpedienteService_PortType;
  }
  
  public byte[] obtenerDocumentoCaratulaVariable(java.lang.String codigoEE, java.lang.String usuario) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException{
    if (iConsultaExpedienteService_PortType == null)
      _initIConsultaExpedienteServiceProxy();
    return iConsultaExpedienteService_PortType.obtenerDocumentoCaratulaVariable(codigoEE, usuario);
  }
  
  public external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponseDetallado consultaEEDetallado(java.lang.String codigoEE) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException{
    if (iConsultaExpedienteService_PortType == null)
      _initIConsultaExpedienteServiceProxy();
    return iConsultaExpedienteService_PortType.consultaEEDetallado(codigoEE);
  }
  
  public external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse obtenerCaratulaPorNumeroExpediente(java.lang.String expedienteCodigo) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException{
    if (iConsultaExpedienteService_PortType == null)
      _initIConsultaExpedienteServiceProxy();
    return iConsultaExpedienteService_PortType.obtenerCaratulaPorNumeroExpediente(expedienteCodigo);
  }
  
  public external.services.ee.gcaba.gob.ar.CaratulaVariableResponse obtenerDatosCaratulaVariable(java.lang.String codigoEE, java.lang.String usuario) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException{
    if (iConsultaExpedienteService_PortType == null)
      _initIConsultaExpedienteServiceProxy();
    return iConsultaExpedienteService_PortType.obtenerDatosCaratulaVariable(codigoEE, usuario);
  }
  
  public boolean validarEE(java.lang.String codigoEE) throws java.rmi.RemoteException{
    if (iConsultaExpedienteService_PortType == null)
      _initIConsultaExpedienteServiceProxy();
    return iConsultaExpedienteService_PortType.validarEE(codigoEE);
  }
  
  public int consultaIdFCPorExpediente(java.lang.String codigoEE) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException{
    if (iConsultaExpedienteService_PortType == null)
      _initIConsultaExpedienteServiceProxy();
    return iConsultaExpedienteService_PortType.consultaIdFCPorExpediente(codigoEE);
  }
  
  public external.services.ee.gcaba.gob.ar.HistorialDePasesResponse obtenerHistorialDePasesDeExpediente(java.lang.String codigoEE) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException{
    if (iConsultaExpedienteService_PortType == null)
      _initIConsultaExpedienteServiceProxy();
    return iConsultaExpedienteService_PortType.obtenerHistorialDePasesDeExpediente(codigoEE);
  }
  
  public external.services.ee.gcaba.gob.ar.ExpedienteElectronicoResponse[] obtenerExpedientesEnGuardaTemporalMayorA24Meses(java.lang.Integer cantidadDeDias) throws java.rmi.RemoteException{
    if (iConsultaExpedienteService_PortType == null)
      _initIConsultaExpedienteServiceProxy();
    return iConsultaExpedienteService_PortType.obtenerExpedientesEnGuardaTemporalMayorA24Meses(cantidadDeDias);
  }
  
  public external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse consultaEE(java.lang.String codigoEE) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException, external.services.ee.gcaba.gob.ar.ExpedienteInexistenteException{
    if (iConsultaExpedienteService_PortType == null)
      _initIConsultaExpedienteServiceProxy();
    return iConsultaExpedienteService_PortType.consultaEE(codigoEE);
  }
  
  public java.lang.String[] consultaExpedientesPorSistemaOrigenUsuario(java.lang.String sistemaOrigen, java.lang.String usuario) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException{
    if (iConsultaExpedienteService_PortType == null)
      _initIConsultaExpedienteServiceProxy();
    return iConsultaExpedienteService_PortType.consultaExpedientesPorSistemaOrigenUsuario(sistemaOrigen, usuario);
  }
  
  public external.services.ee.gcaba.gob.ar.ObtenerCaratulaPorCodigoEEResponse obtenerCaratulaPorCodigoEE(external.services.ee.gcaba.gob.ar.ObtenerCaratulaPorCodigoEERequest request) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException{
    if (iConsultaExpedienteService_PortType == null)
      _initIConsultaExpedienteServiceProxy();
    return iConsultaExpedienteService_PortType.obtenerCaratulaPorCodigoEE(request);
  }
  
  public external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse consultarDatosExpedientePorCodigosDeTrata(java.lang.String[] listaDeCodigosTrata, java.lang.String expedienteEstado, java.lang.String expedienteUsuarioAsignado) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ProcesoFallidoException{
    if (iConsultaExpedienteService_PortType == null)
      _initIConsultaExpedienteServiceProxy();
    return iConsultaExpedienteService_PortType.consultarDatosExpedientePorCodigosDeTrata(listaDeCodigosTrata, expedienteEstado, expedienteUsuarioAsignado);
  }
  
  public external.services.ee.gcaba.gob.ar.ExpedienteElectronicoResponse[] obtenerExpedientesEnGuardaTemporalPorCodigoExpediente(java.lang.String codigoExpediente) throws java.rmi.RemoteException{
    if (iConsultaExpedienteService_PortType == null)
      _initIConsultaExpedienteServiceProxy();
    return iConsultaExpedienteService_PortType.obtenerExpedientesEnGuardaTemporalPorCodigoExpediente(codigoExpediente);
  }
  
  public java.lang.String[] consultaExpedientesPorSistemaOrigenReparticion(java.lang.String sistemaOrigen, java.lang.String reparticion) throws java.rmi.RemoteException, external.services.ee.gcaba.gob.ar.ParametroIncorrectoException{
    if (iConsultaExpedienteService_PortType == null)
      _initIConsultaExpedienteServiceProxy();
    return iConsultaExpedienteService_PortType.consultaExpedientesPorSistemaOrigenReparticion(sistemaOrigen, reparticion);
  }
  
  
}