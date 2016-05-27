/**
 * IExternalGenerarDocumentoService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package generardocumento.external.services.satra.gedo.gcaba.gob.ar;

public interface IExternalGenerarDocumentoService_PortType extends java.rmi.Remote {
    public generardocumento.external.services.satra.gedo.gcaba.gob.ar.ResponseExternalGenerarDocumento generarDocumentoGEDO(generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumento request) throws java.rmi.RemoteException, generardocumento.external.services.satra.gedo.gcaba.gob.ar.ErrorGeneracionDocumentoException, generardocumento.external.services.satra.gedo.gcaba.gob.ar.ClavesFaltantesException, generardocumento.external.services.satra.gedo.gcaba.gob.ar.ParametroInvalidoException, generardocumento.external.services.satra.gedo.gcaba.gob.ar.CantidadDatosNoSoportadaException;
    public generardocumento.external.services.satra.gedo.gcaba.gob.ar.ResponseExternalGenerarDocumento generarDocumentoUsuarioExterno(generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumentoUsuarioExterno request) throws java.rmi.RemoteException, generardocumento.external.services.satra.gedo.gcaba.gob.ar.ErrorGeneracionDocumentoException, generardocumento.external.services.satra.gedo.gcaba.gob.ar.ClavesFaltantesException, generardocumento.external.services.satra.gedo.gcaba.gob.ar.ParametroInvalidoException, generardocumento.external.services.satra.gedo.gcaba.gob.ar.CantidadDatosNoSoportadaException;
}
