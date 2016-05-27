/**
 * ExpedienteMetadataExternal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.services.ee.gcaba.gob.ar;

public class ExpedienteMetadataExternal  implements java.io.Serializable {
    private java.lang.String nombreMetadata;

    private boolean obligatoriedadMetadata;

    private int ordenMetadata;

    private java.lang.Integer tipoMetadata;

    private java.lang.String valorMetadata;

    public ExpedienteMetadataExternal() {
    }

    public ExpedienteMetadataExternal(
           java.lang.String nombreMetadata,
           boolean obligatoriedadMetadata,
           int ordenMetadata,
           java.lang.Integer tipoMetadata,
           java.lang.String valorMetadata) {
           this.nombreMetadata = nombreMetadata;
           this.obligatoriedadMetadata = obligatoriedadMetadata;
           this.ordenMetadata = ordenMetadata;
           this.tipoMetadata = tipoMetadata;
           this.valorMetadata = valorMetadata;
    }


    /**
     * Gets the nombreMetadata value for this ExpedienteMetadataExternal.
     * 
     * @return nombreMetadata
     */
    public java.lang.String getNombreMetadata() {
        return nombreMetadata;
    }


    /**
     * Sets the nombreMetadata value for this ExpedienteMetadataExternal.
     * 
     * @param nombreMetadata
     */
    public void setNombreMetadata(java.lang.String nombreMetadata) {
        this.nombreMetadata = nombreMetadata;
    }


    /**
     * Gets the obligatoriedadMetadata value for this ExpedienteMetadataExternal.
     * 
     * @return obligatoriedadMetadata
     */
    public boolean isObligatoriedadMetadata() {
        return obligatoriedadMetadata;
    }


    /**
     * Sets the obligatoriedadMetadata value for this ExpedienteMetadataExternal.
     * 
     * @param obligatoriedadMetadata
     */
    public void setObligatoriedadMetadata(boolean obligatoriedadMetadata) {
        this.obligatoriedadMetadata = obligatoriedadMetadata;
    }


    /**
     * Gets the ordenMetadata value for this ExpedienteMetadataExternal.
     * 
     * @return ordenMetadata
     */
    public int getOrdenMetadata() {
        return ordenMetadata;
    }


    /**
     * Sets the ordenMetadata value for this ExpedienteMetadataExternal.
     * 
     * @param ordenMetadata
     */
    public void setOrdenMetadata(int ordenMetadata) {
        this.ordenMetadata = ordenMetadata;
    }


    /**
     * Gets the tipoMetadata value for this ExpedienteMetadataExternal.
     * 
     * @return tipoMetadata
     */
    public java.lang.Integer getTipoMetadata() {
        return tipoMetadata;
    }


    /**
     * Sets the tipoMetadata value for this ExpedienteMetadataExternal.
     * 
     * @param tipoMetadata
     */
    public void setTipoMetadata(java.lang.Integer tipoMetadata) {
        this.tipoMetadata = tipoMetadata;
    }


    /**
     * Gets the valorMetadata value for this ExpedienteMetadataExternal.
     * 
     * @return valorMetadata
     */
    public java.lang.String getValorMetadata() {
        return valorMetadata;
    }


    /**
     * Sets the valorMetadata value for this ExpedienteMetadataExternal.
     * 
     * @param valorMetadata
     */
    public void setValorMetadata(java.lang.String valorMetadata) {
        this.valorMetadata = valorMetadata;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExpedienteMetadataExternal)) return false;
        ExpedienteMetadataExternal other = (ExpedienteMetadataExternal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nombreMetadata==null && other.getNombreMetadata()==null) || 
             (this.nombreMetadata!=null &&
              this.nombreMetadata.equals(other.getNombreMetadata()))) &&
            this.obligatoriedadMetadata == other.isObligatoriedadMetadata() &&
            this.ordenMetadata == other.getOrdenMetadata() &&
            ((this.tipoMetadata==null && other.getTipoMetadata()==null) || 
             (this.tipoMetadata!=null &&
              this.tipoMetadata.equals(other.getTipoMetadata()))) &&
            ((this.valorMetadata==null && other.getValorMetadata()==null) || 
             (this.valorMetadata!=null &&
              this.valorMetadata.equals(other.getValorMetadata())));
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
        if (getNombreMetadata() != null) {
            _hashCode += getNombreMetadata().hashCode();
        }
        _hashCode += (isObligatoriedadMetadata() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getOrdenMetadata();
        if (getTipoMetadata() != null) {
            _hashCode += getTipoMetadata().hashCode();
        }
        if (getValorMetadata() != null) {
            _hashCode += getValorMetadata().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExpedienteMetadataExternal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "expedienteMetadataExternal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("obligatoriedadMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("", "obligatoriedadMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordenMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ordenMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoMetadata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorMetadata");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorMetadata"));
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
