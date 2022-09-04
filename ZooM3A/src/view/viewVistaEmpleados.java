/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;

/**
 *
 * @author ALEJO
 */
public class viewVistaEmpleados extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaUsuarios
     */
    public viewVistaEmpleados() {
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
        jTblEmpleado = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jbtnAgregar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jBtnModificar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jBtnElimina = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        jBtnImprimir = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jTextField1 = new javax.swing.JTextField();
        jCbFiltro = new javax.swing.JComboBox<>();
        jBtnBuscar = new javax.swing.JButton();

        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setText("VISTA DE EMPLEADOS");

        jTblEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Cedula", "Nombre", "Apellido", "Telefono", "Fecha de Nacimiento", "Genero", "Rol", "Usuario", "Contraseñá", "Fecha de Registro", "Foto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTblEmpleado);

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbtnAgregar.setText("AGREGAR");
        jbtnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jbtnAgregar);
        jToolBar1.add(jSeparator1);

        jBtnModificar.setText("MODIFICAR");
        jToolBar1.add(jBtnModificar);
        jToolBar1.add(jSeparator2);

        jBtnElimina.setText("ELIMINAR");
        jBtnElimina.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnElimina.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBtnElimina);
        jToolBar1.add(jSeparator3);

        jBtnImprimir.setText("IMPRIMIR REPORTE");
        jToolBar1.add(jBtnImprimir);
        jToolBar1.add(jSeparator4);

        jTextField1.setToolTipText("PUEDE BUSCAR MEDIANTE CEDULA, NOMBRE, APELLIDO O USUARIO");
        jToolBar1.add(jTextField1);

        jCbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jToolBar1.add(jCbFiltro);

        jBtnBuscar.setText("BUSCAR");
        jToolBar1.add(jBtnBuscar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel3)
                .addContainerGap(266, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3)
                .addGap(45, 45, 45)
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnBuscar;
    private javax.swing.JButton jBtnElimina;
    private javax.swing.JButton jBtnImprimir;
    private javax.swing.JButton jBtnModificar;
    private javax.swing.JComboBox<String> jCbFiltro;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JTable jTblEmpleado;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton jbtnAgregar;
    // End of variables declaration//GEN-END:variables

    public JButton getjBtnBuscar() {
        return jBtnBuscar;
    }

    public void setjBtnBuscar(JButton jBtnBuscar) {
        this.jBtnBuscar = jBtnBuscar;
    }

    public JButton getjBtnElimina() {
        return jBtnElimina;
    }

    public void setjBtnElimina(JButton jBtnElimina) {
        this.jBtnElimina = jBtnElimina;
    }

    public JButton getjBtnImprimir() {
        return jBtnImprimir;
    }

    public void setjBtnImprimir(JButton jBtnImprimir) {
        this.jBtnImprimir = jBtnImprimir;
    }

    public JButton getjBtnModificar() {
        return jBtnModificar;
    }

    public void setjBtnModificar(JButton jBtnModificar) {
        this.jBtnModificar = jBtnModificar;
    }

    public JComboBox<String> getjCbFiltro() {
        return jCbFiltro;
    }

    public void setjCbFiltro(JComboBox<String> jCbFiltro) {
        this.jCbFiltro = jCbFiltro;
    }

    public JTable getjTblEmpleado() {
        return jTblEmpleado;
    }

    public void setjTblEmpleado(JTable jTblEmpleado) {
        this.jTblEmpleado = jTblEmpleado;
    }

    public JButton getJbtnAgregar() {
        return jbtnAgregar;
    }

    public void setJbtnAgregar(JButton jbtnAgregar) {
        this.jbtnAgregar = jbtnAgregar;
    }

}
