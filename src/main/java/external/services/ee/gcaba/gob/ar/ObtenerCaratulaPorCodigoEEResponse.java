/**
 * ObtenerCaratulaPorCodigoEEResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.services.ee.gcaba.gob.ar;

public class ObtenerCaratulaPorCodigoEEResponse  implements java.io.Serializable {
    private external.services.ee.gcaba.gob.ar.DtoDatosCaratula dtoDatosCaratula;

    public ObtenerCaratulaPorCodigoEEResponse() {
    }

    public ObtenerCaratulaPorCodigoEEResponse(
           external.services.ee.gcaba.gob.ar.DtoDatosCaratula dtoDatosCaratula) {
           this.dtoDatosCaratula = dtoDatosCaratula;
    }


    /**
     * Gets the dtoDatosCaratula value for this ObtenerCaratulaPorCodigoEEResponse.
     * 
     * @return dtoDatosCaratula
     */
    public external.services.ee.gcaba.gob.ar.DtoDatosCaratula getDtoDatosCaratula() {
        return dtoDatosCaratula;
    }


    /**
     * Sets the dtoDatosCaratula value for this ObtenerCaratulaPorCodigoEEResponse.
     * 
     * @param dtoDatosCaratula
     */
    public void setDtoDatosCaratula(external.services.ee.gcaba.gob.ar.DtoDatosCaratula dtoDatosCaratula) {
        this.dtoDatosCaratula = dtoDatosCaratula;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObtenerCaratulaPorCodigoEEResponse)) return false;
        ObtenerCaratulaPorCodigoEEResponse other = (ObtenerCaratulaPorCodigoEEResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dtoDatosCaratula==null && other.getDtoDatosCaratula()==null) || 
             (this.dtoDatosCaratula!=null &&
              this.dtoDatosCaratula.equals(other.getDtoDatosCaratula())));
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
        if (getDtoDatosCaratula() != null) {
            _hashCode += getDtoDatosCaratula().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObtenerCaratulaPorCodigoEEResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "ObtenerCaratulaPorCodigoEEResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtoDatosCaratula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dtoDatosCaratula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "dtoDatosCaratula"));
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
