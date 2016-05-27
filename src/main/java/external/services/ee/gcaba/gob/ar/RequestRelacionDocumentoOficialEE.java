/**
 * RequestRelacionDocumentoOficialEE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.services.ee.gcaba.gob.ar;

public class RequestRelacionDocumentoOficialEE  implements java.io.Serializable {
    private java.lang.String[] documentosOficiales;

    private java.lang.String numeroExpedienteElectronico;

    private java.lang.String sistemaUsuario;

    private java.lang.String usuario;

    public RequestRelacionDocumentoOficialEE() {
    }

    public RequestRelacionDocumentoOficialEE(
           java.lang.String[] documentosOficiales,
           java.lang.String numeroExpedienteElectronico,
           java.lang.String sistemaUsuario,
           java.lang.String usuario) {
           this.documentosOficiales = documentosOficiales;
           this.numeroExpedienteElectronico = numeroExpedienteElectronico;
           this.sistemaUsuario = sistemaUsuario;
           this.usuario = usuario;
    }


    /**
     * Gets the documentosOficiales value for this RequestRelacionDocumentoOficialEE.
     * 
     * @return documentosOficiales
     */
    public java.lang.String[] getDocumentosOficiales() {
        return documentosOficiales;
    }


    /**
     * Sets the documentosOficiales value for this RequestRelacionDocumentoOficialEE.
     * 
     * @param documentosOficiales
     */
    public void setDocumentosOficiales(java.lang.String[] documentosOficiales) {
        this.documentosOficiales = documentosOficiales;
    }


    /**
     * Gets the numeroExpedienteElectronico value for this RequestRelacionDocumentoOficialEE.
     * 
     * @return numeroExpedienteElectronico
     */
    public java.lang.String getNumeroExpedienteElectronico() {
        return numeroExpedienteElectronico;
    }


    /**
     * Sets the numeroExpedienteElectronico value for this RequestRelacionDocumentoOficialEE.
     * 
     * @param numeroExpedienteElectronico
     */
    public void setNumeroExpedienteElectronico(java.lang.String numeroExpedienteElectronico) {
        this.numeroExpedienteElectronico = numeroExpedienteElectronico;
    }


    /**
     * Gets the sistemaUsuario value for this RequestRelacionDocumentoOficialEE.
     * 
     * @return sistemaUsuario
     */
    public java.lang.String getSistemaUsuario() {
        return sistemaUsuario;
    }


    /**
     * Sets the sistemaUsuario value for this RequestRelacionDocumentoOficialEE.
     * 
     * @param sistemaUsuario
     */
    public void setSistemaUsuario(java.lang.String sistemaUsuario) {
        this.sistemaUsuario = sistemaUsuario;
    }


    /**
     * Gets the usuario value for this RequestRelacionDocumentoOficialEE.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this RequestRelacionDocumentoOficialEE.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestRelacionDocumentoOficialEE)) return false;
        RequestRelacionDocumentoOficialEE other = (RequestRelacionDocumentoOficialEE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentosOficiales==null && other.getDocumentosOficiales()==null) || 
             (this.documentosOficiales!=null &&
              java.util.Arrays.equals(this.documentosOficiales, other.getDocumentosOficiales()))) &&
            ((this.numeroExpedienteElectronico==null && other.getNumeroExpedienteElectronico()==null) || 
             (this.numeroExpedienteElectronico!=null &&
              this.numeroExpedienteElectronico.equals(other.getNumeroExpedienteElectronico()))) &&
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
        if (getDocumentosOficiales() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentosOficiales());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentosOficiales(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumeroExpedienteElectronico() != null) {
            _hashCode += getNumeroExpedienteElectronico().hashCode();
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
        new org.apache.axis.description.TypeDesc(RequestRelacionDocumentoOficialEE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "requestRelacionDocumentoOficialEE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentosOficiales");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentosOficiales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "documentosOficiales"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroExpedienteElectronico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroExpedienteElectronico"));
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
