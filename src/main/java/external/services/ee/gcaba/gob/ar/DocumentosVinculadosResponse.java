/**
 * DocumentosVinculadosResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.services.ee.gcaba.gob.ar;

public class DocumentosVinculadosResponse  implements java.io.Serializable {
    private java.util.Calendar fechaCreacion;

    private java.util.Calendar fechavinculacionDefinitiva;

    private java.lang.String numeroEspecialDocumento;

    private java.lang.String numeroSadeDocumento;

    private java.lang.String referencia;

    private java.lang.String tipodeDocumento;

    private java.lang.String usuarioAsociacion;

    private java.lang.String usuarioGenerador;

    public DocumentosVinculadosResponse() {
    }

    public DocumentosVinculadosResponse(
           java.util.Calendar fechaCreacion,
           java.util.Calendar fechavinculacionDefinitiva,
           java.lang.String numeroEspecialDocumento,
           java.lang.String numeroSadeDocumento,
           java.lang.String referencia,
           java.lang.String tipodeDocumento,
           java.lang.String usuarioAsociacion,
           java.lang.String usuarioGenerador) {
           this.fechaCreacion = fechaCreacion;
           this.fechavinculacionDefinitiva = fechavinculacionDefinitiva;
           this.numeroEspecialDocumento = numeroEspecialDocumento;
           this.numeroSadeDocumento = numeroSadeDocumento;
           this.referencia = referencia;
           this.tipodeDocumento = tipodeDocumento;
           this.usuarioAsociacion = usuarioAsociacion;
           this.usuarioGenerador = usuarioGenerador;
    }


    /**
     * Gets the fechaCreacion value for this DocumentosVinculadosResponse.
     * 
     * @return fechaCreacion
     */
    public java.util.Calendar getFechaCreacion() {
        return fechaCreacion;
    }


    /**
     * Sets the fechaCreacion value for this DocumentosVinculadosResponse.
     * 
     * @param fechaCreacion
     */
    public void setFechaCreacion(java.util.Calendar fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }


    /**
     * Gets the fechavinculacionDefinitiva value for this DocumentosVinculadosResponse.
     * 
     * @return fechavinculacionDefinitiva
     */
    public java.util.Calendar getFechavinculacionDefinitiva() {
        return fechavinculacionDefinitiva;
    }


    /**
     * Sets the fechavinculacionDefinitiva value for this DocumentosVinculadosResponse.
     * 
     * @param fechavinculacionDefinitiva
     */
    public void setFechavinculacionDefinitiva(java.util.Calendar fechavinculacionDefinitiva) {
        this.fechavinculacionDefinitiva = fechavinculacionDefinitiva;
    }


    /**
     * Gets the numeroEspecialDocumento value for this DocumentosVinculadosResponse.
     * 
     * @return numeroEspecialDocumento
     */
    public java.lang.String getNumeroEspecialDocumento() {
        return numeroEspecialDocumento;
    }


    /**
     * Sets the numeroEspecialDocumento value for this DocumentosVinculadosResponse.
     * 
     * @param numeroEspecialDocumento
     */
    public void setNumeroEspecialDocumento(java.lang.String numeroEspecialDocumento) {
        this.numeroEspecialDocumento = numeroEspecialDocumento;
    }


    /**
     * Gets the numeroSadeDocumento value for this DocumentosVinculadosResponse.
     * 
     * @return numeroSadeDocumento
     */
    public java.lang.String getNumeroSadeDocumento() {
        return numeroSadeDocumento;
    }


    /**
     * Sets the numeroSadeDocumento value for this DocumentosVinculadosResponse.
     * 
     * @param numeroSadeDocumento
     */
    public void setNumeroSadeDocumento(java.lang.String numeroSadeDocumento) {
        this.numeroSadeDocumento = numeroSadeDocumento;
    }


    /**
     * Gets the referencia value for this DocumentosVinculadosResponse.
     * 
     * @return referencia
     */
    public java.lang.String getReferencia() {
        return referencia;
    }


    /**
     * Sets the referencia value for this DocumentosVinculadosResponse.
     * 
     * @param referencia
     */
    public void setReferencia(java.lang.String referencia) {
        this.referencia = referencia;
    }


    /**
     * Gets the tipodeDocumento value for this DocumentosVinculadosResponse.
     * 
     * @return tipodeDocumento
     */
    public java.lang.String getTipodeDocumento() {
        return tipodeDocumento;
    }


    /**
     * Sets the tipodeDocumento value for this DocumentosVinculadosResponse.
     * 
     * @param tipodeDocumento
     */
    public void setTipodeDocumento(java.lang.String tipodeDocumento) {
        this.tipodeDocumento = tipodeDocumento;
    }


    /**
     * Gets the usuarioAsociacion value for this DocumentosVinculadosResponse.
     * 
     * @return usuarioAsociacion
     */
    public java.lang.String getUsuarioAsociacion() {
        return usuarioAsociacion;
    }


    /**
     * Sets the usuarioAsociacion value for this DocumentosVinculadosResponse.
     * 
     * @param usuarioAsociacion
     */
    public void setUsuarioAsociacion(java.lang.String usuarioAsociacion) {
        this.usuarioAsociacion = usuarioAsociacion;
    }


    /**
     * Gets the usuarioGenerador value for this DocumentosVinculadosResponse.
     * 
     * @return usuarioGenerador
     */
    public java.lang.String getUsuarioGenerador() {
        return usuarioGenerador;
    }


    /**
     * Sets the usuarioGenerador value for this DocumentosVinculadosResponse.
     * 
     * @param usuarioGenerador
     */
    public void setUsuarioGenerador(java.lang.String usuarioGenerador) {
        this.usuarioGenerador = usuarioGenerador;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DocumentosVinculadosResponse)) return false;
        DocumentosVinculadosResponse other = (DocumentosVinculadosResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fechaCreacion==null && other.getFechaCreacion()==null) || 
             (this.fechaCreacion!=null &&
              this.fechaCreacion.equals(other.getFechaCreacion()))) &&
            ((this.fechavinculacionDefinitiva==null && other.getFechavinculacionDefinitiva()==null) || 
             (this.fechavinculacionDefinitiva!=null &&
              this.fechavinculacionDefinitiva.equals(other.getFechavinculacionDefinitiva()))) &&
            ((this.numeroEspecialDocumento==null && other.getNumeroEspecialDocumento()==null) || 
             (this.numeroEspecialDocumento!=null &&
              this.numeroEspecialDocumento.equals(other.getNumeroEspecialDocumento()))) &&
            ((this.numeroSadeDocumento==null && other.getNumeroSadeDocumento()==null) || 
             (this.numeroSadeDocumento!=null &&
              this.numeroSadeDocumento.equals(other.getNumeroSadeDocumento()))) &&
            ((this.referencia==null && other.getReferencia()==null) || 
             (this.referencia!=null &&
              this.referencia.equals(other.getReferencia()))) &&
            ((this.tipodeDocumento==null && other.getTipodeDocumento()==null) || 
             (this.tipodeDocumento!=null &&
              this.tipodeDocumento.equals(other.getTipodeDocumento()))) &&
            ((this.usuarioAsociacion==null && other.getUsuarioAsociacion()==null) || 
             (this.usuarioAsociacion!=null &&
              this.usuarioAsociacion.equals(other.getUsuarioAsociacion()))) &&
            ((this.usuarioGenerador==null && other.getUsuarioGenerador()==null) || 
             (this.usuarioGenerador!=null &&
              this.usuarioGenerador.equals(other.getUsuarioGenerador())));
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
        if (getFechaCreacion() != null) {
            _hashCode += getFechaCreacion().hashCode();
        }
        if (getFechavinculacionDefinitiva() != null) {
            _hashCode += getFechavinculacionDefinitiva().hashCode();
        }
        if (getNumeroEspecialDocumento() != null) {
            _hashCode += getNumeroEspecialDocumento().hashCode();
        }
        if (getNumeroSadeDocumento() != null) {
            _hashCode += getNumeroSadeDocumento().hashCode();
        }
        if (getReferencia() != null) {
            _hashCode += getReferencia().hashCode();
        }
        if (getTipodeDocumento() != null) {
            _hashCode += getTipodeDocumento().hashCode();
        }
        if (getUsuarioAsociacion() != null) {
            _hashCode += getUsuarioAsociacion().hashCode();
        }
        if (getUsuarioGenerador() != null) {
            _hashCode += getUsuarioGenerador().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DocumentosVinculadosResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "documentosVinculadosResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaCreacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaCreacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechavinculacionDefinitiva");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechavinculacionDefinitiva"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroEspecialDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroEspecialDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroSadeDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroSadeDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipodeDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipodeDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioAsociacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioAsociacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioGenerador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioGenerador"));
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
