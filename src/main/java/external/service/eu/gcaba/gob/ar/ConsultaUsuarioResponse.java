/**
 * ConsultaUsuarioResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.service.eu.gcaba.gob.ar;

public class ConsultaUsuarioResponse  implements java.io.Serializable {
    private java.lang.String apellidoNombre;

    private java.lang.String cargo;

    private java.lang.String cuitCuil;

    private java.lang.String email;

    private java.util.Calendar fechaAlta;

    private java.util.Calendar fechaBaja;

    private java.lang.String jurisdiccion;

    private java.lang.String reparticion;

    private java.lang.String sector;

    private java.lang.String usuario;

    public ConsultaUsuarioResponse() {
    }

    public ConsultaUsuarioResponse(
           java.lang.String apellidoNombre,
           java.lang.String cargo,
           java.lang.String cuitCuil,
           java.lang.String email,
           java.util.Calendar fechaAlta,
           java.util.Calendar fechaBaja,
           java.lang.String jurisdiccion,
           java.lang.String reparticion,
           java.lang.String sector,
           java.lang.String usuario) {
           this.apellidoNombre = apellidoNombre;
           this.cargo = cargo;
           this.cuitCuil = cuitCuil;
           this.email = email;
           this.fechaAlta = fechaAlta;
           this.fechaBaja = fechaBaja;
           this.jurisdiccion = jurisdiccion;
           this.reparticion = reparticion;
           this.sector = sector;
           this.usuario = usuario;
    }


    /**
     * Gets the apellidoNombre value for this ConsultaUsuarioResponse.
     * 
     * @return apellidoNombre
     */
    public java.lang.String getApellidoNombre() {
        return apellidoNombre;
    }


    /**
     * Sets the apellidoNombre value for this ConsultaUsuarioResponse.
     * 
     * @param apellidoNombre
     */
    public void setApellidoNombre(java.lang.String apellidoNombre) {
        this.apellidoNombre = apellidoNombre;
    }


    /**
     * Gets the cargo value for this ConsultaUsuarioResponse.
     * 
     * @return cargo
     */
    public java.lang.String getCargo() {
        return cargo;
    }


    /**
     * Sets the cargo value for this ConsultaUsuarioResponse.
     * 
     * @param cargo
     */
    public void setCargo(java.lang.String cargo) {
        this.cargo = cargo;
    }


    /**
     * Gets the cuitCuil value for this ConsultaUsuarioResponse.
     * 
     * @return cuitCuil
     */
    public java.lang.String getCuitCuil() {
        return cuitCuil;
    }


    /**
     * Sets the cuitCuil value for this ConsultaUsuarioResponse.
     * 
     * @param cuitCuil
     */
    public void setCuitCuil(java.lang.String cuitCuil) {
        this.cuitCuil = cuitCuil;
    }


    /**
     * Gets the email value for this ConsultaUsuarioResponse.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this ConsultaUsuarioResponse.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the fechaAlta value for this ConsultaUsuarioResponse.
     * 
     * @return fechaAlta
     */
    public java.util.Calendar getFechaAlta() {
        return fechaAlta;
    }


    /**
     * Sets the fechaAlta value for this ConsultaUsuarioResponse.
     * 
     * @param fechaAlta
     */
    public void setFechaAlta(java.util.Calendar fechaAlta) {
        this.fechaAlta = fechaAlta;
    }


    /**
     * Gets the fechaBaja value for this ConsultaUsuarioResponse.
     * 
     * @return fechaBaja
     */
    public java.util.Calendar getFechaBaja() {
        return fechaBaja;
    }


    /**
     * Sets the fechaBaja value for this ConsultaUsuarioResponse.
     * 
     * @param fechaBaja
     */
    public void setFechaBaja(java.util.Calendar fechaBaja) {
        this.fechaBaja = fechaBaja;
    }


    /**
     * Gets the jurisdiccion value for this ConsultaUsuarioResponse.
     * 
     * @return jurisdiccion
     */
    public java.lang.String getJurisdiccion() {
        return jurisdiccion;
    }


    /**
     * Sets the jurisdiccion value for this ConsultaUsuarioResponse.
     * 
     * @param jurisdiccion
     */
    public void setJurisdiccion(java.lang.String jurisdiccion) {
        this.jurisdiccion = jurisdiccion;
    }


    /**
     * Gets the reparticion value for this ConsultaUsuarioResponse.
     * 
     * @return reparticion
     */
    public java.lang.String getReparticion() {
        return reparticion;
    }


    /**
     * Sets the reparticion value for this ConsultaUsuarioResponse.
     * 
     * @param reparticion
     */
    public void setReparticion(java.lang.String reparticion) {
        this.reparticion = reparticion;
    }


    /**
     * Gets the sector value for this ConsultaUsuarioResponse.
     * 
     * @return sector
     */
    public java.lang.String getSector() {
        return sector;
    }


    /**
     * Sets the sector value for this ConsultaUsuarioResponse.
     * 
     * @param sector
     */
    public void setSector(java.lang.String sector) {
        this.sector = sector;
    }


    /**
     * Gets the usuario value for this ConsultaUsuarioResponse.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this ConsultaUsuarioResponse.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaUsuarioResponse)) return false;
        ConsultaUsuarioResponse other = (ConsultaUsuarioResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.apellidoNombre==null && other.getApellidoNombre()==null) || 
             (this.apellidoNombre!=null &&
              this.apellidoNombre.equals(other.getApellidoNombre()))) &&
            ((this.cargo==null && other.getCargo()==null) || 
             (this.cargo!=null &&
              this.cargo.equals(other.getCargo()))) &&
            ((this.cuitCuil==null && other.getCuitCuil()==null) || 
             (this.cuitCuil!=null &&
              this.cuitCuil.equals(other.getCuitCuil()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.fechaAlta==null && other.getFechaAlta()==null) || 
             (this.fechaAlta!=null &&
              this.fechaAlta.equals(other.getFechaAlta()))) &&
            ((this.fechaBaja==null && other.getFechaBaja()==null) || 
             (this.fechaBaja!=null &&
              this.fechaBaja.equals(other.getFechaBaja()))) &&
            ((this.jurisdiccion==null && other.getJurisdiccion()==null) || 
             (this.jurisdiccion!=null &&
              this.jurisdiccion.equals(other.getJurisdiccion()))) &&
            ((this.reparticion==null && other.getReparticion()==null) || 
             (this.reparticion!=null &&
              this.reparticion.equals(other.getReparticion()))) &&
            ((this.sector==null && other.getSector()==null) || 
             (this.sector!=null &&
              this.sector.equals(other.getSector()))) &&
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
        if (getApellidoNombre() != null) {
            _hashCode += getApellidoNombre().hashCode();
        }
        if (getCargo() != null) {
            _hashCode += getCargo().hashCode();
        }
        if (getCuitCuil() != null) {
            _hashCode += getCuitCuil().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFechaAlta() != null) {
            _hashCode += getFechaAlta().hashCode();
        }
        if (getFechaBaja() != null) {
            _hashCode += getFechaBaja().hashCode();
        }
        if (getJurisdiccion() != null) {
            _hashCode += getJurisdiccion().hashCode();
        }
        if (getReparticion() != null) {
            _hashCode += getReparticion().hashCode();
        }
        if (getSector() != null) {
            _hashCode += getSector().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaUsuarioResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.eu.service.external/", "consultaUsuarioResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellidoNombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apellidoNombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cargo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cargo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuitCuil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cuitCuil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaAlta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaAlta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaBaja");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaBaja"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jurisdiccion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jurisdiccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reparticion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reparticion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sector");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sector"));
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
