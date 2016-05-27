/**
 * ExpedienteAsociadoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.services.ee.gcaba.gob.ar;

public class ExpedienteAsociadoResponse  implements java.io.Serializable {
    private java.lang.String codigoExpediente;

    private java.lang.String descTrataExAsociado;

    private java.lang.String estadoExpedienteAsociado;

    private java.util.Calendar fechaAsociacion;

    private java.lang.String trataExpedienteASociado;

    private java.lang.String usuarioAsociador;

    public ExpedienteAsociadoResponse() {
    }

    public ExpedienteAsociadoResponse(
           java.lang.String codigoExpediente,
           java.lang.String descTrataExAsociado,
           java.lang.String estadoExpedienteAsociado,
           java.util.Calendar fechaAsociacion,
           java.lang.String trataExpedienteASociado,
           java.lang.String usuarioAsociador) {
           this.codigoExpediente = codigoExpediente;
           this.descTrataExAsociado = descTrataExAsociado;
           this.estadoExpedienteAsociado = estadoExpedienteAsociado;
           this.fechaAsociacion = fechaAsociacion;
           this.trataExpedienteASociado = trataExpedienteASociado;
           this.usuarioAsociador = usuarioAsociador;
    }


    /**
     * Gets the codigoExpediente value for this ExpedienteAsociadoResponse.
     * 
     * @return codigoExpediente
     */
    public java.lang.String getCodigoExpediente() {
        return codigoExpediente;
    }


    /**
     * Sets the codigoExpediente value for this ExpedienteAsociadoResponse.
     * 
     * @param codigoExpediente
     */
    public void setCodigoExpediente(java.lang.String codigoExpediente) {
        this.codigoExpediente = codigoExpediente;
    }


    /**
     * Gets the descTrataExAsociado value for this ExpedienteAsociadoResponse.
     * 
     * @return descTrataExAsociado
     */
    public java.lang.String getDescTrataExAsociado() {
        return descTrataExAsociado;
    }


    /**
     * Sets the descTrataExAsociado value for this ExpedienteAsociadoResponse.
     * 
     * @param descTrataExAsociado
     */
    public void setDescTrataExAsociado(java.lang.String descTrataExAsociado) {
        this.descTrataExAsociado = descTrataExAsociado;
    }


    /**
     * Gets the estadoExpedienteAsociado value for this ExpedienteAsociadoResponse.
     * 
     * @return estadoExpedienteAsociado
     */
    public java.lang.String getEstadoExpedienteAsociado() {
        return estadoExpedienteAsociado;
    }


    /**
     * Sets the estadoExpedienteAsociado value for this ExpedienteAsociadoResponse.
     * 
     * @param estadoExpedienteAsociado
     */
    public void setEstadoExpedienteAsociado(java.lang.String estadoExpedienteAsociado) {
        this.estadoExpedienteAsociado = estadoExpedienteAsociado;
    }


    /**
     * Gets the fechaAsociacion value for this ExpedienteAsociadoResponse.
     * 
     * @return fechaAsociacion
     */
    public java.util.Calendar getFechaAsociacion() {
        return fechaAsociacion;
    }


    /**
     * Sets the fechaAsociacion value for this ExpedienteAsociadoResponse.
     * 
     * @param fechaAsociacion
     */
    public void setFechaAsociacion(java.util.Calendar fechaAsociacion) {
        this.fechaAsociacion = fechaAsociacion;
    }


    /**
     * Gets the trataExpedienteASociado value for this ExpedienteAsociadoResponse.
     * 
     * @return trataExpedienteASociado
     */
    public java.lang.String getTrataExpedienteASociado() {
        return trataExpedienteASociado;
    }


    /**
     * Sets the trataExpedienteASociado value for this ExpedienteAsociadoResponse.
     * 
     * @param trataExpedienteASociado
     */
    public void setTrataExpedienteASociado(java.lang.String trataExpedienteASociado) {
        this.trataExpedienteASociado = trataExpedienteASociado;
    }


    /**
     * Gets the usuarioAsociador value for this ExpedienteAsociadoResponse.
     * 
     * @return usuarioAsociador
     */
    public java.lang.String getUsuarioAsociador() {
        return usuarioAsociador;
    }


    /**
     * Sets the usuarioAsociador value for this ExpedienteAsociadoResponse.
     * 
     * @param usuarioAsociador
     */
    public void setUsuarioAsociador(java.lang.String usuarioAsociador) {
        this.usuarioAsociador = usuarioAsociador;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExpedienteAsociadoResponse)) return false;
        ExpedienteAsociadoResponse other = (ExpedienteAsociadoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoExpediente==null && other.getCodigoExpediente()==null) || 
             (this.codigoExpediente!=null &&
              this.codigoExpediente.equals(other.getCodigoExpediente()))) &&
            ((this.descTrataExAsociado==null && other.getDescTrataExAsociado()==null) || 
             (this.descTrataExAsociado!=null &&
              this.descTrataExAsociado.equals(other.getDescTrataExAsociado()))) &&
            ((this.estadoExpedienteAsociado==null && other.getEstadoExpedienteAsociado()==null) || 
             (this.estadoExpedienteAsociado!=null &&
              this.estadoExpedienteAsociado.equals(other.getEstadoExpedienteAsociado()))) &&
            ((this.fechaAsociacion==null && other.getFechaAsociacion()==null) || 
             (this.fechaAsociacion!=null &&
              this.fechaAsociacion.equals(other.getFechaAsociacion()))) &&
            ((this.trataExpedienteASociado==null && other.getTrataExpedienteASociado()==null) || 
             (this.trataExpedienteASociado!=null &&
              this.trataExpedienteASociado.equals(other.getTrataExpedienteASociado()))) &&
            ((this.usuarioAsociador==null && other.getUsuarioAsociador()==null) || 
             (this.usuarioAsociador!=null &&
              this.usuarioAsociador.equals(other.getUsuarioAsociador())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCodigoExpediente() != null) {
            _hashCode += getCodigoExpediente().hashCode();
        }
        if (getDescTrataExAsociado() != null) {
            _hashCode += getDescTrataExAsociado().hashCode();
        }
        if (getEstadoExpedienteAsociado() != null) {
            _hashCode += getEstadoExpedienteAsociado().hashCode();
        }
        if (getFechaAsociacion() != null) {
            _hashCode += getFechaAsociacion().hashCode();
        }
        if (getTrataExpedienteASociado() != null) {
            _hashCode += getTrataExpedienteASociado().hashCode();
        }
        if (getUsuarioAsociador() != null) {
            _hashCode += getUsuarioAsociador().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExpedienteAsociadoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "expedienteAsociadoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoExpediente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoExpediente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descTrataExAsociado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descTrataExAsociado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoExpedienteAsociado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoExpedienteAsociado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaAsociacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaAsociacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trataExpedienteASociado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trataExpedienteASociado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioAsociador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioAsociador"));
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
