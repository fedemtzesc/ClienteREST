/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fdxsoft.cliente;

import com.fdxsoft.beans.RFCRequest;
import com.fdxsoft.beans.TaxPayer;
import com.fdxsoft.mail.FDXMessage;
import com.fdxsoft.mail.FDXTransport;
import com.fdxsoft.rest.NewJerseyClient;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author federico
 */
public class ClientGUI extends javax.swing.JFrame {

    /**
     * Creates new form ClientGUI
     */
    public ClientGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("FDXSOFT - CLIENTE DE PRUEBA DE CONSULTA DE DATOS FISCALES");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usr = new javax.swing.JTextField();
        url = new javax.swing.JTextField();
        btnRequestRFCData = new javax.swing.JButton();
        pwd = new javax.swing.JPasswordField();
        lblMsg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblRFC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Usuario :");
        jLabel1.setName(""); // NOI18N

        jLabel2.setText("Password :");

        jLabel3.setText("QR del CIF:");

        url.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                urlKeyPressed(evt);
            }
        });

        btnRequestRFCData.setText("Consultar Datos Fiscales");
        btnRequestRFCData.setFocusable(false);
        btnRequestRFCData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestRFCDataActionPerformed(evt);
            }
        });

        lblMsg.setForeground(new java.awt.Color(8, 43, 247));
        lblMsg.setText(".");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(pwd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(btnRequestRFCData))
                    .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(241, 241, 241))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnRequestRFCData)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(usr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(url, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(lblMsg))
        );

        jPanel2.setBackground(java.awt.Color.white);

        lblRFC.setBackground(java.awt.Color.white);
        lblRFC.setFont(new java.awt.Font("Courier 10 Pitch", 0, 13)); // NOI18N
        lblRFC.setForeground(java.awt.Color.black);
        lblRFC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(lblRFC, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Generated Code"> 
    // </editor-fold
    private boolean sendEmail(String sTO) {
        try {
            FDXMessage myMsg = new FDXMessage();
            FDXTransport myTR;

            myTR = new FDXTransport();
            myMsg.setFromName("Facturacion FDXSOFT SA de CV");
            //Parametros del envio
            myMsg.setTo(sTO);
            myMsg.setCc("fedemtzesc@yahoo.com.mx");
            myMsg.setBcc("fdx.soft.mx@gmail.com");
            myMsg.setSubject("Facturacion FDXSOFT SA de CV");
            myMsg.setBody("<h1 style='color:red'>Este es su comprobante CFDI por su pago</h1>");
            myMsg.addAttachment("/home/federico/Factura.pdf");
            myTR.sendMail(myMsg);
        } catch (Exception ex) {
            Logger.getLogger(ClientGUI.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

        System.out.println("Correo enviado con exito!");

        return true;
    }

    private void btnRequestRFCDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestRFCDataActionPerformed
        NewJerseyClient client = new NewJerseyClient();
        RFCRequest rfcReq = new RFCRequest();
        TaxPayer tp;
        String sOut = "";

        try {
            lblRFC.setText("");
            lblMsg.setText("Realizando busqueda... Espere un momento...");
            lblMsg.setForeground(Color.RED);
            lblMsg.paintImmediately(lblMsg.getVisibleRect());
            rfcReq.setPwd(String.valueOf(pwd.getPassword()));
            rfcReq.setUsr(usr.getText());
            rfcReq.setUrl(url.getText());

            if (!rfcReq.getUrl().contains("https://siat.sat.gob.mx/app/qr/faces/pages/mobile/validadorqr.jsf")) {
                JOptionPane.showMessageDialog(null, "Codigo de barras incorrecto!");
                url.setText("");
                return;
            }

            this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

            tp
                    = client.RFCInfoRequestJSON(rfcReq, TaxPayer.class
                    );
            if (tp.errMsg.equals("")) {
                sOut += "<html>";
                sOut += "<body style='font-weight:bold;'>";
                sOut += "<br/>**************************************************";
                sOut += "<br/>******************  DATOS FISCALES  ****************";
                sOut += "<br/>**************************************************";
                sOut += "<br/>RFC: " + tp.getRFC();
                sOut += "<br/>CURP: " + tp.getCURP();
                sOut += "<br/>Nombre: " + tp.getNOMBRE();
                sOut += "<br/>Apellido Paterno: " + tp.getAPELLIDO_PATERNO();
                sOut += "<br/>Apellido Materno: " + tp.getAPELLIDO_MATERNO();
                sOut += "<br/>Fecha de Nacimiento: " + tp.getFECHA_NACIMIENTO();
                sOut += "<br/>Fecha de Inicio de operaciones: " + tp.getFECHA_DE_INICIO_DE_OPERACIONES();
                sOut += "<br/>Situación del contribuyente: " + tp.getSITUACION_DEL_CONTRIBUYENTE();
                sOut += "<br/>Fecha del último cambio de situación: " + tp.getFECHA_DEL_ULTIMO_CAMBIO_DE_SITUACION();
                sOut += "<br/>Entidad Federativa: " + tp.getENTIDAD_FEDERATIVA();
                sOut += "<br/>Municipio o delegación: " + tp.getMUNICIPIO_O_DELEGACION();
                sOut += "<br/>Colonia: " + tp.getCOLONIA();
                sOut += "<br/>Tipo de vialidad: " + tp.getTIPO_DE_VIALIDAD();
                sOut += "<br/>Nombre de la vialidad: " + tp.getNOMBRE_DE_LA_VIALIDAD();
                sOut += "<br/>Número exterior: " + tp.getNUMERO_EXTERIOR();
                sOut += "<br/>Número interior: " + tp.getNUMERO_INTERIOR();
                sOut += "<br/>CP: " + tp.getCP();
                sOut += "<br/>Correo electrónico: " + tp.getCORREO_ELECTRONICO();
                sOut += "<br/>AL: " + tp.getAL();
                sOut += "<br/>Régimen: " + tp.getREGIMEN();
                sOut += "<br/>Fecha de alta: " + tp.getFECHA_DE_ALTA();
                sOut += "</body>";
                sOut += "</html>";

                lblRFC.setText(sOut);
                //Ahora procedemos a crear la factura
                Reporte rpt = new Reporte();

                if (rpt.CreateFactura(tp.getRFC())) {
                    if (sendEmail(tp.getCORREO_ELECTRONICO())) {
                        System.out.println("Factura enviada con exito por email!");
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, tp.errMsg);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            this.setCursor(Cursor.getDefaultCursor());
            lblMsg.setText("Busqueda terminada!");
            lblMsg.setForeground(Color.BLUE);
            url.requestFocus();

        }
    }//GEN-LAST:event_btnRequestRFCDataActionPerformed

    private void urlKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_urlKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnRequestRFCDataActionPerformed(null);
        }
    }//GEN-LAST:event_urlKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientGUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRequestRFCData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblRFC;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JTextField url;
    private javax.swing.JTextField usr;
    // End of variables declaration//GEN-END:variables
}
