/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;
import javax.swing.JTextField;

/**
 *
 * @author ALEJO
 */
public class viewLogin extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public viewLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtusuarioingreso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btiniciarsesion = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btregistrarse = new javax.swing.JButton();
        txtcontraingreso = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel2.setText("CONTRASEÑA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setText("USUARIO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        txtusuarioingreso.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtusuarioingreso.setToolTipText("INGRESE LA CONTRASEÑA");
        txtusuarioingreso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txtusuarioingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 270, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contra.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 200, -1));

        btiniciarsesion.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btiniciarsesion.setText("INICIAR SESION");
        btiniciarsesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(btiniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(532, 110, 230, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("NO TIENES CUENTA AUN?");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, -1, -1));

        btregistrarse.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btregistrarse.setText("REGISTRATE");
        btregistrarse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btregistrarse.setBorderPainted(false);
        btregistrarse.setContentAreaFilled(false);
        getContentPane().add(btregistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 170, 110, -1));

        txtcontraingreso.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtcontraingreso.setToolTipText("INGRESA TU CONTRASEÑA");
        getContentPane().add(txtcontraingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 320, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    public JButton getBtiniciarsesion() {
        return btiniciarsesion;
    }

    public void setBtiniciarsesion(JButton btiniciarsesion) {
        this.btiniciarsesion = btiniciarsesion;
    }

    public JButton getBtregistrarse() {
        return btregistrarse;
    }

    public void setBtregistrarse(JButton btregistrarse) {
        this.btregistrarse = btregistrarse;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JPasswordField getTxtcontraingreso() {
        return txtcontraingreso;
    }

    public void setTxtcontraingreso(JPasswordField txtcontraingreso) {
        this.txtcontraingreso = txtcontraingreso;
    }

    public JTextField getTxtusuarioingreso() {
        return txtusuarioingreso;
    }

    public void setTxtusuarioingreso(JTextField txtusuarioingreso) {
        this.txtusuarioingreso = txtusuarioingreso;
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btiniciarsesion;
    private javax.swing.JButton btregistrarse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtcontraingreso;
    private javax.swing.JTextField txtusuarioingreso;
    // End of variables declaration//GEN-END:variables
}