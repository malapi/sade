/**
 * DatosTareaBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.services.ee.gcaba.gob.ar;

public class DatosTareaBean  implements java.io.Serializable {
    private java.lang.String codigoExpediente;

    private java.lang.String codigoTrata;

    private java.lang.String descripcionTrata;

    private java.lang.String estado;

    private java.lang.String fechaModificacion;

    private java.lang.String motivo;

    private java.lang.String usuarioAnterior;

    public DatosTareaBean() {
    }

    public DatosTareaBean(
           java.lang.String codigoExpediente,
           java.lang.String codigoTrata,
           java.lang.String descripcionTrata,
           java.lang.String estado,
           java.lang.String fechaModificacion,
           java.lang.String motivo,
           java.lang.String usuarioAnterior) {
           this.codigoExpediente = codigoExpediente;
           this.codigoTrata = codigoTrata;
           this.descripcionTrata = descripcionTrata;
           this.estado = estado;
           this.fechaModificacion = fechaModificacion;
           this.motivo = motivo;
           this.usuarioAnterior = usuarioAnterior;
    }


    /**
     * Gets the codigoExpediente value for this DatosTareaBean.
     * 
     * @return codigoExpediente
     */
    public java.lang.String getCodigoExpediente() {
        return codigoExpediente;
    }


    /**
     * Sets the codigoExpediente value for this DatosTareaBean.
     * 
     * @param codigoExpediente
     */
    public void setCodigoExpediente(java.lang.String codigoExpediente) {
        this.codigoExpediente = codigoExpediente;
    }


    /**
     * Gets the codigoTrata value for this DatosTareaBean.
     * 
     * @return codigoTrata
     */
    public java.lang.String getCodigoTrata() {
        return codigoTrata;
    }


    /**
     * Sets the codigoTrata value for this DatosTareaBean.
     * 
     * @param codigoTrata
     */
    public void setCodigoTrata(java.lang.String codigoTrata) {
        this.codigoTrata = codigoTrata;
    }


    /**
     * Gets the descripcionTrata value for this DatosTareaBean.
     * 
     * @return descripcionTrata
     */
    public java.lang.String getDescripcionTrata() {
        return descripcionTrata;
    }


    /**
     * Sets the descripcionTrata value for this DatosTareaBean.
     * 
     * @param descripcionTrata
     */
    public void setDescripcionTrata(java.lang.String descripcionTrata) {
        this.descripcionTrata = descripcionTrata;
    }


    /**
     * Gets the estado value for this DatosTareaBean.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this DatosTareaBean.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the fechaModificacion value for this DatosTareaBean.
     * 
     * @return fechaModificacion
     */
    public java.lang.String getFechaModificacion() {
        return fechaModificacion;
    }


    /**
     * Sets the fechaModificacion value for this DatosTareaBean.
     * 
     * @param fechaModificacion
     */
    public void setFechaModificacion(java.lang.String fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }


    /**
     * Gets the motivo value for this DatosTareaBean.
     * 
     * @return motivo
     */
    public java.lang.String getMotivo() {
        return motivo;
    }


    /**
     * Sets the motivo value for this DatosTareaBean.
     * 
     * @param motivo
     */
    public void setMotivo(java.lang.String motivo) {
        this.motivo = motivo;
    }


    /**
     * Gets the usuarioAnterior value for this DatosTareaBean.
     * 
     * @return usuarioAnterior
     */
    public java.lang.String getUsuarioAnterior() {
        return usuarioAnterior;
    }


    /**
     * Sets the usuarioAnterior value for this DatosTareaBean.
     * 
     * @param usuarioAnterior
     */
    public void setUsuarioAnterior(java.lang.String usuarioAnterior) {
        this.usuarioAnterior = usuarioAnterior;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DatosTareaBean)) return false;
        DatosTareaBean other = (DatosTareaBean) obj;
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
            ((this.codigoTrata==null && other.getCodigoTrata()==null) || 
             (this.codigoTrata!=null &&
              this.codigoTrata.equals(other.getCodigoTrata()))) &&
            ((this.descripcionTrata==null && other.getDescripcionTrata()==null) || 
             (this.descripcionTrata!=null &&
              this.descripcionTrata.equals(other.getDescripcionTrata()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.fechaModificacion==null && other.getFechaModificacion()==null) || 
             (this.fechaModificacion!=null &&
              this.fechaModificacion.equals(other.getFechaModificacion()))) &&
            ((this.motivo==null && other.getMotivo()==null) || 
             (this.motivo!=null &&
              this.motivo.equals(other.getMotivo()))) &&
            ((this.usuarioAnterior==null && other.getUsuarioAnterior()==null) || 
             (this.usuarioAnterior!=null &&
              this.usuarioAnterior.equals(other.getUsuarioAnterior())));
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
        if (getCodigoTrata() != null) {
            _hashCode += getCodigoTrata().hashCode();
        }
        if (getDescripcionTrata() != null) {
            _hashCode += getDescripcionTrata().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getFechaModificacion() != null) {
            _hashCode += getFechaModificacion().hashCode();
        }
        if (getMotivo() != null) {
            _hashCode += getMotivo().hashCode();
        }
        if (getUsuarioAnterior() != null) {
            _hashCode += getUsuarioAnterior().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DatosTareaBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "datosTareaBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoExpediente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoExpediente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTrata");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoTrata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionTrata");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcionTrata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaModificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaModificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "motivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioAnterior");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioAnterior"));
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
