/**
 * ConsultaExpedienteResponseDetallado.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.services.ee.gcaba.gob.ar;

public class ConsultaExpedienteResponseDetallado  extends external.services.ee.gcaba.gob.ar.ConsultaExpedienteResponse  implements java.io.Serializable {
    private external.services.ee.gcaba.gob.ar.ExpedienteMetadataExternal[] datoVariable;

    private java.lang.String descripcionTramite;

    private java.util.Calendar f_caratulacion;

    private external.services.ee.gcaba.gob.ar.ExpedienteAsociadoDTO[] listaExpedientesAsociados;

    private external.services.ee.gcaba.gob.ar.ExpedienteAsociadoDTO[] listaExpedientesAsociadosFusion;

    private external.services.ee.gcaba.gob.ar.ExpedienteAsociadoDTO[] listaExpedientesAsociadosTC;

    private java.lang.String reparticionDestino;

    private java.lang.String sectorDestino;

    private java.lang.String usuarioCaratulador;

    private java.lang.String usuarioDestino;

    public ConsultaExpedienteResponseDetallado() {
    }

    public ConsultaExpedienteResponseDetallado(
           java.lang.String codigoDocCaratula,
           java.lang.String codigoEE,
           java.lang.String codigotrata,
           java.lang.String descripcionTrata,
           java.lang.String estado,
           java.lang.String[] listArchivosAdjuntos,
           java.lang.String[] listDocumentosOficiales,
           java.lang.String[] listExpedientesAsociados,
           external.services.ee.gcaba.gob.ar.DatosTareaBean[] listaDatosTarea,
           java.lang.String motivo,
           java.lang.String sistemaOrigen,
           external.services.ee.gcaba.gob.ar.ExpedienteMetadataExternal[] datoVariable,
           java.lang.String descripcionTramite,
           java.util.Calendar f_caratulacion,
           external.services.ee.gcaba.gob.ar.ExpedienteAsociadoDTO[] listaExpedientesAsociados,
           external.services.ee.gcaba.gob.ar.ExpedienteAsociadoDTO[] listaExpedientesAsociadosFusion,
           external.services.ee.gcaba.gob.ar.ExpedienteAsociadoDTO[] listaExpedientesAsociadosTC,
           java.lang.String reparticionDestino,
           java.lang.String sectorDestino,
           java.lang.String usuarioCaratulador,
           java.lang.String usuarioDestino) {
        super(
            codigoDocCaratula,
            codigoEE,
            codigotrata,
            descripcionTrata,
            estado,
            listArchivosAdjuntos,
            listDocumentosOficiales,
            listExpedientesAsociados,
            listaDatosTarea,
            motivo,
            sistemaOrigen);
        this.datoVariable = datoVariable;
        this.descripcionTramite = descripcionTramite;
        this.f_caratulacion = f_caratulacion;
        this.listaExpedientesAsociados = listaExpedientesAsociados;
        this.listaExpedientesAsociadosFusion = listaExpedientesAsociadosFusion;
        this.listaExpedientesAsociadosTC = listaExpedientesAsociadosTC;
        this.reparticionDestino = reparticionDestino;
        this.sectorDestino = sectorDestino;
        this.usuarioCaratulador = usuarioCaratulador;
        this.usuarioDestino = usuarioDestino;
    }


    /**
     * Gets the datoVariable value for this ConsultaExpedienteResponseDetallado.
     * 
     * @return datoVariable
     */
    public external.services.ee.gcaba.gob.ar.ExpedienteMetadataExternal[] getDatoVariable() {
        return datoVariable;
    }


    /**
     * Sets the datoVariable value for this ConsultaExpedienteResponseDetallado.
     * 
     * @param datoVariable
     */
    public void setDatoVariable(external.services.ee.gcaba.gob.ar.ExpedienteMetadataExternal[] datoVariable) {
        this.datoVariable = datoVariable;
    }

    public external.services.ee.gcaba.gob.ar.ExpedienteMetadataExternal getDatoVariable(int i) {
        return this.datoVariable[i];
    }

    public void setDatoVariable(int i, external.services.ee.gcaba.gob.ar.ExpedienteMetadataExternal _value) {
        this.datoVariable[i] = _value;
    }


    /**
     * Gets the descripcionTramite value for this ConsultaExpedienteResponseDetallado.
     * 
     * @return descripcionTramite
     */
    public java.lang.String getDescripcionTramite() {
        return descripcionTramite;
    }


    /**
     * Sets the descripcionTramite value for this ConsultaExpedienteResponseDetallado.
     * 
     * @param descripcionTramite
     */
    public void setDescripcionTramite(java.lang.String descripcionTramite) {
        this.descripcionTramite = descripcionTramite;
    }


    /**
     * Gets the f_caratulacion value for this ConsultaExpedienteResponseDetallado.
     * 
     * @return f_caratulacion
     */
    public java.util.Calendar getF_caratulacion() {
        return f_caratulacion;
    }


    /**
     * Sets the f_caratulacion value for this ConsultaExpedienteResponseDetallado.
     * 
     * @param f_caratulacion
     */
    public void setF_caratulacion(java.util.Calendar f_caratulacion) {
        this.f_caratulacion = f_caratulacion;
    }


    /**
     * Gets the listaExpedientesAsociados value for this ConsultaExpedienteResponseDetallado.
     * 
     * @return listaExpedientesAsociados
     */
    public external.services.ee.gcaba.gob.ar.ExpedienteAsociadoDTO[] getListaExpedientesAsociados() {
        return listaExpedientesAsociados;
    }


    /**
     * Sets the listaExpedientesAsociados value for this ConsultaExpedienteResponseDetallado.
     * 
     * @param listaExpedientesAsociados
     */
    public void setListaExpedientesAsociados(external.services.ee.gcaba.gob.ar.ExpedienteAsociadoDTO[] listaExpedientesAsociados) {
        this.listaExpedientesAsociados = listaExpedientesAsociados;
    }

    public external.services.ee.gcaba.gob.ar.ExpedienteAsociadoDTO getListaExpedientesAsociados(int i) {
        return this.listaExpedientesAsociados[i];
    }

    public void setListaExpedientesAsociados(int i, external.services.ee.gcaba.gob.ar.ExpedienteAsociadoDTO _value) {
        this.listaExpedientesAsociados[i] = _value;
    }


    /**
     * Gets the listaExpedientesAsociadosFusion value for this ConsultaExpedienteResponseDetallado.
     * 
     * @return listaExpedientesAsociadosFusion
     */
    public external.services.ee.gcaba.gob.ar.ExpedienteAsociadoDTO[] getListaExpedientesAsociadosFusion() {
        return listaExpedientesAsociadosFusion;
    }


    /**
     * Sets the listaExpedientesAsociadosFusion value for this ConsultaExpedienteResponseDetallado.
     * 
     * @param listaExpedientesAsociadosFusion
     */
    public void setListaExpedientesAsociadosFusion(external.services.ee.gcaba.gob.ar.ExpedienteAsociadoDTO[] listaExpedientesAsociadosFusion) {
        this.listaExpedientesAsociadosFusion = listaExpedientesAsociadosFusion;
    }

    public external.services.ee.gcaba.gob.ar.ExpedienteAsociadoDTO getListaExpedientesAsociadosFusion(int i) {
        return this.listaExpedientesAsociadosFusion[i];
    }

    public void setListaExpedientesAsociadosFusion(int i, external.services.ee.gcaba.gob.ar.ExpedienteAsociadoDTO _value) {
        this.listaExpedientesAsociadosFusion[i] = _value;
    }


    /**
     * Gets the listaExpedientesAsociadosTC value for this ConsultaExpedienteResponseDetallado.
     * 
     * @return listaExpedientesAsociadosTC
     */
    public external.services.ee.gcaba.gob.ar.ExpedienteAsociadoDTO[] getListaExpedientesAsociadosTC() {
        return listaExpedientesAsociadosTC;
    }


    /**
     * Sets the listaExpedientesAsociadosTC value for this ConsultaExpedienteResponseDetallado.
     * 
     * @param listaExpedientesAsociadosTC
     */
    public void setListaExpedientesAsociadosTC(external.services.ee.gcaba.gob.ar.ExpedienteAsociadoDTO[] listaExpedientesAsociadosTC) {
        this.listaExpedientesAsociadosTC = listaExpedientesAsociadosTC;
    }

    public external.services.ee.gcaba.gob.ar.ExpedienteAsociadoDTO getListaExpedientesAsociadosTC(int i) {
        return this.listaExpedientesAsociadosTC[i];
    }

    public void setListaExpedientesAsociadosTC(int i, external.services.ee.gcaba.gob.ar.ExpedienteAsociadoDTO _value) {
        this.listaExpedientesAsociadosTC[i] = _value;
    }


    /**
     * Gets the reparticionDestino value for this ConsultaExpedienteResponseDetallado.
     * 
     * @return reparticionDestino
     */
    public java.lang.String getReparticionDestino() {
        return reparticionDestino;
    }


    /**
     * Sets the reparticionDestino value for this ConsultaExpedienteResponseDetallado.
     * 
     * @param reparticionDestino
     */
    public void setReparticionDestino(java.lang.String reparticionDestino) {
        this.reparticionDestino = reparticionDestino;
    }


    /**
     * Gets the sectorDestino value for this ConsultaExpedienteResponseDetallado.
     * 
     * @return sectorDestino
     */
    public java.lang.String getSectorDestino() {
        return sectorDestino;
    }


    /**
     * Sets the sectorDestino value for this ConsultaExpedienteResponseDetallado.
     * 
     * @param sectorDestino
     */
    public void setSectorDestino(java.lang.String sectorDestino) {
        this.sectorDestino = sectorDestino;
    }


    /**
     * Gets the usuarioCaratulador value for this ConsultaExpedienteResponseDetallado.
     * 
     * @return usuarioCaratulador
     */
    public java.lang.String getUsuarioCaratulador() {
        return usuarioCaratulador;
    }


    /**
     * Sets the usuarioCaratulador value for this ConsultaExpedienteResponseDetallado.
     * 
     * @param usuarioCaratulador
     */
    public void setUsuarioCaratulador(java.lang.String usuarioCaratulador) {
        this.usuarioCaratulador = usuarioCaratulador;
    }


    /**
     * Gets the usuarioDestino value for this ConsultaExpedienteResponseDetallado.
     * 
     * @return usuarioDestino
     */
    public java.lang.String getUsuarioDestino() {
        return usuarioDestino;
    }


    /**
     * Sets the usuarioDestino value for this ConsultaExpedienteResponseDetallado.
     * 
     * @param usuarioDestino
     */
    public void setUsuarioDestino(java.lang.String usuarioDestino) {
        this.usuarioDestino = usuarioDestino;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaExpedienteResponseDetallado)) return false;
        ConsultaExpedienteResponseDetallado other = (ConsultaExpedienteResponseDetallado) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.datoVariable==null && other.getDatoVariable()==null) || 
             (this.datoVariable!=null &&
              java.util.Arrays.equals(this.datoVariable, other.getDatoVariable()))) &&
            ((this.descripcionTramite==null && other.getDescripcionTramite()==null) || 
             (this.descripcionTramite!=null &&
              this.descripcionTramite.equals(other.getDescripcionTramite()))) &&
            ((this.f_caratulacion==null && other.getF_caratulacion()==null) || 
             (this.f_caratulacion!=null &&
              this.f_caratulacion.equals(other.getF_caratulacion()))) &&
            ((this.listaExpedientesAsociados==null && other.getListaExpedientesAsociados()==null) || 
             (this.listaExpedientesAsociados!=null &&
              java.util.Arrays.equals(this.listaExpedientesAsociados, other.getListaExpedientesAsociados()))) &&
            ((this.listaExpedientesAsociadosFusion==null && other.getListaExpedientesAsociadosFusion()==null) || 
             (this.listaExpedientesAsociadosFusion!=null &&
              java.util.Arrays.equals(this.listaExpedientesAsociadosFusion, other.getListaExpedientesAsociadosFusion()))) &&
            ((this.listaExpedientesAsociadosTC==null && other.getListaExpedientesAsociadosTC()==null) || 
             (this.listaExpedientesAsociadosTC!=null &&
              java.util.Arrays.equals(this.listaExpedientesAsociadosTC, other.getListaExpedientesAsociadosTC()))) &&
            ((this.reparticionDestino==null && other.getReparticionDestino()==null) || 
             (this.reparticionDestino!=null &&
              this.reparticionDestino.equals(other.getReparticionDestino()))) &&
            ((this.sectorDestino==null && other.getSectorDestino()==null) || 
             (this.sectorDestino!=null &&
              this.sectorDestino.equals(other.getSectorDestino()))) &&
            ((this.usuarioCaratulador==null && other.getUsuarioCaratulador()==null) || 
             (this.usuarioCaratulador!=null &&
              this.usuarioCaratulador.equals(other.getUsuarioCaratulador()))) &&
            ((this.usuarioDestino==null && other.getUsuarioDestino()==null) || 
             (this.usuarioDestino!=null &&
              this.usuarioDestino.equals(other.getUsuarioDestino())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getDatoVariable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDatoVariable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDatoVariable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescripcionTramite() != null) {
            _hashCode += getDescripcionTramite().hashCode();
        }
        if (getF_caratulacion() != null) {
            _hashCode += getF_caratulacion().hashCode();
        }
        if (getListaExpedientesAsociados() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaExpedientesAsociados());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaExpedientesAsociados(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListaExpedientesAsociadosFusion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaExpedientesAsociadosFusion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaExpedientesAsociadosFusion(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListaExpedientesAsociadosTC() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaExpedientesAsociadosTC());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaExpedientesAsociadosTC(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReparticionDestino() != null) {
            _hashCode += getReparticionDestino().hashCode();
        }
        if (getSectorDestino() != null) {
            _hashCode += getSectorDestino().hashCode();
        }
        if (getUsuarioCaratulador() != null) {
            _hashCode += getUsuarioCaratulador().hashCode();
        }
        if (getUsuarioDestino() != null) {
            _hashCode += getUsuarioDestino().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaExpedienteResponseDetallado.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "consultaExpedienteResponseDetallado"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datoVariable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datoVariable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "expedienteMetadataExternal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionTramite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcionTramite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("f_caratulacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "f_caratulacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaExpedientesAsociados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaExpedientesAsociados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "expedienteAsociadoDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaExpedientesAsociadosFusion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaExpedientesAsociadosFusion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "expedienteAsociadoDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaExpedientesAsociadosTC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaExpedientesAsociadosTC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "expedienteAsociadoDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("usuarioCaratulador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioCaratulador"));
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
