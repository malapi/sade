/**
 * ExpedienteAsociadoDTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.services.ee.gcaba.gob.ar;

public class ExpedienteAsociadoDTO  implements java.io.Serializable {
    private java.lang.Boolean esCabecera;

    private java.lang.String numeroSade;

    public ExpedienteAsociadoDTO() {
    }

    public ExpedienteAsociadoDTO(
           java.lang.Boolean esCabecera,
           java.lang.String numeroSade) {
           this.esCabecera = esCabecera;
           this.numeroSade = numeroSade;
    }


    /**
     * Gets the esCabecera value for this ExpedienteAsociadoDTO.
     * 
     * @return esCabecera
     */
    public java.lang.Boolean getEsCabecera() {
        return esCabecera;
    }


    /**
     * Sets the esCabecera value for this ExpedienteAsociadoDTO.
     * 
     * @param esCabecera
     */
    public void setEsCabecera(java.lang.Boolean esCabecera) {
        this.esCabecera = esCabecera;
    }


    /**
     * Gets the numeroSade value for this ExpedienteAsociadoDTO.
     * 
     * @return numeroSade
     */
    public java.lang.String getNumeroSade() {
        return numeroSade;
    }


    /**
     * Sets the numeroSade value for this ExpedienteAsociadoDTO.
     * 
     * @param numeroSade
     */
    public void setNumeroSade(java.lang.String numeroSade) {
        this.numeroSade = numeroSade;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExpedienteAsociadoDTO)) return false;
        ExpedienteAsociadoDTO other = (ExpedienteAsociadoDTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.esCabecera==null && other.getEsCabecera()==null) || 
             (this.esCabecera!=null &&
              this.esCabecera.equals(other.getEsCabecera()))) &&
            ((this.numeroSade==null && other.getNumeroSade()==null) || 
             (this.numeroSade!=null &&
              this.numeroSade.equals(other.getNumeroSade())));
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
        if (getEsCabecera() != null) {
            _hashCode += getEsCabecera().hashCode();
        }
        if (getNumeroSade() != null) {
            _hashCode += getNumeroSade().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExpedienteAsociadoDTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "expedienteAsociadoDTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esCabecera");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esCabecera"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroSade");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroSade"));
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
