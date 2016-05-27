/**
 * VinculacionDefinitivaDeDocsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.services.ee.gcaba.gob.ar;

public class VinculacionDefinitivaDeDocsRequest  implements java.io.Serializable {
    private java.lang.String codigoEE;

    private java.lang.String sistemaUsuario;

    private java.lang.String usuario;

    public VinculacionDefinitivaDeDocsRequest() {
    }

    public VinculacionDefinitivaDeDocsRequest(
           java.lang.String codigoEE,
           java.lang.String sistemaUsuario,
           java.lang.String usuario) {
           this.codigoEE = codigoEE;
           this.sistemaUsuario = sistemaUsuario;
           this.usuario = usuario;
    }


    /**
     * Gets the codigoEE value for this VinculacionDefinitivaDeDocsRequest.
     * 
     * @return codigoEE
     */
    public java.lang.String getCodigoEE() {
        return codigoEE;
    }


    /**
     * Sets the codigoEE value for this VinculacionDefinitivaDeDocsRequest.
     * 
     * @param codigoEE
     */
    public void setCodigoEE(java.lang.String codigoEE) {
        this.codigoEE = codigoEE;
    }


    /**
     * Gets the sistemaUsuario value for this VinculacionDefinitivaDeDocsRequest.
     * 
     * @return sistemaUsuario
     */
    public java.lang.String getSistemaUsuario() {
        return sistemaUsuario;
    }


    /**
     * Sets the sistemaUsuario value for this VinculacionDefinitivaDeDocsRequest.
     * 
     * @param sistemaUsuario
     */
    public void setSistemaUsuario(java.lang.String sistemaUsuario) {
        this.sistemaUsuario = sistemaUsuario;
    }


    /**
     * Gets the usuario value for this VinculacionDefinitivaDeDocsRequest.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this VinculacionDefinitivaDeDocsRequest.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof VinculacionDefinitivaDeDocsRequest)) return false;
        VinculacionDefinitivaDeDocsRequest other = (VinculacionDefinitivaDeDocsRequest) obj;
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
              this.codigoEE.equals(other.getCodigoEE()))) &&
            ((this.sistemaUsuario==null && other.getSistemaUsuario()==null) || 
             (this.sistemaUsuario!=null &&
              this.sistemaUsuario.equals(other.getSistemaUsuario()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario())));
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
        if (getSistemaUsuario() != null) {
            _hashCode += getSistemaUsuario().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(VinculacionDefinitivaDeDocsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "vinculacionDefinitivaDeDocsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoEE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sistemaUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sistemaUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuario"));
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
