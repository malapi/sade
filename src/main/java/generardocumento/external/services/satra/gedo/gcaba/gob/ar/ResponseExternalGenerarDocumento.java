/**
 * ResponseExternalGenerarDocumento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package generardocumento.external.services.satra.gedo.gcaba.gob.ar;

public class ResponseExternalGenerarDocumento  implements java.io.Serializable {
    private java.lang.String licencia;

    private java.lang.String numero;

    private java.lang.String numeroEspecial;

    private java.lang.String urlArchivoGenerado;

    public ResponseExternalGenerarDocumento() {
    }

    public ResponseExternalGenerarDocumento(
           java.lang.String licencia,
           java.lang.String numero,
           java.lang.String numeroEspecial,
           java.lang.String urlArchivoGenerado) {
           this.licencia = licencia;
           this.numero = numero;
           this.numeroEspecial = numeroEspecial;
           this.urlArchivoGenerado = urlArchivoGenerado;
    }


    /**
     * Gets the licencia value for this ResponseExternalGenerarDocumento.
     * 
     * @return licencia
     */
    public java.lang.String getLicencia() {
        return licencia;
    }


    /**
     * Sets the licencia value for this ResponseExternalGenerarDocumento.
     * 
     * @param licencia
     */
    public void setLicencia(java.lang.String licencia) {
        this.licencia = licencia;
    }


    /**
     * Gets the numero value for this ResponseExternalGenerarDocumento.
     * 
     * @return numero
     */
    public java.lang.String getNumero() {
        return numero;
    }


    /**
     * Sets the numero value for this ResponseExternalGenerarDocumento.
     * 
     * @param numero
     */
    public void setNumero(java.lang.String numero) {
        this.numero = numero;
    }


    /**
     * Gets the numeroEspecial value for this ResponseExternalGenerarDocumento.
     * 
     * @return numeroEspecial
     */
    public java.lang.String getNumeroEspecial() {
        return numeroEspecial;
    }


    /**
     * Sets the numeroEspecial value for this ResponseExternalGenerarDocumento.
     * 
     * @param numeroEspecial
     */
    public void setNumeroEspecial(java.lang.String numeroEspecial) {
        this.numeroEspecial = numeroEspecial;
    }


    /**
     * Gets the urlArchivoGenerado value for this ResponseExternalGenerarDocumento.
     * 
     * @return urlArchivoGenerado
     */
    public java.lang.String getUrlArchivoGenerado() {
        return urlArchivoGenerado;
    }


    /**
     * Sets the urlArchivoGenerado value for this ResponseExternalGenerarDocumento.
     * 
     * @param urlArchivoGenerado
     */
    public void setUrlArchivoGenerado(java.lang.String urlArchivoGenerado) {
        this.urlArchivoGenerado = urlArchivoGenerado;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseExternalGenerarDocumento)) return false;
        ResponseExternalGenerarDocumento other = (ResponseExternalGenerarDocumento) obj;
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
            ((this.numero==null && other.getNumero()==null) || 
             (this.numero!=null &&
              this.numero.equals(other.getNumero()))) &&
            ((this.numeroEspecial==null && other.getNumeroEspecial()==null) || 
             (this.numeroEspecial!=null &&
              this.numeroEspecial.equals(other.getNumeroEspecial()))) &&
            ((this.urlArchivoGenerado==null && other.getUrlArchivoGenerado()==null) || 
             (this.urlArchivoGenerado!=null &&
              this.urlArchivoGenerado.equals(other.getUrlArchivoGenerado())));
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
        if (getNumero() != null) {
            _hashCode += getNumero().hashCode();
        }
        if (getNumeroEspecial() != null) {
            _hashCode += getNumeroEspecial().hashCode();
        }
        if (getUrlArchivoGenerado() != null) {
            _hashCode += getUrlArchivoGenerado().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseExternalGenerarDocumento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "responseExternalGenerarDocumento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "licencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numero");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroEspecial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroEspecial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlArchivoGenerado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urlArchivoGenerado"));
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
