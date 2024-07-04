/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fdxsoft.beans;

/**
 *
 * @author Lic. Federico Martinez E.
 * @date 20 mar 2021
 */
public class RFCRequest {

    // <editor-fold defaultstate="collapsed" desc="Fields">
    private String usr;
    private String pwd;
    private String url;
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Access Methods">
    /**
     * @return the usr
     */
    public String getUsr() {
        return usr;
    }

    /**
     * @param usr the usr to set
     */
    public void setUsr(String usr) {
        this.usr = usr;
    }

    /**
     * @return the pwd
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * @param pwd the pwd to set
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }
    // </editor-fold>

}
