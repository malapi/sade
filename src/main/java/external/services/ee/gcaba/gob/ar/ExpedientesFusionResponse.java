/**
 * ExpedientesFusionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.services.ee.gcaba.gob.ar;

public class ExpedientesFusionResponse  implements java.io.Serializable {
    private java.lang.String codigoExpediente;

    private java.lang.String codigoTrata;

    private java.lang.String descripcionTrata;

    public ExpedientesFusionResponse() {
    }

    public ExpedientesFusionResponse(
           java.lang.String codigoExpediente,
           java.lang.String codigoTrata,
           java.lang.String descripcionTrata) {
           this.codigoExpediente = codigoExpediente;
           this.codigoTrata = codigoTrata;
           this.descripcionTrata = descripcionTrata;
    }


    /**
     * Gets the codigoExpediente value for this ExpedientesFusionResponse.
     * 
     * @return codigoExpediente
     */
    public java.lang.String getCodigoExpediente() {
        return codigoExpediente;
    }


    /**
     * Sets the codigoExpediente value for this ExpedientesFusionResponse.
     * 
     * @param codigoExpediente
     */
    public void setCodigoExpediente(java.lang.String codigoExpediente) {
        this.codigoExpediente = codigoExpediente;
    }


    /**
     * Gets the codigoTrata value for this ExpedientesFusionResponse.
     * 
     * @return codigoTrata
     */
    public java.lang.String getCodigoTrata() {
        return codigoTrata;
    }


    /**
     * Sets the codigoTrata value for this ExpedientesFusionResponse.
     * 
     * @param codigoTrata
     */
    public void setCodigoTrata(java.lang.String codigoTrata) {
        this.codigoTrata = codigoTrata;
    }


    /**
     * Gets the descripcionTrata value for this ExpedientesFusionResponse.
     * 
     * @return descripcionTrata
     */
    public java.lang.String getDescripcionTrata() {
        return descripcionTrata;
    }


    /**
     * Sets the descripcionTrata value for this ExpedientesFusionResponse.
     * 
     * @param descripcionTrata
     */
    public void setDescripcionTrata(java.lang.String descripcionTrata) {
        this.descripcionTrata = descripcionTrata;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExpedientesFusionResponse)) return false;
        ExpedientesFusionResponse other = (ExpedientesFusionResponse) obj;
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
              this.descripcionTrata.equals(other.getDescripcionTrata())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExpedientesFusionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "expedientesFusionResponse"));
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
