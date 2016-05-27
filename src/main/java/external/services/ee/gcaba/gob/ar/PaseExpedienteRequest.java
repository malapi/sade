/**
 * PaseExpedienteRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.services.ee.gcaba.gob.ar;

public class PaseExpedienteRequest  implements java.io.Serializable {
    private java.lang.String codigoEE;

    private boolean esMesaDestino;

    private boolean esReparticionDestino;

    private boolean esSectorDestino;

    private boolean esUsuarioDestino;

    private java.lang.String estadoSeleccionado;

    private java.lang.String motivoPase;

    private java.lang.String reparticionDestino;

    private java.lang.String sectorDestino;

    private java.lang.String sistemaOrigen;

    private java.lang.String usuarioDestino;

    private java.lang.String usuarioOrigen;

    public PaseExpedienteRequest() {
    }

    public PaseExpedienteRequest(
           java.lang.String codigoEE,
           boolean esMesaDestino,
           boolean esReparticionDestino,
           boolean esSectorDestino,
           boolean esUsuarioDestino,
           java.lang.String estadoSeleccionado,
           java.lang.String motivoPase,
           java.lang.String reparticionDestino,
           java.lang.String sectorDestino,
           java.lang.String sistemaOrigen,
           java.lang.String usuarioDestino,
           java.lang.String usuarioOrigen) {
           this.codigoEE = codigoEE;
           this.esMesaDestino = esMesaDestino;
           this.esReparticionDestino = esReparticionDestino;
           this.esSectorDestino = esSectorDestino;
           this.esUsuarioDestino = esUsuarioDestino;
           this.estadoSeleccionado = estadoSeleccionado;
           this.motivoPase = motivoPase;
           this.reparticionDestino = reparticionDestino;
           this.sectorDestino = sectorDestino;
           this.sistemaOrigen = sistemaOrigen;
           this.usuarioDestino = usuarioDestino;
           this.usuarioOrigen = usuarioOrigen;
    }


    /**
     * Gets the codigoEE value for this PaseExpedienteRequest.
     * 
     * @return codigoEE
     */
    public java.lang.String getCodigoEE() {
        return codigoEE;
    }


    /**
     * Sets the codigoEE value for this PaseExpedienteRequest.
     * 
     * @param codigoEE
     */
    public void setCodigoEE(java.lang.String codigoEE) {
        this.codigoEE = codigoEE;
    }


    /**
     * Gets the esMesaDestino value for this PaseExpedienteRequest.
     * 
     * @return esMesaDestino
     */
    public boolean isEsMesaDestino() {
        return esMesaDestino;
    }


    /**
     * Sets the esMesaDestino value for this PaseExpedienteRequest.
     * 
     * @param esMesaDestino
     */
    public void setEsMesaDestino(boolean esMesaDestino) {
        this.esMesaDestino = esMesaDestino;
    }


    /**
     * Gets the esReparticionDestino value for this PaseExpedienteRequest.
     * 
     * @return esReparticionDestino
     */
    public boolean isEsReparticionDestino() {
        return esReparticionDestino;
    }


    /**
     * Sets the esReparticionDestino value for this PaseExpedienteRequest.
     * 
     * @param esReparticionDestino
     */
    public void setEsReparticionDestino(boolean esReparticionDestino) {
        this.esReparticionDestino = esReparticionDestino;
    }


    /**
     * Gets the esSectorDestino value for this PaseExpedienteRequest.
     * 
     * @return esSectorDestino
     */
    public boolean isEsSectorDestino() {
        return esSectorDestino;
    }


    /**
     * Sets the esSectorDestino value for this PaseExpedienteRequest.
     * 
     * @param esSectorDestino
     */
    public void setEsSectorDestino(boolean esSectorDestino) {
        this.esSectorDestino = esSectorDestino;
    }


    /**
     * Gets the esUsuarioDestino value for this PaseExpedienteRequest.
     * 
     * @return esUsuarioDestino
     */
    public boolean isEsUsuarioDestino() {
        return esUsuarioDestino;
    }


    /**
     * Sets the esUsuarioDestino value for this PaseExpedienteRequest.
     * 
     * @param esUsuarioDestino
     */
    public void setEsUsuarioDestino(boolean esUsuarioDestino) {
        this.esUsuarioDestino = esUsuarioDestino;
    }


    /**
     * Gets the estadoSeleccionado value for this PaseExpedienteRequest.
     * 
     * @return estadoSeleccionado
     */
    public java.lang.String getEstadoSeleccionado() {
        return estadoSeleccionado;
    }


    /**
     * Sets the estadoSeleccionado value for this PaseExpedienteRequest.
     * 
     * @param estadoSeleccionado
     */
    public void setEstadoSeleccionado(java.lang.String estadoSeleccionado) {
        this.estadoSeleccionado = estadoSeleccionado;
    }


    /**
     * Gets the motivoPase value for this PaseExpedienteRequest.
     * 
     * @return motivoPase
     */
    public java.lang.String getMotivoPase() {
        return motivoPase;
    }


    /**
     * Sets the motivoPase value for this PaseExpedienteRequest.
     * 
     * @param motivoPase
     */
    public void setMotivoPase(java.lang.String motivoPase) {
        this.motivoPase = motivoPase;
    }


    /**
     * Gets the reparticionDestino value for this PaseExpedienteRequest.
     * 
     * @return reparticionDestino
     */
    public java.lang.String getReparticionDestino() {
        return reparticionDestino;
    }


    /**
     * Sets the reparticionDestino value for this PaseExpedienteRequest.
     * 
     * @param reparticionDestino
     */
    public void setReparticionDestino(java.lang.String reparticionDestino) {
        this.reparticionDestino = reparticionDestino;
    }


    /**
     * Gets the sectorDestino value for this PaseExpedienteRequest.
     * 
     * @return sectorDestino
     */
    public java.lang.String getSectorDestino() {
        return sectorDestino;
    }


    /**
     * Sets the sectorDestino value for this PaseExpedienteRequest.
     * 
     * @param sectorDestino
     */
    public void setSectorDestino(java.lang.String sectorDestino) {
        this.sectorDestino = sectorDestino;
    }


    /**
     * Gets the sistemaOrigen value for this PaseExpedienteRequest.
     * 
     * @return sistemaOrigen
     */
    public java.lang.String getSistemaOrigen() {
        return sistemaOrigen;
    }


    /**
     * Sets the sistemaOrigen value for this PaseExpedienteRequest.
     * 
     * @param sistemaOrigen
     */
    public void setSistemaOrigen(java.lang.String sistemaOrigen) {
        this.sistemaOrigen = sistemaOrigen;
    }


    /**
     * Gets the usuarioDestino value for this PaseExpedienteRequest.
     * 
     * @return usuarioDestino
     */
    public java.lang.String getUsuarioDestino() {
        return usuarioDestino;
    }


    /**
     * Sets the usuarioDestino value for this PaseExpedienteRequest.
     * 
     * @param usuarioDestino
     */
    public void setUsuarioDestino(java.lang.String usuarioDestino) {
        this.usuarioDestino = usuarioDestino;
    }


    /**
     * Gets the usuarioOrigen value for this PaseExpedienteRequest.
     * 
     * @return usuarioOrigen
     */
    public java.lang.String getUsuarioOrigen() {
        return usuarioOrigen;
    }


    /**
     * Sets the usuarioOrigen value for this PaseExpedienteRequest.
     * 
     * @param usuarioOrigen
     */
    public void setUsuarioOrigen(java.lang.String usuarioOrigen) {
        this.usuarioOrigen = usuarioOrigen;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaseExpedienteRequest)) return false;
        PaseExpedienteRequest other = (PaseExpedienteRequest) obj;
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
            this.esMesaDestino == other.isEsMesaDestino() &&
            this.esReparticionDestino == other.isEsReparticionDestino() &&
            this.esSectorDestino == other.isEsSectorDestino() &&
            this.esUsuarioDestino == other.isEsUsuarioDestino() &&
            ((this.estadoSeleccionado==null && other.getEstadoSeleccionado()==null) || 
             (this.estadoSeleccionado!=null &&
              this.estadoSeleccionado.equals(other.getEstadoSeleccionado()))) &&
            ((this.motivoPase==null && other.getMotivoPase()==null) || 
             (this.motivoPase!=null &&
              this.motivoPase.equals(other.getMotivoPase()))) &&
            ((this.reparticionDestino==null && other.getReparticionDestino()==null) || 
             (this.reparticionDestino!=null &&
              this.reparticionDestino.equals(other.getReparticionDestino()))) &&
            ((this.sectorDestino==null && other.getSectorDestino()==null) || 
             (this.sectorDestino!=null &&
              this.sectorDestino.equals(other.getSectorDestino()))) &&
            ((this.sistemaOrigen==null && other.getSistemaOrigen()==null) || 
             (this.sistemaOrigen!=null &&
              this.sistemaOrigen.equals(other.getSistemaOrigen()))) &&
            ((this.usuarioDestino==null && other.getUsuarioDestino()==null) || 
             (this.usuarioDestino!=null &&
              this.usuarioDestino.equals(other.getUsuarioDestino()))) &&
            ((this.usuarioOrigen==null && other.getUsuarioOrigen()==null) || 
             (this.usuarioOrigen!=null &&
              this.usuarioOrigen.equals(other.getUsuarioOrigen())));
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
        _hashCode += (isEsMesaDestino() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEsReparticionDestino() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEsSectorDestino() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEsUsuarioDestino() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getEstadoSeleccionado() != null) {
            _hashCode += getEstadoSeleccionado().hashCode();
        }
        if (getMotivoPase() != null) {
            _hashCode += getMotivoPase().hashCode();
        }
        if (getReparticionDestino() != null) {
            _hashCode += getReparticionDestino().hashCode();
        }
        if (getSectorDestino() != null) {
            _hashCode += getSectorDestino().hashCode();
        }
        if (getSistemaOrigen() != null) {
            _hashCode += getSistemaOrigen().hashCode();
        }
        if (getUsuarioDestino() != null) {
            _hashCode += getUsuarioDestino().hashCode();
        }
        if (getUsuarioOrigen() != null) {
            _hashCode += getUsuarioOrigen().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaseExpedienteRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "paseExpedienteRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoEE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esMesaDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esMesaDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esReparticionDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esReparticionDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esSectorDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esSectorDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esUsuarioDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esUsuarioDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoSeleccionado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoSeleccionado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivoPase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "motivoPase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reparticionDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reparticionDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sectorDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sectorDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sistemaOrigen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sistemaOrigen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioDestino");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioDestino"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioOrigen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioOrigen"));
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
