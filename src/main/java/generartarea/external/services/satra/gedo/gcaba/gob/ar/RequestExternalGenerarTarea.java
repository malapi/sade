/**
 * RequestExternalGenerarTarea.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package generartarea.external.services.satra.gedo.gcaba.gob.ar;

public class RequestExternalGenerarTarea  implements java.io.Serializable {
    private java.lang.String acronimoTipoDocumento;

    private byte[] data;

    private boolean enviarCorreoReceptor;

    private java.lang.Integer idTransaccion;

    private generartarea.external.services.satra.gedo.gcaba.gob.ar.ArchivoEmbebidoDTO[] listaArchivosEmbebidos;

    private java.lang.String[] listaUsuariosDestinatarios;

    private java.lang.String[] listaUsuariosDestinatariosCopia;

    private java.lang.String[] listaUsuariosDestinatariosCopiaOculta;

    private generartarea.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarTareaListaUsuariosDestinatariosExternosEntry[] listaUsuariosDestinatariosExternos;

    private java.lang.String mensaje;

    private java.lang.String mensajeDestinatario;

    private generartarea.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarTareaMetaDatosEntry[] metaDatos;

    private boolean recibirAvisoFirma;

    private java.lang.String referencia;

    private java.lang.String sistemaIniciador;

    private java.lang.Boolean suscribirseAlDocumento;

    private java.lang.String tarea;

    private java.lang.String tipoArchivo;

    private java.lang.String usuarioEmisor;

    private generartarea.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarTareaUsuarioFirmanteEntry[] usuarioFirmante;

    private java.lang.String usuarioReceptor;

    private java.lang.String usuarioRevisor;

    public RequestExternalGenerarTarea() {
    }

    public RequestExternalGenerarTarea(
           java.lang.String acronimoTipoDocumento,
           byte[] data,
           boolean enviarCorreoReceptor,
           java.lang.Integer idTransaccion,
           generartarea.external.services.satra.gedo.gcaba.gob.ar.ArchivoEmbebidoDTO[] listaArchivosEmbebidos,
           java.lang.String[] listaUsuariosDestinatarios,
           java.lang.String[] listaUsuariosDestinatariosCopia,
           java.lang.String[] listaUsuariosDestinatariosCopiaOculta,
           generartarea.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarTareaListaUsuariosDestinatariosExternosEntry[] listaUsuariosDestinatariosExternos,
           java.lang.String mensaje,
           java.lang.String mensajeDestinatario,
           generartarea.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarTareaMetaDatosEntry[] metaDatos,
           boolean recibirAvisoFirma,
           java.lang.String referencia,
           java.lang.String sistemaIniciador,
           java.lang.Boolean suscribirseAlDocumento,
           java.lang.String tarea,
           java.lang.String tipoArchivo,
           java.lang.String usuarioEmisor,
           generartarea.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarTareaUsuarioFirmanteEntry[] usuarioFirmante,
           java.lang.String usuarioReceptor,
           java.lang.String usuarioRevisor) {
           this.acronimoTipoDocumento = acronimoTipoDocumento;
           this.data = data;
           this.enviarCorreoReceptor = enviarCorreoReceptor;
           this.idTransaccion = idTransaccion;
           this.listaArchivosEmbebidos = listaArchivosEmbebidos;
           this.listaUsuariosDestinatarios = listaUsuariosDestinatarios;
           this.listaUsuariosDestinatariosCopia = listaUsuariosDestinatariosCopia;
           this.listaUsuariosDestinatariosCopiaOculta = listaUsuariosDestinatariosCopiaOculta;
           this.listaUsuariosDestinatariosExternos = listaUsuariosDestinatariosExternos;
           this.mensaje = mensaje;
           this.mensajeDestinatario = mensajeDestinatario;
           this.metaDatos = metaDatos;
           this.recibirAvisoFirma = recibirAvisoFirma;
           this.referencia = referencia;
           this.sistemaIniciador = sistemaIniciador;
           this.suscribirseAlDocumento = suscribirseAlDocumento;
           this.tarea = tarea;
           this.tipoArchivo = tipoArchivo;
           this.usuarioEmisor = usuarioEmisor;
           this.usuarioFirmante = usuarioFirmante;
           this.usuarioReceptor = usuarioReceptor;
           this.usuarioRevisor = usuarioRevisor;
    }


    /**
     * Gets the acronimoTipoDocumento value for this RequestExternalGenerarTarea.
     * 
     * @return acronimoTipoDocumento
     */
    public java.lang.String getAcronimoTipoDocumento() {
        return acronimoTipoDocumento;
    }


    /**
     * Sets the acronimoTipoDocumento value for this RequestExternalGenerarTarea.
     * 
     * @param acronimoTipoDocumento
     */
    public void setAcronimoTipoDocumento(java.lang.String acronimoTipoDocumento) {
        this.acronimoTipoDocumento = acronimoTipoDocumento;
    }


    /**
     * Gets the data value for this RequestExternalGenerarTarea.
     * 
     * @return data
     */
    public byte[] getData() {
        return data;
    }


    /**
     * Sets the data value for this RequestExternalGenerarTarea.
     * 
     * @param data
     */
    public void setData(byte[] data) {
        this.data = data;
    }


    /**
     * Gets the enviarCorreoReceptor value for this RequestExternalGenerarTarea.
     * 
     * @return enviarCorreoReceptor
     */
    public boolean isEnviarCorreoReceptor() {
        return enviarCorreoReceptor;
    }


    /**
     * Sets the enviarCorreoReceptor value for this RequestExternalGenerarTarea.
     * 
     * @param enviarCorreoReceptor
     */
    public void setEnviarCorreoReceptor(boolean enviarCorreoReceptor) {
        this.enviarCorreoReceptor = enviarCorreoReceptor;
    }


    /**
     * Gets the idTransaccion value for this RequestExternalGenerarTarea.
     * 
     * @return idTransaccion
     */
    public java.lang.Integer getIdTransaccion() {
        return idTransaccion;
    }


    /**
     * Sets the idTransaccion value for this RequestExternalGenerarTarea.
     * 
     * @param idTransaccion
     */
    public void setIdTransaccion(java.lang.Integer idTransaccion) {
        this.idTransaccion = idTransaccion;
    }


    /**
     * Gets the listaArchivosEmbebidos value for this RequestExternalGenerarTarea.
     * 
     * @return listaArchivosEmbebidos
     */
    public generartarea.external.services.satra.gedo.gcaba.gob.ar.ArchivoEmbebidoDTO[] getListaArchivosEmbebidos() {
        return listaArchivosEmbebidos;
    }


    /**
     * Sets the listaArchivosEmbebidos value for this RequestExternalGenerarTarea.
     * 
     * @param listaArchivosEmbebidos
     */
    public void setListaArchivosEmbebidos(generartarea.external.services.satra.gedo.gcaba.gob.ar.ArchivoEmbebidoDTO[] listaArchivosEmbebidos) {
        this.listaArchivosEmbebidos = listaArchivosEmbebidos;
    }

    public generartarea.external.services.satra.gedo.gcaba.gob.ar.ArchivoEmbebidoDTO getListaArchivosEmbebidos(int i) {
        return this.listaArchivosEmbebidos[i];
    }

    public void setListaArchivosEmbebidos(int i, generartarea.external.services.satra.gedo.gcaba.gob.ar.ArchivoEmbebidoDTO _value) {
        this.listaArchivosEmbebidos[i] = _value;
    }


    /**
     * Gets the listaUsuariosDestinatarios value for this RequestExternalGenerarTarea.
     * 
     * @return listaUsuariosDestinatarios
     */
    public java.lang.String[] getListaUsuariosDestinatarios() {
        return listaUsuariosDestinatarios;
    }


    /**
     * Sets the listaUsuariosDestinatarios value for this RequestExternalGenerarTarea.
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
     * Gets the listaUsuariosDestinatariosCopia value for this RequestExternalGenerarTarea.
     * 
     * @return listaUsuariosDestinatariosCopia
     */
    public java.lang.String[] getListaUsuariosDestinatariosCopia() {
        return listaUsuariosDestinatariosCopia;
    }


    /**
     * Sets the listaUsuariosDestinatariosCopia value for this RequestExternalGenerarTarea.
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
     * Gets the listaUsuariosDestinatariosCopiaOculta value for this RequestExternalGenerarTarea.
     * 
     * @return listaUsuariosDestinatariosCopiaOculta
     */
    public java.lang.String[] getListaUsuariosDestinatariosCopiaOculta() {
        return listaUsuariosDestinatariosCopiaOculta;
    }


    /**
     * Sets the listaUsuariosDestinatariosCopiaOculta value for this RequestExternalGenerarTarea.
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
     * Gets the listaUsuariosDestinatariosExternos value for this RequestExternalGenerarTarea.
     * 
     * @return listaUsuariosDestinatariosExternos
     */
    public generartarea.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarTareaListaUsuariosDestinatariosExternosEntry[] getListaUsuariosDestinatariosExternos() {
        return listaUsuariosDestinatariosExternos;
    }


    /**
     * Sets the listaUsuariosDestinatariosExternos value for this RequestExternalGenerarTarea.
     * 
     * @param listaUsuariosDestinatariosExternos
     */
    public void setListaUsuariosDestinatariosExternos(generartarea.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarTareaListaUsuariosDestinatariosExternosEntry[] listaUsuariosDestinatariosExternos) {
        this.listaUsuariosDestinatariosExternos = listaUsuariosDestinatariosExternos;
    }


    /**
     * Gets the mensaje value for this RequestExternalGenerarTarea.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this RequestExternalGenerarTarea.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }


    /**
     * Gets the mensajeDestinatario value for this RequestExternalGenerarTarea.
     * 
     * @return mensajeDestinatario
     */
    public java.lang.String getMensajeDestinatario() {
        return mensajeDestinatario;
    }


    /**
     * Sets the mensajeDestinatario value for this RequestExternalGenerarTarea.
     * 
     * @param mensajeDestinatario
     */
    public void setMensajeDestinatario(java.lang.String mensajeDestinatario) {
        this.mensajeDestinatario = mensajeDestinatario;
    }


    /**
     * Gets the metaDatos value for this RequestExternalGenerarTarea.
     * 
     * @return metaDatos
     */
    public generartarea.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarTareaMetaDatosEntry[] getMetaDatos() {
        return metaDatos;
    }


    /**
     * Sets the metaDatos value for this RequestExternalGenerarTarea.
     * 
     * @param metaDatos
     */
    public void setMetaDatos(generartarea.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarTareaMetaDatosEntry[] metaDatos) {
        this.metaDatos = metaDatos;
    }


    /**
     * Gets the recibirAvisoFirma value for this RequestExternalGenerarTarea.
     * 
     * @return recibirAvisoFirma
     */
    public boolean isRecibirAvisoFirma() {
        return recibirAvisoFirma;
    }


    /**
     * Sets the recibirAvisoFirma value for this RequestExternalGenerarTarea.
     * 
     * @param recibirAvisoFirma
     */
    public void setRecibirAvisoFirma(boolean recibirAvisoFirma) {
        this.recibirAvisoFirma = recibirAvisoFirma;
    }


    /**
     * Gets the referencia value for this RequestExternalGenerarTarea.
     * 
     * @return referencia
     */
    public java.lang.String getReferencia() {
        return referencia;
    }


    /**
     * Sets the referencia value for this RequestExternalGenerarTarea.
     * 
     * @param referencia
     */
    public void setReferencia(java.lang.String referencia) {
        this.referencia = referencia;
    }


    /**
     * Gets the sistemaIniciador value for this RequestExternalGenerarTarea.
     * 
     * @return sistemaIniciador
     */
    public java.lang.String getSistemaIniciador() {
        return sistemaIniciador;
    }


    /**
     * Sets the sistemaIniciador value for this RequestExternalGenerarTarea.
     * 
     * @param sistemaIniciador
     */
    public void setSistemaIniciador(java.lang.String sistemaIniciador) {
        this.sistemaIniciador = sistemaIniciador;
    }


    /**
     * Gets the suscribirseAlDocumento value for this RequestExternalGenerarTarea.
     * 
     * @return suscribirseAlDocumento
     */
    public java.lang.Boolean getSuscribirseAlDocumento() {
        return suscribirseAlDocumento;
    }


    /**
     * Sets the suscribirseAlDocumento value for this RequestExternalGenerarTarea.
     * 
     * @param suscribirseAlDocumento
     */
    public void setSuscribirseAlDocumento(java.lang.Boolean suscribirseAlDocumento) {
        this.suscribirseAlDocumento = suscribirseAlDocumento;
    }


    /**
     * Gets the tarea value for this RequestExternalGenerarTarea.
     * 
     * @return tarea
     */
    public java.lang.String getTarea() {
        return tarea;
    }


    /**
     * Sets the tarea value for this RequestExternalGenerarTarea.
     * 
     * @param tarea
     */
    public void setTarea(java.lang.String tarea) {
        this.tarea = tarea;
    }


    /**
     * Gets the tipoArchivo value for this RequestExternalGenerarTarea.
     * 
     * @return tipoArchivo
     */
    public java.lang.String getTipoArchivo() {
        return tipoArchivo;
    }


    /**
     * Sets the tipoArchivo value for this RequestExternalGenerarTarea.
     * 
     * @param tipoArchivo
     */
    public void setTipoArchivo(java.lang.String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }


    /**
     * Gets the usuarioEmisor value for this RequestExternalGenerarTarea.
     * 
     * @return usuarioEmisor
     */
    public java.lang.String getUsuarioEmisor() {
        return usuarioEmisor;
    }


    /**
     * Sets the usuarioEmisor value for this RequestExternalGenerarTarea.
     * 
     * @param usuarioEmisor
     */
    public void setUsuarioEmisor(java.lang.String usuarioEmisor) {
        this.usuarioEmisor = usuarioEmisor;
    }


    /**
     * Gets the usuarioFirmante value for this RequestExternalGenerarTarea.
     * 
     * @return usuarioFirmante
     */
    public generartarea.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarTareaUsuarioFirmanteEntry[] getUsuarioFirmante() {
        return usuarioFirmante;
    }


    /**
     * Sets the usuarioFirmante value for this RequestExternalGenerarTarea.
     * 
     * @param usuarioFirmante
     */
    public void setUsuarioFirmante(generartarea.external.services.satra.gedo.gcaba.gob.ar.RequestExternalGenerarTareaUsuarioFirmanteEntry[] usuarioFirmante) {
        this.usuarioFirmante = usuarioFirmante;
    }


    /**
     * Gets the usuarioReceptor value for this RequestExternalGenerarTarea.
     * 
     * @return usuarioReceptor
     */
    public java.lang.String getUsuarioReceptor() {
        return usuarioReceptor;
    }


    /**
     * Sets the usuarioReceptor value for this RequestExternalGenerarTarea.
     * 
     * @param usuarioReceptor
     */
    public void setUsuarioReceptor(java.lang.String usuarioReceptor) {
        this.usuarioReceptor = usuarioReceptor;
    }


    /**
     * Gets the usuarioRevisor value for this RequestExternalGenerarTarea.
     * 
     * @return usuarioRevisor
     */
    public java.lang.String getUsuarioRevisor() {
        return usuarioRevisor;
    }


    /**
     * Sets the usuarioRevisor value for this RequestExternalGenerarTarea.
     * 
     * @param usuarioRevisor
     */
    public void setUsuarioRevisor(java.lang.String usuarioRevisor) {
        this.usuarioRevisor = usuarioRevisor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RequestExternalGenerarTarea)) return false;
        RequestExternalGenerarTarea other = (RequestExternalGenerarTarea) obj;
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
            this.enviarCorreoReceptor == other.isEnviarCorreoReceptor() &&
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
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje()))) &&
            ((this.mensajeDestinatario==null && other.getMensajeDestinatario()==null) || 
             (this.mensajeDestinatario!=null &&
              this.mensajeDestinatario.equals(other.getMensajeDestinatario()))) &&
            ((this.metaDatos==null && other.getMetaDatos()==null) || 
             (this.metaDatos!=null &&
              java.util.Arrays.equals(this.metaDatos, other.getMetaDatos()))) &&
            this.recibirAvisoFirma == other.isRecibirAvisoFirma() &&
            ((this.referencia==null && other.getReferencia()==null) || 
             (this.referencia!=null &&
              this.referencia.equals(other.getReferencia()))) &&
            ((this.sistemaIniciador==null && other.getSistemaIniciador()==null) || 
             (this.sistemaIniciador!=null &&
              this.sistemaIniciador.equals(other.getSistemaIniciador()))) &&
            ((this.suscribirseAlDocumento==null && other.getSuscribirseAlDocumento()==null) || 
             (this.suscribirseAlDocumento!=null &&
              this.suscribirseAlDocumento.equals(other.getSuscribirseAlDocumento()))) &&
            ((this.tarea==null && other.getTarea()==null) || 
             (this.tarea!=null &&
              this.tarea.equals(other.getTarea()))) &&
            ((this.tipoArchivo==null && other.getTipoArchivo()==null) || 
             (this.tipoArchivo!=null &&
              this.tipoArchivo.equals(other.getTipoArchivo()))) &&
            ((this.usuarioEmisor==null && other.getUsuarioEmisor()==null) || 
             (this.usuarioEmisor!=null &&
              this.usuarioEmisor.equals(other.getUsuarioEmisor()))) &&
            ((this.usuarioFirmante==null && other.getUsuarioFirmante()==null) || 
             (this.usuarioFirmante!=null &&
              java.util.Arrays.equals(this.usuarioFirmante, other.getUsuarioFirmante()))) &&
            ((this.usuarioReceptor==null && other.getUsuarioReceptor()==null) || 
             (this.usuarioReceptor!=null &&
              this.usuarioReceptor.equals(other.getUsuarioReceptor()))) &&
            ((this.usuarioRevisor==null && other.getUsuarioRevisor()==null) || 
             (this.usuarioRevisor!=null &&
              this.usuarioRevisor.equals(other.getUsuarioRevisor())));
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
        _hashCode += (isEnviarCorreoReceptor() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
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
        _hashCode += (isRecibirAvisoFirma() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getReferencia() != null) {
            _hashCode += getReferencia().hashCode();
        }
        if (getSistemaIniciador() != null) {
            _hashCode += getSistemaIniciador().hashCode();
        }
        if (getSuscribirseAlDocumento() != null) {
            _hashCode += getSuscribirseAlDocumento().hashCode();
        }
        if (getTarea() != null) {
            _hashCode += getTarea().hashCode();
        }
        if (getTipoArchivo() != null) {
            _hashCode += getTipoArchivo().hashCode();
        }
        if (getUsuarioEmisor() != null) {
            _hashCode += getUsuarioEmisor().hashCode();
        }
        if (getUsuarioFirmante() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsuarioFirmante());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsuarioFirmante(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUsuarioReceptor() != null) {
            _hashCode += getUsuarioReceptor().hashCode();
        }
        if (getUsuarioRevisor() != null) {
            _hashCode += getUsuarioRevisor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RequestExternalGenerarTarea.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "requestExternalGenerarTarea"));
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
        elemField.setFieldName("enviarCorreoReceptor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enviarCorreoReceptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", "archivoEmbebidoDTO"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", ">>requestExternalGenerarTarea>listaUsuariosDestinatariosExternos>entry"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", ">>requestExternalGenerarTarea>metaDatos>entry"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recibirAvisoFirma");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recibirAvisoFirma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("sistemaIniciador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sistemaIniciador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suscribirseAlDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "suscribirseAlDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tarea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tarea"));
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
        elemField.setFieldName("usuarioEmisor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioEmisor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioFirmante");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioFirmante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ar.gob.gcaba.gedo.satra.services.external.generartarea/", ">>requestExternalGenerarTarea>usuarioFirmante>entry"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioReceptor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioReceptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioRevisor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioRevisor"));
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
