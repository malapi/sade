/**
 * ConsultaExpedienteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.services.ee.gcaba.gob.ar;

public class ConsultaExpedienteResponse  implements java.io.Serializable {
    private java.lang.String codigoDocCaratula;

    private java.lang.String codigoEE;

    private java.lang.String codigotrata;

    private java.lang.String descripcionTrata;

    private java.lang.String estado;

    private java.lang.String[] listArchivosAdjuntos;

    private java.lang.String[] listDocumentosOficiales;

    private java.lang.String[] listExpedientesAsociados;

    private external.services.ee.gcaba.gob.ar.DatosTareaBean[] listaDatosTarea;

    private java.lang.String motivo;

    private java.lang.String sistemaOrigen;

    public ConsultaExpedienteResponse() {
    }

    public ConsultaExpedienteResponse(
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
           java.lang.String sistemaOrigen) {
           this.codigoDocCaratula = codigoDocCaratula;
           this.codigoEE = codigoEE;
           this.codigotrata = codigotrata;
           this.descripcionTrata = descripcionTrata;
           this.estado = estado;
           this.listArchivosAdjuntos = listArchivosAdjuntos;
           this.listDocumentosOficiales = listDocumentosOficiales;
           this.listExpedientesAsociados = listExpedientesAsociados;
           this.listaDatosTarea = listaDatosTarea;
           this.motivo = motivo;
           this.sistemaOrigen = sistemaOrigen;
    }


    /**
     * Gets the codigoDocCaratula value for this ConsultaExpedienteResponse.
     * 
     * @return codigoDocCaratula
     */
    public java.lang.String getCodigoDocCaratula() {
        return codigoDocCaratula;
    }


    /**
     * Sets the codigoDocCaratula value for this ConsultaExpedienteResponse.
     * 
     * @param codigoDocCaratula
     */
    public void setCodigoDocCaratula(java.lang.String codigoDocCaratula) {
        this.codigoDocCaratula = codigoDocCaratula;
    }


    /**
     * Gets the codigoEE value for this ConsultaExpedienteResponse.
     * 
     * @return codigoEE
     */
    public java.lang.String getCodigoEE() {
        return codigoEE;
    }


    /**
     * Sets the codigoEE value for this ConsultaExpedienteResponse.
     * 
     * @param codigoEE
     */
    public void setCodigoEE(java.lang.String codigoEE) {
        this.codigoEE = codigoEE;
    }


    /**
     * Gets the codigotrata value for this ConsultaExpedienteResponse.
     * 
     * @return codigotrata
     */
    public java.lang.String getCodigotrata() {
        return codigotrata;
    }


    /**
     * Sets the codigotrata value for this ConsultaExpedienteResponse.
     * 
     * @param codigotrata
     */
    public void setCodigotrata(java.lang.String codigotrata) {
        this.codigotrata = codigotrata;
    }


    /**
     * Gets the descripcionTrata value for this ConsultaExpedienteResponse.
     * 
     * @return descripcionTrata
     */
    public java.lang.String getDescripcionTrata() {
        return descripcionTrata;
    }


    /**
     * Sets the descripcionTrata value for this ConsultaExpedienteResponse.
     * 
     * @param descripcionTrata
     */
    public void setDescripcionTrata(java.lang.String descripcionTrata) {
        this.descripcionTrata = descripcionTrata;
    }


    /**
     * Gets the estado value for this ConsultaExpedienteResponse.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this ConsultaExpedienteResponse.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the listArchivosAdjuntos value for this ConsultaExpedienteResponse.
     * 
     * @return listArchivosAdjuntos
     */
    public java.lang.String[] getListArchivosAdjuntos() {
        return listArchivosAdjuntos;
    }


    /**
     * Sets the listArchivosAdjuntos value for this ConsultaExpedienteResponse.
     * 
     * @param listArchivosAdjuntos
     */
    public void setListArchivosAdjuntos(java.lang.String[] listArchivosAdjuntos) {
        this.listArchivosAdjuntos = listArchivosAdjuntos;
    }

    public java.lang.String getListArchivosAdjuntos(int i) {
        return this.listArchivosAdjuntos[i];
    }

    public void setListArchivosAdjuntos(int i, java.lang.String _value) {
        this.listArchivosAdjuntos[i] = _value;
    }


    /**
     * Gets the listDocumentosOficiales value for this ConsultaExpedienteResponse.
     * 
     * @return listDocumentosOficiales
     */
    public java.lang.String[] getListDocumentosOficiales() {
        return listDocumentosOficiales;
    }


    /**
     * Sets the listDocumentosOficiales value for this ConsultaExpedienteResponse.
     * 
     * @param listDocumentosOficiales
     */
    public void setListDocumentosOficiales(java.lang.String[] listDocumentosOficiales) {
        this.listDocumentosOficiales = listDocumentosOficiales;
    }

    public java.lang.String getListDocumentosOficiales(int i) {
        return this.listDocumentosOficiales[i];
    }

    public void setListDocumentosOficiales(int i, java.lang.String _value) {
        this.listDocumentosOficiales[i] = _value;
    }


    /**
     * Gets the listExpedientesAsociados value for this ConsultaExpedienteResponse.
     * 
     * @return listExpedientesAsociados
     */
    public java.lang.String[] getListExpedientesAsociados() {
        return listExpedientesAsociados;
    }


    /**
     * Sets the listExpedientesAsociados value for this ConsultaExpedienteResponse.
     * 
     * @param listExpedientesAsociados
     */
    public void setListExpedientesAsociados(java.lang.String[] listExpedientesAsociados) {
        this.listExpedientesAsociados = listExpedientesAsociados;
    }

    public java.lang.String getListExpedientesAsociados(int i) {
        return this.listExpedientesAsociados[i];
    }

    public void setListExpedientesAsociados(int i, java.lang.String _value) {
        this.listExpedientesAsociados[i] = _value;
    }


    /**
     * Gets the listaDatosTarea value for this ConsultaExpedienteResponse.
     * 
     * @return listaDatosTarea
     */
    public external.services.ee.gcaba.gob.ar.DatosTareaBean[] getListaDatosTarea() {
        return listaDatosTarea;
    }


    /**
     * Sets the listaDatosTarea value for this ConsultaExpedienteResponse.
     * 
     * @param listaDatosTarea
     */
    public void setListaDatosTarea(external.services.ee.gcaba.gob.ar.DatosTareaBean[] listaDatosTarea) {
        this.listaDatosTarea = listaDatosTarea;
    }

    public external.services.ee.gcaba.gob.ar.DatosTareaBean getListaDatosTarea(int i) {
        return this.listaDatosTarea[i];
    }

    public void setListaDatosTarea(int i, external.services.ee.gcaba.gob.ar.DatosTareaBean _value) {
        this.listaDatosTarea[i] = _value;
    }


    /**
     * Gets the motivo value for this ConsultaExpedienteResponse.
     * 
     * @return motivo
     */
    public java.lang.String getMotivo() {
        return motivo;
    }


    /**
     * Sets the motivo value for this ConsultaExpedienteResponse.
     * 
     * @param motivo
     */
    public void setMotivo(java.lang.String motivo) {
        this.motivo = motivo;
    }


    /**
     * Gets the sistemaOrigen value for this ConsultaExpedienteResponse.
     * 
     * @return sistemaOrigen
     */
    public java.lang.String getSistemaOrigen() {
        return sistemaOrigen;
    }


    /**
     * Sets the sistemaOrigen value for this ConsultaExpedienteResponse.
     * 
     * @param sistemaOrigen
     */
    public void setSistemaOrigen(java.lang.String sistemaOrigen) {
        this.sistemaOrigen = sistemaOrigen;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaExpedienteResponse)) return false;
        ConsultaExpedienteResponse other = (ConsultaExpedienteResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoDocCaratula==null && other.getCodigoDocCaratula()==null) || 
             (this.codigoDocCaratula!=null &&
              this.codigoDocCaratula.equals(other.getCodigoDocCaratula()))) &&
            ((this.codigoEE==null && other.getCodigoEE()==null) || 
             (this.codigoEE!=null &&
              this.codigoEE.equals(other.getCodigoEE()))) &&
            ((this.codigotrata==null && other.getCodigotrata()==null) || 
             (this.codigotrata!=null &&
              this.codigotrata.equals(other.getCodigotrata()))) &&
            ((this.descripcionTrata==null && other.getDescripcionTrata()==null) || 
             (this.descripcionTrata!=null &&
              this.descripcionTrata.equals(other.getDescripcionTrata()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.listArchivosAdjuntos==null && other.getListArchivosAdjuntos()==null) || 
             (this.listArchivosAdjuntos!=null &&
              java.util.Arrays.equals(this.listArchivosAdjuntos, other.getListArchivosAdjuntos()))) &&
            ((this.listDocumentosOficiales==null && other.getListDocumentosOficiales()==null) || 
             (this.listDocumentosOficiales!=null &&
              java.util.Arrays.equals(this.listDocumentosOficiales, other.getListDocumentosOficiales()))) &&
            ((this.listExpedientesAsociados==null && other.getListExpedientesAsociados()==null) || 
             (this.listExpedientesAsociados!=null &&
              java.util.Arrays.equals(this.listExpedientesAsociados, other.getListExpedientesAsociados()))) &&
            ((this.listaDatosTarea==null && other.getListaDatosTarea()==null) || 
             (this.listaDatosTarea!=null &&
              java.util.Arrays.equals(this.listaDatosTarea, other.getListaDatosTarea()))) &&
            ((this.motivo==null && other.getMotivo()==null) || 
             (this.motivo!=null &&
              this.motivo.equals(other.getMotivo()))) &&
            ((this.sistemaOrigen==null && other.getSistemaOrigen()==null) || 
             (this.sistemaOrigen!=null &&
              this.sistemaOrigen.equals(other.getSistemaOrigen())));
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
        if (getCodigoDocCaratula() != null) {
            _hashCode += getCodigoDocCaratula().hashCode();
        }
        if (getCodigoEE() != null) {
            _hashCode += getCodigoEE().hashCode();
        }
        if (getCodigotrata() != null) {
            _hashCode += getCodigotrata().hashCode();
        }
        if (getDescripcionTrata() != null) {
            _hashCode += getDescripcionTrata().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getListArchivosAdjuntos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListArchivosAdjuntos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListArchivosAdjuntos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListDocumentosOficiales() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListDocumentosOficiales());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListDocumentosOficiales(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListExpedientesAsociados() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListExpedientesAsociados());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListExpedientesAsociados(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListaDatosTarea() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaDatosTarea());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaDatosTarea(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMotivo() != null) {
            _hashCode += getMotivo().hashCode();
        }
        if (getSistemaOrigen() != null) {
            _hashCode += getSistemaOrigen().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaExpedienteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "consultaExpedienteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoDocCaratula");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoDocCaratula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoEE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoEE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigotrata");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigotrata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionTrata");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcionTrata"));
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
        elemField.setFieldName("listArchivosAdjuntos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listArchivosAdjuntos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listDocumentosOficiales");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listDocumentosOficiales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listExpedientesAsociados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listExpedientesAsociados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaDatosTarea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaDatosTarea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "datosTareaBean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motivo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "motivo"));
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
