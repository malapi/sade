/**
 * HistorialDePasesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package external.services.ee.gcaba.gob.ar;

public class HistorialDePasesResponse  implements java.io.Serializable {
    private external.services.ee.gcaba.gob.ar.DocumentosVinculadosResponse[] documentosVinculados;

    private external.services.ee.gcaba.gob.ar.ExpedienteAsociadoResponse[] expedientesAsociados;

    private external.services.ee.gcaba.gob.ar.ExpedientesFusionResponse[] expedientesFusionAsociados;

    private external.services.ee.gcaba.gob.ar.ExpedientesVinculadosResponse[] expedientesVinculados;

    private external.services.ee.gcaba.gob.ar.HistorialDeOperacionResponse[] historialDeOperacion;

    public HistorialDePasesResponse() {
    }

    public HistorialDePasesResponse(
           external.services.ee.gcaba.gob.ar.DocumentosVinculadosResponse[] documentosVinculados,
           external.services.ee.gcaba.gob.ar.ExpedienteAsociadoResponse[] expedientesAsociados,
           external.services.ee.gcaba.gob.ar.ExpedientesFusionResponse[] expedientesFusionAsociados,
           external.services.ee.gcaba.gob.ar.ExpedientesVinculadosResponse[] expedientesVinculados,
           external.services.ee.gcaba.gob.ar.HistorialDeOperacionResponse[] historialDeOperacion) {
           this.documentosVinculados = documentosVinculados;
           this.expedientesAsociados = expedientesAsociados;
           this.expedientesFusionAsociados = expedientesFusionAsociados;
           this.expedientesVinculados = expedientesVinculados;
           this.historialDeOperacion = historialDeOperacion;
    }


    /**
     * Gets the documentosVinculados value for this HistorialDePasesResponse.
     * 
     * @return documentosVinculados
     */
    public external.services.ee.gcaba.gob.ar.DocumentosVinculadosResponse[] getDocumentosVinculados() {
        return documentosVinculados;
    }


    /**
     * Sets the documentosVinculados value for this HistorialDePasesResponse.
     * 
     * @param documentosVinculados
     */
    public void setDocumentosVinculados(external.services.ee.gcaba.gob.ar.DocumentosVinculadosResponse[] documentosVinculados) {
        this.documentosVinculados = documentosVinculados;
    }

    public external.services.ee.gcaba.gob.ar.DocumentosVinculadosResponse getDocumentosVinculados(int i) {
        return this.documentosVinculados[i];
    }

    public void setDocumentosVinculados(int i, external.services.ee.gcaba.gob.ar.DocumentosVinculadosResponse _value) {
        this.documentosVinculados[i] = _value;
    }


    /**
     * Gets the expedientesAsociados value for this HistorialDePasesResponse.
     * 
     * @return expedientesAsociados
     */
    public external.services.ee.gcaba.gob.ar.ExpedienteAsociadoResponse[] getExpedientesAsociados() {
        return expedientesAsociados;
    }


    /**
     * Sets the expedientesAsociados value for this HistorialDePasesResponse.
     * 
     * @param expedientesAsociados
     */
    public void setExpedientesAsociados(external.services.ee.gcaba.gob.ar.ExpedienteAsociadoResponse[] expedientesAsociados) {
        this.expedientesAsociados = expedientesAsociados;
    }

    public external.services.ee.gcaba.gob.ar.ExpedienteAsociadoResponse getExpedientesAsociados(int i) {
        return this.expedientesAsociados[i];
    }

    public void setExpedientesAsociados(int i, external.services.ee.gcaba.gob.ar.ExpedienteAsociadoResponse _value) {
        this.expedientesAsociados[i] = _value;
    }


    /**
     * Gets the expedientesFusionAsociados value for this HistorialDePasesResponse.
     * 
     * @return expedientesFusionAsociados
     */
    public external.services.ee.gcaba.gob.ar.ExpedientesFusionResponse[] getExpedientesFusionAsociados() {
        return expedientesFusionAsociados;
    }


    /**
     * Sets the expedientesFusionAsociados value for this HistorialDePasesResponse.
     * 
     * @param expedientesFusionAsociados
     */
    public void setExpedientesFusionAsociados(external.services.ee.gcaba.gob.ar.ExpedientesFusionResponse[] expedientesFusionAsociados) {
        this.expedientesFusionAsociados = expedientesFusionAsociados;
    }

    public external.services.ee.gcaba.gob.ar.ExpedientesFusionResponse getExpedientesFusionAsociados(int i) {
        return this.expedientesFusionAsociados[i];
    }

    public void setExpedientesFusionAsociados(int i, external.services.ee.gcaba.gob.ar.ExpedientesFusionResponse _value) {
        this.expedientesFusionAsociados[i] = _value;
    }


    /**
     * Gets the expedientesVinculados value for this HistorialDePasesResponse.
     * 
     * @return expedientesVinculados
     */
    public external.services.ee.gcaba.gob.ar.ExpedientesVinculadosResponse[] getExpedientesVinculados() {
        return expedientesVinculados;
    }


    /**
     * Sets the expedientesVinculados value for this HistorialDePasesResponse.
     * 
     * @param expedientesVinculados
     */
    public void setExpedientesVinculados(external.services.ee.gcaba.gob.ar.ExpedientesVinculadosResponse[] expedientesVinculados) {
        this.expedientesVinculados = expedientesVinculados;
    }

    public external.services.ee.gcaba.gob.ar.ExpedientesVinculadosResponse getExpedientesVinculados(int i) {
        return this.expedientesVinculados[i];
    }

    public void setExpedientesVinculados(int i, external.services.ee.gcaba.gob.ar.ExpedientesVinculadosResponse _value) {
        this.expedientesVinculados[i] = _value;
    }


    /**
     * Gets the historialDeOperacion value for this HistorialDePasesResponse.
     * 
     * @return historialDeOperacion
     */
    public external.services.ee.gcaba.gob.ar.HistorialDeOperacionResponse[] getHistorialDeOperacion() {
        return historialDeOperacion;
    }


    /**
     * Sets the historialDeOperacion value for this HistorialDePasesResponse.
     * 
     * @param historialDeOperacion
     */
    public void setHistorialDeOperacion(external.services.ee.gcaba.gob.ar.HistorialDeOperacionResponse[] historialDeOperacion) {
        this.historialDeOperacion = historialDeOperacion;
    }

    public external.services.ee.gcaba.gob.ar.HistorialDeOperacionResponse getHistorialDeOperacion(int i) {
        return this.historialDeOperacion[i];
    }

    public void setHistorialDeOperacion(int i, external.services.ee.gcaba.gob.ar.HistorialDeOperacionResponse _value) {
        this.historialDeOperacion[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HistorialDePasesResponse)) return false;
        HistorialDePasesResponse other = (HistorialDePasesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentosVinculados==null && other.getDocumentosVinculados()==null) || 
             (this.documentosVinculados!=null &&
              java.util.Arrays.equals(this.documentosVinculados, other.getDocumentosVinculados()))) &&
            ((this.expedientesAsociados==null && other.getExpedientesAsociados()==null) || 
             (this.expedientesAsociados!=null &&
              java.util.Arrays.equals(this.expedientesAsociados, other.getExpedientesAsociados()))) &&
            ((this.expedientesFusionAsociados==null && other.getExpedientesFusionAsociados()==null) || 
             (this.expedientesFusionAsociados!=null &&
              java.util.Arrays.equals(this.expedientesFusionAsociados, other.getExpedientesFusionAsociados()))) &&
            ((this.expedientesVinculados==null && other.getExpedientesVinculados()==null) || 
             (this.expedientesVinculados!=null &&
              java.util.Arrays.equals(this.expedientesVinculados, other.getExpedientesVinculados()))) &&
            ((this.historialDeOperacion==null && other.getHistorialDeOperacion()==null) || 
             (this.historialDeOperacion!=null &&
              java.util.Arrays.equals(this.historialDeOperacion, other.getHistorialDeOperacion())));
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
        if (getDocumentosVinculados() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDocumentosVinculados());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDocumentosVinculados(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpedientesAsociados() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpedientesAsociados());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpedientesAsociados(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpedientesFusionAsociados() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpedientesFusionAsociados());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpedientesFusionAsociados(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpedientesVinculados() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpedientesVinculados());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpedientesVinculados(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHistorialDeOperacion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHistorialDeOperacion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHistorialDeOperacion(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HistorialDePasesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "historialDePasesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentosVinculados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "documentosVinculados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "documentosVinculadosResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expedientesAsociados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expedientesAsociados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "expedienteAsociadoResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expedientesFusionAsociados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expedientesFusionAsociados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "expedientesFusionResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expedientesVinculados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expedientesVinculados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "expedientesVinculadosResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historialDeOperacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "historialDeOperacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.ee.services.external/", "historialDeOperacionResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
