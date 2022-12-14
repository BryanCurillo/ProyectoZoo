/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;

/**
 *
 * @author ALEJO
 */
public class viewConsultarFacturas extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaUsuarios
     */
    public viewConsultarFacturas() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblFactura = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jBtnBuscar = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        txtBuscar = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        jBtnImprimir = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        jSeparator8 = new javax.swing.JToolBar.Separator();
        jBtnImprimirReporte = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(144, 183, 125));
        setBorder(null);
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(970, 654));
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/documento.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 40, 70, 40));

        jLabel3.setBackground(new java.awt.Color(250, 112, 112));
        jLabel3.setFont(new java.awt.Font("MS Gothic", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(250, 112, 112));
        jLabel3.setText("CONSULTA DE FACTURAS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 38, -1, -1));

        jLabel4.setFont(new java.awt.Font("MS Gothic", 1, 48)); // NOI18N
        jLabel4.setText("CONSULTA DE FACTURAS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, -1, -1));

        jTblFactura.setBackground(new java.awt.Color(255, 253, 227));
        jTblFactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.", "Fecha", "Cedula", "Nombre", "Telefono", "Correo", "Direccion", "Items", "Cantidad", "SubTotal", "Descuento %", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblFactura.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTblFactura.setGridColor(new java.awt.Color(51, 51, 51));
        jTblFactura.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jTblFactura.setShowGrid(false);
        jScrollPane1.setViewportView(jTblFactura);
        if (jTblFactura.getColumnModel().getColumnCount() > 0) {
            jTblFactura.getColumnModel().getColumn(0).setResizable(false);
            jTblFactura.getColumnModel().getColumn(0).setPreferredWidth(35);
            jTblFactura.getColumnModel().getColumn(1).setResizable(false);
            jTblFactura.getColumnModel().getColumn(1).setPreferredWidth(60);
            jTblFactura.getColumnModel().getColumn(2).setResizable(false);
            jTblFactura.getColumnModel().getColumn(2).setPreferredWidth(65);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 178, 940, 410));

        jToolBar1.setBackground(new java.awt.Color(210, 215, 159));
        jToolBar1.setBorder(null);
        jToolBar1.add(jSeparator2);
        jToolBar1.add(jSeparator3);
        jToolBar1.add(jSeparator4);

        jBtnBuscar.setBackground(new java.awt.Color(210, 215, 159));
        jBtnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar (2).png"))); // NOI18N
        jBtnBuscar.setText("BUSCAR");
        jBtnBuscar.setBorder(null);
        jBtnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jToolBar1.add(jBtnBuscar);
        jToolBar1.add(jSeparator6);

        txtBuscar.setBackground(new java.awt.Color(255, 253, 227));
        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtBuscar.setToolTipText("PUEDE BUSCAR MEDIANTE CEDULA, NOMBRE, APELLIDO O USUARIO");
        jToolBar1.add(txtBuscar);
        jToolBar1.add(jSeparator5);

        jBtnImprimir.setBackground(new java.awt.Color(210, 215, 159));
        jBtnImprimir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/documento.png"))); // NOI18N
        jBtnImprimir.setText("VER DETALLE");
        jBtnImprimir.setBorder(null);
        jBtnImprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnImprimir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBtnImprimir);
        jToolBar1.add(jSeparator7);
        jToolBar1.add(jSeparator8);

        jBtnImprimirReporte.setBackground(new java.awt.Color(210, 215, 159));
        jBtnImprimirReporte.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnImprimirReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir.png"))); // NOI18N
        jBtnImprimirReporte.setText("IMPRIMIR REPORTE");
        jBtnImprimirReporte.setBorder(null);
        jBtnImprimirReporte.setFocusable(false);
        jBtnImprimirReporte.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnImprimirReporte.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBtnImprimirReporte);

        getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 115, 930, 50));

        jLabel1.setBackground(new java.awt.Color(210, 215, 159));
        jLabel1.setFont(new java.awt.Font("Lucida Console", 1, 12)); // NOI18N
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(970, 630));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBuscar;
    private javax.swing.JButton jBtnImprimir;
    private javax.swing.JButton jBtnImprimirReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar.Separator jSeparator8;
    private javax.swing.JTable jTblFactura;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    public JButton getjBtnBuscar() {
        return jBtnBuscar;
    }

    public void setjBtnBuscar(JButton jBtnBuscar) {
        this.jBtnBuscar = jBtnBuscar;
    }

    public JButton getjBtnImprimir() {
        return jBtnImprimir;
    }

    public void setjBtnImprimir(JButton jBtnImprimir) {
        this.jBtnImprimir = jBtnImprimir;
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

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JToolBar.Separator getjSeparator2() {
        return jSeparator2;
    }

    public void setjSeparator2(JToolBar.Separator jSeparator2) {
        this.jSeparator2 = jSeparator2;
    }

    public JToolBar.Separator getjSeparator3() {
        return jSeparator3;
    }

    public void setjSeparator3(JToolBar.Separator jSeparator3) {
        this.jSeparator3 = jSeparator3;
    }

    public JToolBar.Separator getjSeparator4() {
        return jSeparator4;
    }

    public void setjSeparator4(JToolBar.Separator jSeparator4) {
        this.jSeparator4 = jSeparator4;
    }

    public JToolBar.Separator getjSeparator5() {
        return jSeparator5;
    }

    public void setjSeparator5(JToolBar.Separator jSeparator5) {
        this.jSeparator5 = jSeparator5;
    }

    public JToolBar.Separator getjSeparator6() {
        return jSeparator6;
    }

    public void setjSeparator6(JToolBar.Separator jSeparator6) {
        this.jSeparator6 = jSeparator6;
    }

    public JTable getjTblFactura() {
        return jTblFactura;
    }

    public void setjTblFactura(JTable jTblFactura) {
        this.jTblFactura = jTblFactura;
    }

    public JToolBar getjToolBar1() {
        return jToolBar1;
    }

    public void setjToolBar1(JToolBar jToolBar1) {
        this.jToolBar1 = jToolBar1;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }

    public JButton getjBtnImprimirReporte() {
        return jBtnImprimirReporte;
    }

    public void setjBtnImprimirReporte(JButton jBtnImprimirReporte) {
        this.jBtnImprimirReporte = jBtnImprimirReporte;
    }


    
}
