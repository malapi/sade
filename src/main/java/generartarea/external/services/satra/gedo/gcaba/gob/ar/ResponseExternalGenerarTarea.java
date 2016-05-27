/**
 * ResponseExternalGenerarTarea.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package generartarea.external.services.satra.gedo.gcaba.gob.ar;

public class ResponseExternalGenerarTarea  implements java.io.Serializable {
    private java.lang.String licencia;

    private java.lang.String processId;

    private java.lang.String usuarioApoderado;

    public ResponseExternalGenerarTarea() {
    }

    public ResponseExternalGenerarTarea(
           java.lang.String licencia,
           java.lang.String processId,
           java.lang.String usuarioApoderado) {
           this.licencia = licencia;
           this.processId = processId;
           this.usuarioApoderado = usuarioApoderado;
    }


    /**
     * Gets the licencia value for this ResponseExternalGenerarTarea.
     * 
     * @return licencia
     */
    public java.lang.String getLicencia() {
        return licencia;
    }


    /**
     * Sets the licencia value for this ResponseExternalGenerarTarea.
     * 
     * @param licencia
     */
    public void setLicencia(java.lang.String licencia) {
        this.licencia = licencia;
    }


    /**
     * Gets the processId value for this ResponseExternalGenerarTarea.
     * 
     * @return processId
     */
    public java.lang.String getProcessId() {
        return processId;
    }


    /**
     * Sets the processId value for this ResponseExternalGenerarTarea.
     * 
     * @param processId
     */
    public void setProcessId(java.lang.String processId) {
        this.processId = processId;
    }


    /**
     * Gets the usuarioApoderado value for this ResponseExternalGenerarTarea.
     * 
     * @return usuarioApoderado
     */
    public java.lang.String getUsuarioApoderado() {
        return usuarioApoderado;
    }


    /**
     * Sets the usuarioApoderado value for this ResponseExternalGenerarTarea.
     * 
     * @param usuarioApoderado
     */
    public void setUsuarioApoderado(java.lang.String usuarioApoderado) {
        this.usuarioApoderado = usuarioApoderado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseExternalGenerarTarea)) return false;
        ResponseExternalGenerarTarea other = (ResponseExternalGenerarTarea) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.licencia==null && other.getLicencia()==null) || 
             (this.licencia!=null &&
              this.licencia.equals(other.getLicencia()))) &&
            ((this.processId==null && other.getProcessId()==null) || 
             (this.processId!=null &&
              this.processId.equals(other.getProcessId()))) &&
            ((this.usuarioApoderado==null && other.getUsuarioApoderado()==null) || 
             (this.usuarioApoderado!=null &&
              this.usuarioApoderado.equals(other.getUsuarioApoderado())));
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
        if (getLicencia() != null) {
            _hashCode += getLicencia().hashCode();
        }
        if (getProcessId() != null) {
            _hashCode += getProcessId().hashCode();
        }
        if (getUsuarioApoderado() != null) {
            _hashCode += getUsuarioApoderado().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseExternalGenerarTarea.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "responseExternalGenerarTarea"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "licencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "processId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioApoderado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioApoderado"));
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
