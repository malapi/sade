/**
 * ExpedientesVinculadosResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.services.ee.gcaba.gob.ar;

public class ExpedientesVinculadosResponse  implements java.io.Serializable {
    private java.lang.String codigoExpediente;

    private java.lang.String descTrataExVinculado;

    private java.lang.String estadoExpedienteVinculado;

    private java.util.Calendar fechaVinculacion;

    private java.lang.String trataExpedienteVinculado;

    private java.lang.String usuarioVinculador;

    public ExpedientesVinculadosResponse() {
    }

    public ExpedientesVinculadosResponse(
           java.lang.String codigoExpediente,
           java.lang.String descTrataExVinculado,
           java.lang.String estadoExpedienteVinculado,
           java.util.Calendar fechaVinculacion,
           java.lang.String trataExpedienteVinculado,
           java.lang.String usuarioVinculador) {
           this.codigoExpediente = codigoExpediente;
           this.descTrataExVinculado = descTrataExVinculado;
           this.estadoExpedienteVinculado = estadoExpedienteVinculado;
           this.fechaVinculacion = fechaVinculacion;
           this.trataExpedienteVinculado = trataExpedienteVinculado;
           this.usuarioVinculador = usuarioVinculador;
    }


    /**
     * Gets the codigoExpediente value for this ExpedientesVinculadosResponse.
     * 
     * @return codigoExpediente
     */
    public java.lang.String getCodigoExpediente() {
        return codigoExpediente;
    }


    /**
     * Sets the codigoExpediente value for this ExpedientesVinculadosResponse.
     * 
     * @param codigoExpediente
     */
    public void setCodigoExpediente(java.lang.String codigoExpediente) {
        this.codigoExpediente = codigoExpediente;
    }


    /**
     * Gets the descTrataExVinculado value for this ExpedientesVinculadosResponse.
     * 
     * @return descTrataExVinculado
     */
    public java.lang.String getDescTrataExVinculado() {
        return descTrataExVinculado;
    }


    /**
     * Sets the descTrataExVinculado value for this ExpedientesVinculadosResponse.
     * 
     * @param descTrataExVinculado
     */
    public void setDescTrataExVinculado(java.lang.String descTrataExVinculado) {
        this.descTrataExVinculado = descTrataExVinculado;
    }


    /**
     * Gets the estadoExpedienteVinculado value for this ExpedientesVinculadosResponse.
     * 
     * @return estadoExpedienteVinculado
     */
    public java.lang.String getEstadoExpedienteVinculado() {
        return estadoExpedienteVinculado;
    }


    /**
     * Sets the estadoExpedienteVinculado value for this ExpedientesVinculadosResponse.
     * 
     * @param estadoExpedienteVinculado
     */
    public void setEstadoExpedienteVinculado(java.lang.String estadoExpedienteVinculado) {
        this.estadoExpedienteVinculado = estadoExpedienteVinculado;
    }


    /**
     * Gets the fechaVinculacion value for this ExpedientesVinculadosResponse.
     * 
     * @return fechaVinculacion
     */
    public java.util.Calendar getFechaVinculacion() {
        return fechaVinculacion;
    }


    /**
     * Sets the fechaVinculacion value for this ExpedientesVinculadosResponse.
     * 
     * @param fechaVinculacion
     */
    public void setFechaVinculacion(java.util.Calendar fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
    }


    /**
     * Gets the trataExpedienteVinculado value for this ExpedientesVinculadosResponse.
     * 
     * @return trataExpedienteVinculado
     */
    public java.lang.String getTrataExpedienteVinculado() {
        return trataExpedienteVinculado;
    }


    /**
     * Sets the trataExpedienteVinculado value for this ExpedientesVinculadosResponse.
     * 
     * @param trataExpedienteVinculado
     */
    public void setTrataExpedienteVinculado(java.lang.String trataExpedienteVinculado) {
        this.trataExpedienteVinculado = trataExpedienteVinculado;
    }


    /**
     * Gets the usuarioVinculador value for this ExpedientesVinculadosResponse.
     * 
     * @return usuarioVinculador
     */
    public java.lang.String getUsuarioVinculador() {
        return usuarioVinculador;
    }


    /**
     * Sets the usuarioVinculador value for this ExpedientesVinculadosResponse.
     * 
     * @param usuarioVinculador
     */
    public void setUsuarioVinculador(java.lang.String usuarioVinculador) {
        this.usuarioVinculador = usuarioVinculador;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExpedientesVinculadosResponse)) return false;
        ExpedientesVinculadosResponse other = (ExpedientesVinculadosResponse) obj;
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
            ((this.descTrataExVinculado==null && other.getDescTrataExVinculado()==null) || 
             (this.descTrataExVinculado!=null &&
              this.descTrataExVinculado.equals(other.getDescTrataExVinculado()))) &&
            ((this.estadoExpedienteVinculado==null && other.getEstadoExpedienteVinculado()==null) || 
             (this.estadoExpedienteVinculado!=null &&
              this.estadoExpedienteVinculado.equals(other.getEstadoExpedienteVinculado()))) &&
            ((this.fechaVinculacion==null && other.getFechaVinculacion()==null) || 
             (this.fechaVinculacion!=null &&
              this.fechaVinculacion.equals(other.getFechaVinculacion()))) &&
            ((this.trataExpedienteVinculado==null && other.getTrataExpedienteVinculado()==null) || 
             (this.trataExpedienteVinculado!=null &&
              this.trataExpedienteVinculado.equals(other.getTrataExpedienteVinculado()))) &&
            ((this.usuarioVinculador==null && other.getUsuarioVinculador()==null) || 
             (this.usuarioVinculador!=null &&
              this.usuarioVinculador.equals(other.getUsuarioVinculador())));
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
        if (getDescTrataExVinculado() != null) {
            _hashCode += getDescTrataExVinculado().hashCode();
        }
        if (getEstadoExpedienteVinculado() != null) {
            _hashCode += getEstadoExpedienteVinculado().hashCode();
        }
        if (getFechaVinculacion() != null) {
            _hashCode += getFechaVinculacion().hashCode();
        }
        if (getTrataExpedienteVinculado() != null) {
            _hashCode += getTrataExpedienteVinculado().hashCode();
        }
        if (getUsuarioVinculador() != null) {
            _hashCode += getUsuarioVinculador().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExpedientesVinculadosResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "expedientesVinculadosResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoExpediente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoExpediente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descTrataExVinculado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descTrataExVinculado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoExpedienteVinculado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoExpedienteVinculado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaVinculacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaVinculacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trataExpedienteVinculado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trataExpedienteVinculado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioVinculador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioVinculador"));
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
