/**
 * ObtenerCaratulaPorCodigoEERequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.services.ee.gcaba.gob.ar;

public class ObtenerCaratulaPorCodigoEERequest  implements java.io.Serializable {
    private java.lang.String codigoEE;

    public ObtenerCaratulaPorCodigoEERequest() {
    }

    public ObtenerCaratulaPorCodigoEERequest(
           java.lang.String codigoEE) {
           this.codigoEE = codigoEE;
    }


    /**
     * Gets the codigoEE value for this ObtenerCaratulaPorCodigoEERequest.
     * 
     * @return codigoEE
     */
    public java.lang.String getCodigoEE() {
        return codigoEE;
    }


    /**
     * Sets the codigoEE value for this ObtenerCaratulaPorCodigoEERequest.
     * 
     * @param codigoEE
     */
    public void setCodigoEE(java.lang.String codigoEE) {
        this.codigoEE = codigoEE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObtenerCaratulaPorCodigoEERequest)) return false;
        ObtenerCaratulaPorCodigoEERequest other = (ObtenerCaratulaPorCodigoEERequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoEE==null && other.getCodigoEE()==null) || 
             (this.codigoEE!=null &&
              this.codigoEE.equals(other.getCodigoEE())));
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
        if (getCodigoEE() != null) {
            _hashCode += getCodigoEE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObtenerCaratulaPorCodigoEERequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "obtenerCaratulaPorCodigoEERequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoEE"));
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
