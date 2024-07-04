/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fdxsoft.beans;


import java.sql.ResultSet;

/**
 *
 * @author federico
 */
public class TaxPayer {

    

    // <editor-fold defaultstate="collapsed" desc="Fields">
    public String errMsg;
    private String RFC;
    private String CURP;
    private String NOMBRE;
    private String APELLIDO_PATERNO;
    private String APELLIDO_MATERNO;
    private String ENTIDAD_FEDERATIVA;
    private String FECHA_NACIMIENTO;
    private String FECHA_DE_INICIO_DE_OPERACIONES;
    private String SITUACION_DEL_CONTRIBUYENTE;
    private String FECHA_DEL_ULTIMO_CAMBIO_DE_SITUACION;
    private String MUNICIPIO_O_DELEGACION;
    private String COLONIA;
    private String TIPO_DE_VIALIDAD;
    private String NOMBRE_DE_LA_VIALIDAD;
    private String NUMERO_EXTERIOR;
    private String NUMERO_INTERIOR;
    private String CP;
    private String CORREO_ELECTRONICO;
    private String AL;
    private String REGIMEN;
    private String FECHA_DE_ALTA;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Access Methods">
    
    /**
     * @return the RFC
     */
    public String getRFC() {
        return RFC;
    }

    /**
     * @param RFC the RFC to set
     */
    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    /**
     * @return the CURP
     */
    public String getCURP() {
        return CURP;
    }

    /**
     * @param CURP the CURP to set
     */
    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    /**
     * @return the NOMBRE
     */
    public String getNOMBRE() {
        return NOMBRE;
    }

    /**
     * @param NOMBRE the NOMBRE to set
     */
    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    /**
     * @return the APELLIDO_PATERNO
     */
    public String getAPELLIDO_PATERNO() {
        return APELLIDO_PATERNO;
    }

    /**
     * @param APELLIDO_PATERNO the APELLIDO_PATERNO to set
     */
    public void setAPELLIDO_PATERNO(String APELLIDO_PATERNO) {
        this.APELLIDO_PATERNO = APELLIDO_PATERNO;
    }

    /**
     * @return the APELLIDO_MATERNO
     */
    public String getAPELLIDO_MATERNO() {
        return APELLIDO_MATERNO;
    }

    /**
     * @param APELLIDO_MATERNO the APELLIDO_MATERNO to set
     */
    public void setAPELLIDO_MATERNO(String APELLIDO_MATERNO) {
        this.APELLIDO_MATERNO = APELLIDO_MATERNO;
    }

    /**
     * @return the ENTIDAD_FEDERATIVA
     */
    public String getENTIDAD_FEDERATIVA() {
        return ENTIDAD_FEDERATIVA;
    }

    /**
     * @param ENTIDAD_FEDERATIVA the ENTIDAD_FEDERATIVA to set
     */
    public void setENTIDAD_FEDERATIVA(String ENTIDAD_FEDERATIVA) {
        this.ENTIDAD_FEDERATIVA = ENTIDAD_FEDERATIVA;
    }

    /**
     * @return the FECHA_NACIMIENTO
     */
    public String getFECHA_NACIMIENTO() {
        return FECHA_NACIMIENTO;
    }

    /**
     * @param FECHA_NACIMIENTO the FECHA_NACIMIENTO to set
     */
    public void setFECHA_NACIMIENTO(String FECHA_NACIMIENTO) {
        this.FECHA_NACIMIENTO = FECHA_NACIMIENTO;
    }

    /**
     * @return the FECHA_DE_INICIO_DE_OPERACIONES
     */
    public String getFECHA_DE_INICIO_DE_OPERACIONES() {
        return FECHA_DE_INICIO_DE_OPERACIONES;
    }

    /**
     * @param FECHA_DE_INICIO_DE_OPERACIONES the FECHA_DE_INICIO_DE_OPERACIONES
     * to set
     */
    public void setFECHA_DE_INICIO_DE_OPERACIONES(String FECHA_DE_INICIO_DE_OPERACIONES) {
        this.FECHA_DE_INICIO_DE_OPERACIONES = FECHA_DE_INICIO_DE_OPERACIONES;
    }

    /**
     * @return the SITUACION_DEL_CONTRIBUYENTE
     */
    public String getSITUACION_DEL_CONTRIBUYENTE() {
        return SITUACION_DEL_CONTRIBUYENTE;
    }

    /**
     * @param SITUACION_DEL_CONTRIBUYENTE the SITUACION_DEL_CONTRIBUYENTE to set
     */
    public void setSITUACION_DEL_CONTRIBUYENTE(String SITUACION_DEL_CONTRIBUYENTE) {
        this.SITUACION_DEL_CONTRIBUYENTE = SITUACION_DEL_CONTRIBUYENTE;
    }

    /**
     * @return the FECHA_DEL_ULTIMO_CAMBIO_DE_SITUACION
     */
    public String getFECHA_DEL_ULTIMO_CAMBIO_DE_SITUACION() {
        return FECHA_DEL_ULTIMO_CAMBIO_DE_SITUACION;
    }

    /**
     * @param FECHA_DEL_ULTIMO_CAMBIO_DE_SITUACION the
     * FECHA_DEL_ULTIMO_CAMBIO_DE_SITUACION to set
     */
    public void setFECHA_DEL_ULTIMO_CAMBIO_DE_SITUACION(String FECHA_DEL_ULTIMO_CAMBIO_DE_SITUACION) {
        this.FECHA_DEL_ULTIMO_CAMBIO_DE_SITUACION = FECHA_DEL_ULTIMO_CAMBIO_DE_SITUACION;
    }

    /**
     * @return the MUNICIPIO_O_DELEGACION
     */
    public String getMUNICIPIO_O_DELEGACION() {
        return MUNICIPIO_O_DELEGACION;
    }

    /**
     * @param MUNICIPIO_O_DELEGACION the MUNICIPIO_O_DELEGACION to set
     */
    public void setMUNICIPIO_O_DELEGACION(String MUNICIPIO_O_DELEGACION) {
        this.MUNICIPIO_O_DELEGACION = MUNICIPIO_O_DELEGACION;
    }

    /**
     * @return the COLONIA
     */
    public String getCOLONIA() {
        return COLONIA;
    }

    /**
     * @param COLONIA the COLONIA to set
     */
    public void setCOLONIA(String COLONIA) {
        this.COLONIA = COLONIA;
    }

    /**
     * @return the TIPO_DE_VIALIDAD
     */
    public String getTIPO_DE_VIALIDAD() {
        return TIPO_DE_VIALIDAD;
    }

    /**
     * @param TIPO_DE_VIALIDAD the TIPO_DE_VIALIDAD to set
     */
    public void setTIPO_DE_VIALIDAD(String TIPO_DE_VIALIDAD) {
        this.TIPO_DE_VIALIDAD = TIPO_DE_VIALIDAD;
    }

    /**
     * @return the NOMBRE_DE_LA_VIALIDAD
     */
    public String getNOMBRE_DE_LA_VIALIDAD() {
        return NOMBRE_DE_LA_VIALIDAD;
    }

    /**
     * @param NOMBRE_DE_LA_VIALIDAD the NOMBRE_DE_LA_VIALIDAD to set
     */
    public void setNOMBRE_DE_LA_VIALIDAD(String NOMBRE_DE_LA_VIALIDAD) {
        this.NOMBRE_DE_LA_VIALIDAD = NOMBRE_DE_LA_VIALIDAD;
    }

    /**
     * @return the NUMERO_EXTERIOR
     */
    public String getNUMERO_EXTERIOR() {
        return NUMERO_EXTERIOR;
    }

    /**
     * @param NUMERO_EXTERIOR the NUMERO_EXTERIOR to set
     */
    public void setNUMERO_EXTERIOR(String NUMERO_EXTERIOR) {
        this.NUMERO_EXTERIOR = NUMERO_EXTERIOR;
    }

    /**
     * @return the NUMERO_INTERIOR
     */
    public String getNUMERO_INTERIOR() {
        return NUMERO_INTERIOR;
    }

    /**
     * @param NUMERO_INTERIOR the NUMERO_INTERIOR to set
     */
    public void setNUMERO_INTERIOR(String NUMERO_INTERIOR) {
        this.NUMERO_INTERIOR = NUMERO_INTERIOR;
    }

    /**
     * @return the CP
     */
    public String getCP() {
        return CP;
    }

    /**
     * @param CP the CP to set
     */
    public void setCP(String CP) {
        this.CP = CP;
    }

    /**
     * @return the CORREO_ELECTRONICO
     */
    public String getCORREO_ELECTRONICO() {
        return CORREO_ELECTRONICO;
    }

    /**
     * @param CORREO_ELECTRONICO the CORREO_ELECTRONICO to set
     */
    public void setCORREO_ELECTRONICO(String CORREO_ELECTRONICO) {
        this.CORREO_ELECTRONICO = CORREO_ELECTRONICO;
    }

    /**
     * @return the AL
     */
    public String getAL() {
        return AL;
    }

    /**
     * @param AL the AL to set
     */
    public void setAL(String AL) {
        this.AL = AL;
    }

    /**
     * @return the REGIMEN
     */
    public String getREGIMEN() {
        return REGIMEN;
    }

    /**
     * @param REGIMEN the REGIMEN to set
     */
    public void setREGIMEN(String REGIMEN) {
        this.REGIMEN = REGIMEN;
    }

    /**
     * @return the FECHA_DE_ALTA
     */
    public String getFECHA_DE_ALTA() {
        return FECHA_DE_ALTA;
    }

    /**
     * @param FECHA_DE_ALTA the FECHA_DE_ALTA to set
     */
    public void setFECHA_DE_ALTA(String FECHA_DE_ALTA) {
        this.FECHA_DE_ALTA = FECHA_DE_ALTA;
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Methods">
    
    // </editor-fold>
}
