/**
 * ExpedienteElectronicoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.services.ee.gcaba.gob.ar;

public class ExpedienteElectronicoResponse  implements java.io.Serializable {
    private java.lang.String codigoCaratula;

    private java.lang.String codigoTrata;

    private java.lang.String descripcion;

    private java.lang.String descripcionTrataElectronica;

    private java.lang.String estado;

    private java.util.Calendar fechaCreacion;

    private java.util.Calendar fechaModificacion;

    private java.lang.String motivoSolicitud;

    private java.lang.String motivoSolicitudExterna;

    private external.services.ee.gcaba.gob.ar.SolicitanteResponse solicitante;

    private java.lang.String usuarioCreador;

    public ExpedienteElectronicoResponse() {
    }

    public ExpedienteElectronicoResponse(
           java.lang.String codigoCaratula,
           java.lang.String codigoTrata,
           java.lang.String descripcion,
           java.lang.String descripcionTrataElectronica,
           java.lang.String estado,
           java.util.Calendar fechaCreacion,
           java.util.Calendar fechaModificacion,
           java.lang.String motivoSolicitud,
           java.lang.String motivoSolicitudExterna,
           external.services.ee.gcaba.gob.ar.SolicitanteResponse solicitante,
           java.lang.String usuarioCreador) {
           this.codigoCaratula = codigoCaratula;
           this.codigoTrata = codigoTrata;
           this.descripcion = descripcion;
           this.descripcionTrataElectronica = descripcionTrataElectronica;
           this.estado = estado;
           this.fechaCreacion = fechaCreacion;
           this.fechaModificacion = fechaModificacion;
           this.motivoSolicitud = motivoSolicitud;
           this.motivoSolicitudExterna = motivoSolicitudExterna;
           this.solicitante = solicitante;
           this.usuarioCreador = usuarioCreador;
    }


    /**
     * Gets the codigoCaratula value for this ExpedienteElectronicoResponse.
     * 
     * @return codigoCaratula
     */
    public java.lang.String getCodigoCaratula() {
        return codigoCaratula;
    }


    /**
     * Sets the codigoCaratula value for this ExpedienteElectronicoResponse.
     * 
     * @param codigoCaratula
     */
    public void setCodigoCaratula(java.lang.String codigoCaratula) {
        this.codigoCaratula = codigoCaratula;
    }


    /**
     * Gets the codigoTrata value for this ExpedienteElectronicoResponse.
     * 
     * @return codigoTrata
     */
    public java.lang.String getCodigoTrata() {
        return codigoTrata;
    }


    /**
     * Sets the codigoTrata value for this ExpedienteElectronicoResponse.
     * 
     * @param codigoTrata
     */
    public void setCodigoTrata(java.lang.String codigoTrata) {
        this.codigoTrata = codigoTrata;
    }


    /**
     * Gets the descripcion value for this ExpedienteElectronicoResponse.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this ExpedienteElectronicoResponse.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the descripcionTrataElectronica value for this ExpedienteElectronicoResponse.
     * 
     * @return descripcionTrataElectronica
     */
    public java.lang.String getDescripcionTrataElectronica() {
        return descripcionTrataElectronica;
    }


    /**
     * Sets the descripcionTrataElectronica value for this ExpedienteElectronicoResponse.
     * 
     * @param descripcionTrataElectronica
     */
    public void setDescripcionTrataElectronica(java.lang.String descripcionTrataElectronica) {
        this.descripcionTrataElectronica = descripcionTrataElectronica;
    }


    /**
     * Gets the estado value for this ExpedienteElectronicoResponse.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this ExpedienteElectronicoResponse.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the fechaCreacion value for this ExpedienteElectronicoResponse.
     * 
     * @return fechaCreacion
     */
    public java.util.Calendar getFechaCreacion() {
        return fechaCreacion;
    }


    /**
     * Sets the fechaCreacion value for this ExpedienteElectronicoResponse.
     * 
     * @param fechaCreacion
     */
    public void setFechaCreacion(java.util.Calendar fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }


    /**
     * Gets the fechaModificacion value for this ExpedienteElectronicoResponse.
     * 
     * @return fechaModificacion
     */
    public java.util.Calendar getFechaModificacion() {
        return fechaModificacion;
    }


    /**
     * Sets the fechaModificacion value for this ExpedienteElectronicoResponse.
     * 
     * @param fechaModificacion
     */
    public void setFechaModificacion(java.util.Calendar fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }


    /**
     * Gets the motivoSolicitud value for this ExpedienteElectronicoResponse.
     * 
     * @return motivoSolicitud
     */
    public java.lang.String getMotivoSolicitud() {
        return motivoSolicitud;
    }


    /**
     * Sets the motivoSolicitud value for this ExpedienteElectronicoResponse.
     * 
     * @param motivoSolicitud
     */
    public void setMotivoSolicitud(java.lang.String motivoSolicitud) {
        this.motivoSolicitud = motivoSolicitud;
    }


    /**
     * Gets the motivoSolicitudExterna value for this ExpedienteElectronicoResponse.
     * 
     * @return motivoSolicitudExterna
     */
    public java.lang.String getMotivoSolicitudExterna() {
        return motivoSolicitudExterna;
    }


    /**
     * Sets the motivoSolicitudExterna value for this ExpedienteElectronicoResponse.
     * 
     * @param motivoSolicitudExterna
     */
    public void setMotivoSolicitudExterna(java.lang.String motivoSolicitudExterna) {
        this.motivoSolicitudExterna = motivoSolicitudExterna;
    }


    /**
     * Gets the solicitante value for this ExpedienteElectronicoResponse.
     * 
     * @return solicitante
     */
    public external.services.ee.gcaba.gob.ar.SolicitanteResponse getSolicitante() {
        return solicitante;
    }


    /**
     * Sets the solicitante value for this ExpedienteElectronicoResponse.
     * 
     * @param solicitante
     */
    public void setSolicitante(external.services.ee.gcaba.gob.ar.SolicitanteResponse solicitante) {
        this.solicitante = solicitante;
    }


    /**
     * Gets the usuarioCreador value for this ExpedienteElectronicoResponse.
     * 
     * @return usuarioCreador
     */
    public java.lang.String getUsuarioCreador() {
        return usuarioCreador;
    }


    /**
     * Sets the usuarioCreador value for this ExpedienteElectronicoResponse.
     * 
     * @param usuarioCreador
     */
    public void setUsuarioCreador(java.lang.String usuarioCreador) {
        this.usuarioCreador = usuarioCreador;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExpedienteElectronicoResponse)) return false;
        ExpedienteElectronicoResponse other = (ExpedienteElectronicoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoCaratula==null && other.getCodigoCaratula()==null) || 
             (this.codigoCaratula!=null &&
              this.codigoCaratula.equals(other.getCodigoCaratula()))) &&
            ((this.codigoTrata==null && other.getCodigoTrata()==null) || 
             (this.codigoTrata!=null &&
              this.codigoTrata.equals(other.getCodigoTrata()))) &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.descripcionTrataElectronica==null && other.getDescripcionTrataElectronica()==null) || 
             (this.descripcionTrataElectronica!=null &&
              this.descripcionTrataElectronica.equals(other.getDescripcionTrataElectronica()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.fechaCreacion==null && other.getFechaCreacion()==null) || 
             (this.fechaCreacion!=null &&
              this.fechaCreacion.equals(other.getFechaCreacion()))) &&
            ((this.fechaModificacion==null && other.getFechaModificacion()==null) || 
             (this.fechaModificacion!=null &&
              this.fechaModificacion.equals(other.getFechaModificacion()))) &&
            ((this.motivoSolicitud==null && other.getMotivoSolicitud()==null) || 
             (this.motivoSolicitud!=null &&
              this.motivoSolicitud.equals(other.getMotivoSolicitud()))) &&
            ((this.motivoSolicitudExterna==null && other.getMotivoSolicitudExterna()==null) || 
             (this.motivoSolicitudExterna!=null &&
              this.motivoSolicitudExterna.equals(other.getMotivoSolicitudExterna()))) &&
            ((this.solicitante==null && other.getSolicitante()==null) || 
             (this.solicitante!=null &&
              this.solicitante.equals(other.getSolicitante()))) &&
            ((this.usuarioCreador==null && other.getUsuarioCreador()==null) || 
             (this.usuarioCreador!=null &&
              this.usuarioCreador.equals(other.getUsuarioCreador())));
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
        if (getCodigoCaratula() != null) {
            _hashCode += getCodigoCaratula().hashCode();
        }
        if (getCodigoTrata() != null) {
            _hashCode += getCodigoTrata().hashCode();
        }
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getDescripcionTrataElectronica() != null) {
            _hashCode += getDescripcionTrataElectronica().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getFechaCreacion() != null) {
            _hashCode += getFechaCreacion().hashCode();
        }
        if (getFechaModificacion() != null) {
            _hashCode += getFechaModificacion().hashCode();
        }
        if (getMotivoSolicitud() != null) {
            _hashCode += getMotivoSolicitud().hashCode();
        }
        if (getMotivoSolicitudExterna() != null) {
            _hashCode += getMotivoSolicitudExterna().hashCode();
        }
        if (getSolicitante() != null) {
            _hashCode += getSolicitante().hashCode();
        }
        if (getUsuarioCreador() != null) {
            _hashCode += getUsuarioCreador().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExpedienteElectronicoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "expedienteElectronicoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCaratula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoCaratula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoTrata");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoTrata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionTrataElectronica");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcionTrataElectronica"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaCreacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaCreacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaModificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaModificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivoSolicitud");
        elemField.setXmlName(new javax.xml.namespace.QName("", "motivoSolicitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivoSolicitudExterna");
        elemField.setXmlName(new javax.xml.namespace.QName("", "motivoSolicitudExterna"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solicitante");
        elemField.setXmlName(new javax.xml.namespace.QName("", "solicitante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "solicitanteResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioCreador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioCreador"));
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
