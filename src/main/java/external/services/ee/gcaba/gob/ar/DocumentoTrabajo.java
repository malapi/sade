/**
 * DocumentoTrabajo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.services.ee.gcaba.gob.ar;

public class DocumentoTrabajo  implements java.io.Serializable {
    private byte[] dataArchivo;

    private java.lang.String nombreArchivo;

    private java.lang.String tipoDocumentoTrabajo;

    public DocumentoTrabajo() {
    }

    public DocumentoTrabajo(
           byte[] dataArchivo,
           java.lang.String nombreArchivo,
           java.lang.String tipoDocumentoTrabajo) {
           this.dataArchivo = dataArchivo;
           this.nombreArchivo = nombreArchivo;
           this.tipoDocumentoTrabajo = tipoDocumentoTrabajo;
    }


    /**
     * Gets the dataArchivo value for this DocumentoTrabajo.
     * 
     * @return dataArchivo
     */
    public byte[] getDataArchivo() {
        return dataArchivo;
    }


    /**
     * Sets the dataArchivo value for this DocumentoTrabajo.
     * 
     * @param dataArchivo
     */
    public void setDataArchivo(byte[] dataArchivo) {
        this.dataArchivo = dataArchivo;
    }


    /**
     * Gets the nombreArchivo value for this DocumentoTrabajo.
     * 
     * @return nombreArchivo
     */
    public java.lang.String getNombreArchivo() {
        return nombreArchivo;
    }


    /**
     * Sets the nombreArchivo value for this DocumentoTrabajo.
     * 
     * @param nombreArchivo
     */
    public void setNombreArchivo(java.lang.String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }


    /**
     * Gets the tipoDocumentoTrabajo value for this DocumentoTrabajo.
     * 
     * @return tipoDocumentoTrabajo
     */
    public java.lang.String getTipoDocumentoTrabajo() {
        return tipoDocumentoTrabajo;
    }


    /**
     * Sets the tipoDocumentoTrabajo value for this DocumentoTrabajo.
     * 
     * @param tipoDocumentoTrabajo
     */
    public void setTipoDocumentoTrabajo(java.lang.String tipoDocumentoTrabajo) {
        this.tipoDocumentoTrabajo = tipoDocumentoTrabajo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentoTrabajo)) return false;
        DocumentoTrabajo other = (DocumentoTrabajo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataArchivo==null && other.getDataArchivo()==null) || 
             (this.dataArchivo!=null &&
              java.util.Arrays.equals(this.dataArchivo, other.getDataArchivo()))) &&
            ((this.nombreArchivo==null && other.getNombreArchivo()==null) || 
             (this.nombreArchivo!=null &&
              this.nombreArchivo.equals(other.getNombreArchivo()))) &&
            ((this.tipoDocumentoTrabajo==null && other.getTipoDocumentoTrabajo()==null) || 
             (this.tipoDocumentoTrabajo!=null &&
              this.tipoDocumentoTrabajo.equals(other.getTipoDocumentoTrabajo())));
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
        if (getDataArchivo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataArchivo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataArchivo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNombreArchivo() != null) {
            _hashCode += getNombreArchivo().hashCode();
        }
        if (getTipoDocumentoTrabajo() != null) {
            _hashCode += getTipoDocumentoTrabajo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentoTrabajo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "documentoTrabajo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataArchivo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataArchivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreArchivo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreArchivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDocumentoTrabajo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDocumentoTrabajo"));
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
