/**
 * RequestExternalGenerarDocumento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package generardocumento.external.services.satra.gedo.gcaba.gob.ar;

public class RequestExternalGenerarDocumento  implements java.io.Serializable {
    private java.lang.String acronimoTipoDocumento;

    private byte[] data;

    private java.lang.Integer idTransaccion;

    private generardocumento.external.services.satra.gedo.gcaba.gob.ar.ArchivoEmbebidoDTO[] listaArchivosEmbebidos;

    private java.lang.String[] listaUsuariosDestinatarios;

    private java.lang.String[] listaUsuariosDestinatariosCopia;

    private java.lang.String[] listaUsuariosDestinatariosCopiaOculta;

    private generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumentoListaUsuariosDestinatariosExternosEntry[] listaUsuariosDestinatariosExternos;

    private java.lang.String mensajeDestinatario;

    private generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumentoMetaDatosEntry[] metaDatos;

    private java.lang.String referencia;

    private java.lang.String sistemaOrigen;

    private java.lang.String tipoArchivo;

    private java.lang.String usuario;

    public RequestExternalGenerarDocumento() {
    }

    public RequestExternalGenerarDocumento(
           java.lang.String acronimoTipoDocumento,
           byte[] data,
           java.lang.Integer idTransaccion,
           generardocumento.external.services.satra.gedo.gcaba.gob.ar.ArchivoEmbebidoDTO[] listaArchivosEmbebidos,
           java.lang.String[] listaUsuariosDestinatarios,
           java.lang.String[] listaUsuariosDestinatariosCopia,
           java.lang.String[] listaUsuariosDestinatariosCopiaOculta,
           generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumentoListaUsuariosDestinatariosExternosEntry[] listaUsuariosDestinatariosExternos,
           java.lang.String mensajeDestinatario,
           generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumentoMetaDatosEntry[] metaDatos,
           java.lang.String referencia,
           java.lang.String sistemaOrigen,
           java.lang.String tipoArchivo,
           java.lang.String usuario) {
           this.acronimoTipoDocumento = acronimoTipoDocumento;
           this.data = data;
           this.idTransaccion = idTransaccion;
           this.listaArchivosEmbebidos = listaArchivosEmbebidos;
           this.listaUsuariosDestinatarios = listaUsuariosDestinatarios;
           this.listaUsuariosDestinatariosCopia = listaUsuariosDestinatariosCopia;
           this.listaUsuariosDestinatariosCopiaOculta = listaUsuariosDestinatariosCopiaOculta;
           this.listaUsuariosDestinatariosExternos = listaUsuariosDestinatariosExternos;
           this.mensajeDestinatario = mensajeDestinatario;
           this.metaDatos = metaDatos;
           this.referencia = referencia;
           this.sistemaOrigen = sistemaOrigen;
           this.tipoArchivo = tipoArchivo;
           this.usuario = usuario;
    }


    /**
     * Gets the acronimoTipoDocumento value for this RequestExternalGenerarDocumento.
     * 
     * @return acronimoTipoDocumento
     */
    public java.lang.String getAcronimoTipoDocumento() {
        return acronimoTipoDocumento;
    }


    /**
     * Sets the acronimoTipoDocumento value for this RequestExternalGenerarDocumento.
     * 
     * @param acronimoTipoDocumento
     */
    public void setAcronimoTipoDocumento(java.lang.String acronimoTipoDocumento) {
        this.acronimoTipoDocumento = acronimoTipoDocumento;
    }


    /**
     * Gets the data value for this RequestExternalGenerarDocumento.
     * 
     * @return data
     */
    public byte[] getData() {
        return data;
    }


    /**
     * Sets the data value for this RequestExternalGenerarDocumento.
     * 
     * @param data
     */
    public void setData(byte[] data) {
        this.data = data;
    }


    /**
     * Gets the idTransaccion value for this RequestExternalGenerarDocumento.
     * 
     * @return idTransaccion
     */
    public java.lang.Integer getIdTransaccion() {
        return idTransaccion;
    }


    /**
     * Sets the idTransaccion value for this RequestExternalGenerarDocumento.
     * 
     * @param idTransaccion
     */
    public void setIdTransaccion(java.lang.Integer idTransaccion) {
        this.idTransaccion = idTransaccion;
    }


    /**
     * Gets the listaArchivosEmbebidos value for this RequestExternalGenerarDocumento.
     * 
     * @return listaArchivosEmbebidos
     */
    public generardocumento.external.services.satra.gedo.gcaba.gob.ar.ArchivoEmbebidoDTO[] getListaArchivosEmbebidos() {
        return listaArchivosEmbebidos;
    }


    /**
     * Sets the listaArchivosEmbebidos value for this RequestExternalGenerarDocumento.
     * 
     * @param listaArchivosEmbebidos
     */
    public void setListaArchivosEmbebidos(generardocumento.external.services.satra.gedo.gcaba.gob.ar.ArchivoEmbebidoDTO[] listaArchivosEmbebidos) {
        this.listaArchivosEmbebidos = listaArchivosEmbebidos;
    }

    public generardocumento.external.services.satra.gedo.gcaba.gob.ar.ArchivoEmbebidoDTO getListaArchivosEmbebidos(int i) {
        return this.listaArchivosEmbebidos[i];
    }

    public void setListaArchivosEmbebidos(int i, generardocumento.external.services.satra.gedo.gcaba.gob.ar.ArchivoEmbebidoDTO _value) {
        this.listaArchivosEmbebidos[i] = _value;
    }


    /**
     * Gets the listaUsuariosDestinatarios value for this RequestExternalGenerarDocumento.
     * 
     * @return listaUsuariosDestinatarios
     */
    public java.lang.String[] getListaUsuariosDestinatarios() {
        return listaUsuariosDestinatarios;
    }


    /**
     * Sets the listaUsuariosDestinatarios value for this RequestExternalGenerarDocumento.
     * 
     * @param listaUsuariosDestinatarios
     */
    public void setListaUsuariosDestinatarios(java.lang.String[] listaUsuariosDestinatarios) {
        this.listaUsuariosDestinatarios = listaUsuariosDestinatarios;
    }

    public java.lang.String getListaUsuariosDestinatarios(int i) {
        return this.listaUsuariosDestinatarios[i];
    }

    public void setListaUsuariosDestinatarios(int i, java.lang.String _value) {
        this.listaUsuariosDestinatarios[i] = _value;
    }


    /**
     * Gets the listaUsuariosDestinatariosCopia value for this RequestExternalGenerarDocumento.
     * 
     * @return listaUsuariosDestinatariosCopia
     */
    public java.lang.String[] getListaUsuariosDestinatariosCopia() {
        return listaUsuariosDestinatariosCopia;
    }


    /**
     * Sets the listaUsuariosDestinatariosCopia value for this RequestExternalGenerarDocumento.
     * 
     * @param listaUsuariosDestinatariosCopia
     */
    public void setListaUsuariosDestinatariosCopia(java.lang.String[] listaUsuariosDestinatariosCopia) {
        this.listaUsuariosDestinatariosCopia = listaUsuariosDestinatariosCopia;
    }

    public java.lang.String getListaUsuariosDestinatariosCopia(int i) {
        return this.listaUsuariosDestinatariosCopia[i];
    }

    public void setListaUsuariosDestinatariosCopia(int i, java.lang.String _value) {
        this.listaUsuariosDestinatariosCopia[i] = _value;
    }


    /**
     * Gets the listaUsuariosDestinatariosCopiaOculta value for this RequestExternalGenerarDocumento.
     * 
     * @return listaUsuariosDestinatariosCopiaOculta
     */
    public java.lang.String[] getListaUsuariosDestinatariosCopiaOculta() {
        return listaUsuariosDestinatariosCopiaOculta;
    }


    /**
     * Sets the listaUsuariosDestinatariosCopiaOculta value for this RequestExternalGenerarDocumento.
     * 
     * @param listaUsuariosDestinatariosCopiaOculta
     */
    public void setListaUsuariosDestinatariosCopiaOculta(java.lang.String[] listaUsuariosDestinatariosCopiaOculta) {
        this.listaUsuariosDestinatariosCopiaOculta = listaUsuariosDestinatariosCopiaOculta;
    }

    public java.lang.String getListaUsuariosDestinatariosCopiaOculta(int i) {
        return this.listaUsuariosDestinatariosCopiaOculta[i];
    }

    public void setListaUsuariosDestinatariosCopiaOculta(int i, java.lang.String _value) {
        this.listaUsuariosDestinatariosCopiaOculta[i] = _value;
    }


    /**
     * Gets the listaUsuariosDestinatariosExternos value for this RequestExternalGenerarDocumento.
     * 
     * @return listaUsuariosDestinatariosExternos
     */
    public generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumentoListaUsuariosDestinatariosExternosEntry[] getListaUsuariosDestinatariosExternos() {
        return listaUsuariosDestinatariosExternos;
    }


    /**
     * Sets the listaUsuariosDestinatariosExternos value for this RequestExternalGenerarDocumento.
     * 
     * @param listaUsuariosDestinatariosExternos
     */
    public void setListaUsuariosDestinatariosExternos(generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumentoListaUsuariosDestinatariosExternosEntry[] listaUsuariosDestinatariosExternos) {
        this.listaUsuariosDestinatariosExternos = listaUsuariosDestinatariosExternos;
    }


    /**
     * Gets the mensajeDestinatario value for this RequestExternalGenerarDocumento.
     * 
     * @return mensajeDestinatario
     */
    public java.lang.String getMensajeDestinatario() {
        return mensajeDestinatario;
    }


    /**
     * Sets the mensajeDestinatario value for this RequestExternalGenerarDocumento.
     * 
     * @param mensajeDestinatario
     */
    public void setMensajeDestinatario(java.lang.String mensajeDestinatario) {
        this.mensajeDestinatario = mensajeDestinatario;
    }


    /**
     * Gets the metaDatos value for this RequestExternalGenerarDocumento.
     * 
     * @return metaDatos
     */
    public generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumentoMetaDatosEntry[] getMetaDatos() {
        return metaDatos;
    }


    /**
     * Sets the metaDatos value for this RequestExternalGenerarDocumento.
     * 
     * @param metaDatos
     */
    public void setMetaDatos(generardocumento.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarDocumentoMetaDatosEntry[] metaDatos) {
        this.metaDatos = metaDatos;
    }


    /**
     * Gets the referencia value for this RequestExternalGenerarDocumento.
     * 
     * @return referencia
     */
    public java.lang.String getReferencia() {
        return referencia;
    }


    /**
     * Sets the referencia value for this RequestExternalGenerarDocumento.
     * 
     * @param referencia
     */
    public void setReferencia(java.lang.String referencia) {
        this.referencia = referencia;
    }


    /**
     * Gets the sistemaOrigen value for this RequestExternalGenerarDocumento.
     * 
     * @return sistemaOrigen
     */
    public java.lang.String getSistemaOrigen() {
        return sistemaOrigen;
    }


    /**
     * Sets the sistemaOrigen value for this RequestExternalGenerarDocumento.
     * 
     * @param sistemaOrigen
     */
    public void setSistemaOrigen(java.lang.String sistemaOrigen) {
        this.sistemaOrigen = sistemaOrigen;
    }


    /**
     * Gets the tipoArchivo value for this RequestExternalGenerarDocumento.
     * 
     * @return tipoArchivo
     */
    public java.lang.String getTipoArchivo() {
        return tipoArchivo;
    }


    /**
     * Sets the tipoArchivo value for this RequestExternalGenerarDocumento.
     * 
     * @param tipoArchivo
     */
    public void setTipoArchivo(java.lang.String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }


    /**
     * Gets the usuario value for this RequestExternalGenerarDocumento.
     * 
     * @return usuario
     */
    public java.lang.String getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this RequestExternalGenerarDocumento.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.String usuario) {
        this.usuario = usuario;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestExternalGenerarDocumento)) return false;
        RequestExternalGenerarDocumento other = (RequestExternalGenerarDocumento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acronimoTipoDocumento==null && other.getAcronimoTipoDocumento()==null) || 
             (this.acronimoTipoDocumento!=null &&
              this.acronimoTipoDocumento.equals(other.getAcronimoTipoDocumento()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              java.util.Arrays.equals(this.data, other.getData()))) &&
            ((this.idTransaccion==null && other.getIdTransaccion()==null) || 
             (this.idTransaccion!=null &&
              this.idTransaccion.equals(other.getIdTransaccion()))) &&
            ((this.listaArchivosEmbebidos==null && other.getListaArchivosEmbebidos()==null) || 
             (this.listaArchivosEmbebidos!=null &&
              java.util.Arrays.equals(this.listaArchivosEmbebidos, other.getListaArchivosEmbebidos()))) &&
            ((this.listaUsuariosDestinatarios==null && other.getListaUsuariosDestinatarios()==null) || 
             (this.listaUsuariosDestinatarios!=null &&
              java.util.Arrays.equals(this.listaUsuariosDestinatarios, other.getListaUsuariosDestinatarios()))) &&
            ((this.listaUsuariosDestinatariosCopia==null && other.getListaUsuariosDestinatariosCopia()==null) || 
             (this.listaUsuariosDestinatariosCopia!=null &&
              java.util.Arrays.equals(this.listaUsuariosDestinatariosCopia, other.getListaUsuariosDestinatariosCopia()))) &&
            ((this.listaUsuariosDestinatariosCopiaOculta==null && other.getListaUsuariosDestinatariosCopiaOculta()==null) || 
             (this.listaUsuariosDestinatariosCopiaOculta!=null &&
              java.util.Arrays.equals(this.listaUsuariosDestinatariosCopiaOculta, other.getListaUsuariosDestinatariosCopiaOculta()))) &&
            ((this.listaUsuariosDestinatariosExternos==null && other.getListaUsuariosDestinatariosExternos()==null) || 
             (this.listaUsuariosDestinatariosExternos!=null &&
              java.util.Arrays.equals(this.listaUsuariosDestinatariosExternos, other.getListaUsuariosDestinatariosExternos()))) &&
            ((this.mensajeDestinatario==null && other.getMensajeDestinatario()==null) || 
             (this.mensajeDestinatario!=null &&
              this.mensajeDestinatario.equals(other.getMensajeDestinatario()))) &&
            ((this.metaDatos==null && other.getMetaDatos()==null) || 
             (this.metaDatos!=null &&
              java.util.Arrays.equals(this.metaDatos, other.getMetaDatos()))) &&
            ((this.referencia==null && other.getReferencia()==null) || 
             (this.referencia!=null &&
              this.referencia.equals(other.getReferencia()))) &&
            ((this.sistemaOrigen==null && other.getSistemaOrigen()==null) || 
             (this.sistemaOrigen!=null &&
              this.sistemaOrigen.equals(other.getSistemaOrigen()))) &&
            ((this.tipoArchivo==null && other.getTipoArchivo()==null) || 
             (this.tipoArchivo!=null &&
              this.tipoArchivo.equals(other.getTipoArchivo()))) &&
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
        if (getAcronimoTipoDocumento() != null) {
            _hashCode += getAcronimoTipoDocumento().hashCode();
        }
        if (getData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIdTransaccion() != null) {
            _hashCode += getIdTransaccion().hashCode();
        }
        if (getListaArchivosEmbebidos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaArchivosEmbebidos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaArchivosEmbebidos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListaUsuariosDestinatarios() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaUsuariosDestinatarios());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaUsuariosDestinatarios(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListaUsuariosDestinatariosCopia() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaUsuariosDestinatariosCopia());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaUsuariosDestinatariosCopia(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListaUsuariosDestinatariosCopiaOculta() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaUsuariosDestinatariosCopiaOculta());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaUsuariosDestinatariosCopiaOculta(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListaUsuariosDestinatariosExternos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaUsuariosDestinatariosExternos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaUsuariosDestinatariosExternos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMensajeDestinatario() != null) {
            _hashCode += getMensajeDestinatario().hashCode();
        }
        if (getMetaDatos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetaDatos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetaDatos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReferencia() != null) {
            _hashCode += getReferencia().hashCode();
        }
        if (getSistemaOrigen() != null) {
            _hashCode += getSistemaOrigen().hashCode();
        }
        if (getTipoArchivo() != null) {
            _hashCode += getTipoArchivo().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestExternalGenerarDocumento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "requestExternalGenerarDocumento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acronimoTipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acronimoTipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTransaccion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idTransaccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaArchivosEmbebidos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaArchivosEmbebidos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", "archivoEmbebidoDTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaUsuariosDestinatarios");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaUsuariosDestinatarios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaUsuariosDestinatariosCopia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaUsuariosDestinatariosCopia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaUsuariosDestinatariosCopiaOculta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaUsuariosDestinatariosCopiaOculta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaUsuariosDestinatariosExternos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaUsuariosDestinatariosExternos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", ">>requestExternalGenerarDocumento>listaUsuariosDestinatariosExternos>entry"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensajeDestinatario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensajeDestinatario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaDatos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metaDatos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generardocumento/", ">>requestExternalGenerarDocumento>metaDatos>entry"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referencia"));
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
        elemField.setFieldName("tipoArchivo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoArchivo"));
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
