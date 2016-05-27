/**
 * RequestExternalGenerarDocumentoUsuarioExterno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package generardocumento.external.services.satra.gedo.gcaba.gob.ar;

public class RequestExternalGenerarDocumentoUsuarioExterno  extends generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumento  implements java.io.Serializable {
    private java.lang.String cargo;

    private java.lang.String nombreYApellido;

    private java.lang.String reparticion;

    public RequestExternalGenerarDocumentoUsuarioExterno() {
    }

    public RequestExternalGenerarDocumentoUsuarioExterno(
           java.lang.String acronimoTipoDocumento,
           byte[] data,
           java.lang.Integer idTransaccion,
           generardocumento.external.services.satra.gedo.gcaba.gob.ar.ArchivoEmbebidoDTO[] listaArchivosEmbebidos,
           java.lang.String[] listaUsuariosDestinatarios,
           java.lang.String[] listaUsuariosDestinatariosCopia,
           java.lang.String[] listaUsuariosDestinatariosCopiaOculta,
           generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumentoListaUsuariosDestinatariosExternosEntry[] listaUsuariosDestinatariosExternos,
           java.lang.String mensajeDestinatario,
           generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumentoMetaDatosEntry[] metaDatos,
           java.lang.String referencia,
           java.lang.String sistemaOrigen,
           java.lang.String tipoArchivo,
           java.lang.String usuario,
           java.lang.String cargo,
           java.lang.String nombreYApellido,
           java.lang.String reparticion) {
        super(
            acronimoTipoDocumento,
            data,
            idTransaccion,
            listaArchivosEmbebidos,
            listaUsuariosDestinatarios,
            listaUsuariosDestinatariosCopia,
            listaUsuariosDestinatariosCopiaOculta,
            listaUsuariosDestinatariosExternos,
            mensajeDestinatario,
            metaDatos,
            referencia,
            sistemaOrigen,
            tipoArchivo,
            usuario);
        this.cargo = cargo;
        this.nombreYApellido = nombreYApellido;
        this.reparticion = reparticion;
    }


    /**
     * Gets the cargo value for this RequestExternalGenerarDocumentoUsuarioExterno.
     * 
     * @return cargo
     */
    public java.lang.String getCargo() {
        return cargo;
    }


    /**
     * Sets the cargo value for this RequestExternalGenerarDocumentoUsuarioExterno.
     * 
     * @param cargo
     */
    public void setCargo(java.lang.String cargo) {
        this.cargo = cargo;
    }


    /**
     * Gets the nombreYApellido value for this RequestExternalGenerarDocumentoUsuarioExterno.
     * 
     * @return nombreYApellido
     */
    public java.lang.String getNombreYApellido() {
        return nombreYApellido;
    }


    /**
     * Sets the nombreYApellido value for this RequestExternalGenerarDocumentoUsuarioExterno.
     * 
     * @param nombreYApellido
     */
    public void setNombreYApellido(java.lang.String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }


    /**
     * Gets the reparticion value for this RequestExternalGenerarDocumentoUsuarioExterno.
     * 
     * @return reparticion
     */
    public java.lang.String getReparticion() {
        return reparticion;
    }


    /**
     * Sets the reparticion value for this RequestExternalGenerarDocumentoUsuarioExterno.
     * 
     * @param reparticion
     */
    public void setReparticion(java.lang.String reparticion) {
        this.reparticion = reparticion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestExternalGenerarDocumentoUsuarioExterno)) return false;
        RequestExternalGenerarDocumentoUsuarioExterno other = (RequestExternalGenerarDocumentoUsuarioExterno) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.cargo==null && other.getCargo()==null) || 
             (this.cargo!=null &&
              this.cargo.equals(other.getCargo()))) &&
            ((this.nombreYApellido==null && other.getNombreYApellido()==null) || 
             (this.nombreYApellido!=null &&
              this.nombreYApellido.equals(other.getNombreYApellido()))) &&
            ((this.reparticion==null && other.getReparticion()==null) || 
             (this.reparticion!=null &&
              this.reparticion.equals(other.getReparticion())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCargo() != null) {
            _hashCode += getCargo().hashCode();
        }
        if (getNombreYApellido() != null) {
            _hashCode += getNombreYApellido().hashCode();
        }
        if (getReparticion() != null) {
            _hashCode += getReparticion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestExternalGenerarDocumentoUsuarioExterno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "requestExternalGenerarDocumentoUsuarioExterno"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cargo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreYApellido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreYApellido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reparticion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reparticion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
