/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import javax.accessibility.AccessibleContext;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.event.EventListenerList;
import javax.swing.plaf.ComponentUI;

/**
 *
 * @author ASUS ROG
 */
public class viewVistaCliente extends javax.swing.JPanel {

    /**
     * Creates new form viewVistaAnimal
     */
    public viewVistaCliente() {
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

        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblCliente = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btnAgregarCliente = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        BtnModificarCliente = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnEliminarCliente = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jBtnImprimirCliente = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jTextField1 = new javax.swing.JTextField();
        jCbFiltro = new javax.swing.JComboBox<>();
        jBtnBuscarCliente = new javax.swing.JButton();
        jBtnActualizarCliente = new javax.swing.JButton();

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setText("VISTA DE CLIENTES");

        jTblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Cedula", "Nombre", "Apellido", "Correo", "Direccion", "Telefono", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTblCliente);

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnAgregarCliente.setText("AGREGAR");
        btnAgregarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnAgregarCliente);
        jToolBar1.add(jSeparator1);

        BtnModificarCliente.setText("MODIFICAR");
        jToolBar1.add(BtnModificarCliente);
        jToolBar1.add(jSeparator2);

        btnEliminarCliente.setText("ELIMINAR");
        btnEliminarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnEliminarCliente);
        jToolBar1.add(jSeparator3);

        jBtnImprimirCliente.setText("IMPRIMIR REPORTE");
        jToolBar1.add(jBtnImprimirCliente);
        jToolBar1.add(jSeparator4);

        jTextField1.setToolTipText("PUEDE BUSCAR MEDIANTE CEDULA, NOMBRE, APELLIDO O USUARIO");
        jToolBar1.add(jTextField1);

        jCbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jToolBar1.add(jCbFiltro);

        jBtnBuscarCliente.setText("BUSCAR");
        jToolBar1.add(jBtnBuscarCliente);

        jBtnActualizarCliente.setText("ACTUALIZAR");
        jBtnActualizarCliente.setFocusable(false);
        jBtnActualizarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnActualizarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBtnActualizarCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 840, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(48, 48, 48)
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnModificarCliente() {
        return BtnModificarCliente;
    }

    public void setBtnModificarCliente(JButton BtnModificarCliente) {
        this.BtnModificarCliente = BtnModificarCliente;
    }

    public JButton getBtnAgregarCliente() {
        return btnAgregarCliente;
    }

    public void setBtnAgregarCliente(JButton btnAgregarCliente) {
        this.btnAgregarCliente = btnAgregarCliente;
    }

    public JButton getBtnEliminarCliente() {
        return btnEliminarCliente;
    }

    public void setBtnEliminarCliente(JButton btnEliminarCliente) {
        this.btnEliminarCliente = btnEliminarCliente;
    }

    public JButton getjBtnActualizarCliente() {
        return jBtnActualizarCliente;
    }

    public void setjBtnActualizarCliente(JButton jBtnActualizarCliente) {
        this.jBtnActualizarCliente = jBtnActualizarCliente;
    }

    public JButton getjBtnBuscarCliente() {
        return jBtnBuscarCliente;
    }

    public void setjBtnBuscarCliente(JButton jBtnBuscarCliente) {
        this.jBtnBuscarCliente = jBtnBuscarCliente;
    }

    public JButton getjBtnImprimirCliente() {
        return jBtnImprimirCliente;
    }

    public void setjBtnImprimirCliente(JButton jBtnImprimirCliente) {
        this.jBtnImprimirCliente = jBtnImprimirCliente;
    }

    public JComboBox<String> getjCbFiltro() {
        return jCbFiltro;
    }

    public void setjCbFiltro(JComboBox<String> jCbFiltro) {
        this.jCbFiltro = jCbFiltro;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JToolBar.Separator getjSeparator1() {
        return jSeparator1;
    }

    public void setjSeparator1(JToolBar.Separator jSeparator1) {
        this.jSeparator1 = jSeparator1;
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

    public JTable getjTblCliente() {
        return jTblCliente;
    }

    public void setjTblCliente(JTable jTblCliente) {
        this.jTblCliente = jTblCliente;
    }

    public JTextField getjTextField1() {
        return jTextField1;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.jTextField1 = jTextField1;
    }

    public JToolBar getjToolBar1() {
        return jToolBar1;
    }

    public void setjToolBar1(JToolBar jToolBar1) {
        this.jToolBar1 = jToolBar1;
    }

    public ComponentUI getUi() {
        return ui;
    }

    public void setUi(ComponentUI ui) {
        this.ui = ui;
    }

    public EventListenerList getListenerList() {
        return listenerList;
    }

    public void setListenerList(EventListenerList listenerList) {
        this.listenerList = listenerList;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnModificarCliente;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnEliminarCliente;
    private javax.swing.JButton jBtnActualizarCliente;
    private javax.swing.JButton jBtnBuscarCliente;
    private javax.swing.JButton jBtnImprimirCliente;
    private javax.swing.JComboBox<String> jCbFiltro;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JTable jTblCliente;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
