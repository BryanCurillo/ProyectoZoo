/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

/**
 *
 * @author ALEJO
 */
public class viewRegistroDieta extends javax.swing.JInternalFrame {

    /**
     * Creates new form viewRegistroDieta
     */
    public viewRegistroDieta() {
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

        DlgAlimento = new javax.swing.JDialog();
        lbltitulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabladlgAlimento = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jLabel9 = new javax.swing.JLabel();
        txtbuscardlgAlimento = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnseleccionardlgAlimento = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        DlgAnimal = new javax.swing.JDialog();
        lbltitulo1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabladlgAnimal = new javax.swing.JTable();
        jToolBar2 = new javax.swing.JToolBar();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jLabel10 = new javax.swing.JLabel();
        txtbuscardlgAnimal = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnseleccionardlgAnimal = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        txtidDietaNB = new javax.swing.JTextField();
        txtidAlimentoNB = new javax.swing.JTextField();
        txtidAnimalNB = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        combohoradieta = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        btnSeleccionarAliemento = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtnombrealiemento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAdescripcionAlimento = new javax.swing.JTextArea();
        txtporcion = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnagregardieta = new javax.swing.JButton();
        btncancelardieta = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        btnSeleccionarAnimal = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtnombreanimal = new javax.swing.JTextField();
        txtespecie = new javax.swing.JTextField();

        DlgAlimento.setSize(new java.awt.Dimension(545, 310));
        DlgAlimento.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltitulo.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lbltitulo.setText("SELECCIÓN DE ALIMENTO");
        DlgAlimento.getContentPane().add(lbltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        tabladlgAlimento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Descripcion"
            }
        ));
        jScrollPane2.setViewportView(tabladlgAlimento);
        if (tabladlgAlimento.getColumnModel().getColumnCount() > 0) {
            tabladlgAlimento.getColumnModel().getColumn(2).setHeaderValue("Descripcion");
        }

        DlgAlimento.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 470, 162));

        jToolBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar1.setFloatable(false);
        jToolBar1.add(jSeparator1);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("BUSCAR:  ");
        jToolBar1.add(jLabel9);
        jToolBar1.add(txtbuscardlgAlimento);
        jToolBar1.add(jSeparator2);

        btnseleccionardlgAlimento.setText("SELECCIONAR");
        jToolBar1.add(btnseleccionardlgAlimento);
        jToolBar1.add(jSeparator3);

        DlgAlimento.getContentPane().add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 460, -1));

        DlgAnimal.setSize(new java.awt.Dimension(545, 310));
        DlgAnimal.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbltitulo1.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lbltitulo1.setText("SELECCIÓN DE ANIMAL");
        DlgAnimal.getContentPane().add(lbltitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        tabladlgAnimal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Especie"
            }
        ));
        jScrollPane3.setViewportView(tabladlgAnimal);

        DlgAnimal.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 470, 162));

        jToolBar2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToolBar2.setFloatable(false);
        jToolBar2.add(jSeparator4);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("BUSCAR:  ");
        jToolBar2.add(jLabel10);
        jToolBar2.add(txtbuscardlgAnimal);
        jToolBar2.add(jSeparator5);

        btnseleccionardlgAnimal.setText("SELECCIONAR");
        jToolBar2.add(btnseleccionardlgAnimal);
        jToolBar2.add(jSeparator6);

        DlgAnimal.getContentPane().add(jToolBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 460, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setText("REGISTRO DE DIETA");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("HORARIO");

        combohoradieta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un horario", "\"05:00\"", "\"05:30\"", "\"06:00\"", "\"06:30\"", "\"07:00\"", "\"07:30\"", "\"08:00\"", "\"08:30\"", "\"09:00\"", "\"09:30\"", "\"10:00\"", "\"10:30\"", "\"11:00\"", "\"11:30\"", "\"12:00\"", "\"12:30\"", "\"13:00\"", "\"13:30\"", "\"14:00\"", "\"14:30\"", "\"15:00\"", "\"15:30\"", "\"16:00\"", "\"16:30\"", "\"17:00\"", "\"17:30\"", "\"18:00\"", "\"18:30\"", "\"19:00\"", "\"19:30\"", "\"20:00\"", "\"20:30\"", "\"21:00\"", "\"21:30\"", "\"22:00\"", "\"22:30\"", "\"23:00\"" }));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel16.setText("ALIMENTO");

        btnSeleccionarAliemento.setText("SELECCIONAR");

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("NOMBRE:");

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("DESCRIPCION:");

        txtAdescripcionAlimento.setColumns(20);
        txtAdescripcionAlimento.setRows(5);
        jScrollPane1.setViewportView(txtAdescripcionAlimento);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnombrealiemento))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSeleccionarAliemento))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeleccionarAliemento)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtnombrealiemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("PORCIÓN");

        btnagregardieta.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnagregardieta.setText("AGREGAR");

        btncancelardieta.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btncancelardieta.setText("CANCELAR");

        jLabel1.setText("kg.");

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("ANIMAL:");

        btnSeleccionarAnimal.setText("SELECCIONAR");

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("NOMBRE");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setText("ESPECIE:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnombreanimal))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeleccionarAnimal)
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtespecie)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeleccionarAnimal)
                    .addComponent(jLabel20))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtnombreanimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtespecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnagregardieta)
                .addGap(42, 42, 42)
                .addComponent(btncancelardieta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtporcion, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(combohoradieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(152, 152, 152))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(combohoradieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtporcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnagregardieta)
                            .addComponent(btncancelardieta))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(377, 377, 377)
                    .addComponent(txtidDietaNB, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36)
                    .addComponent(txtidAlimentoNB, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(37, 37, 37)
                    .addComponent(txtidAnimalNB, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(338, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(206, 206, 206)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtidDietaNB, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtidAlimentoNB, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtidAnimalNB, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(268, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog DlgAlimento;
    private javax.swing.JDialog DlgAnimal;
    private javax.swing.JButton btnSeleccionarAliemento;
    private javax.swing.JButton btnSeleccionarAnimal;
    private javax.swing.JButton btnagregardieta;
    private javax.swing.JButton btncancelardieta;
    private javax.swing.JButton btnseleccionardlgAlimento;
    private javax.swing.JButton btnseleccionardlgAnimal;
    private javax.swing.JComboBox<String> combohoradieta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JLabel lbltitulo1;
    private javax.swing.JTable tabladlgAlimento;
    private javax.swing.JTable tabladlgAnimal;
    private javax.swing.JTextArea txtAdescripcionAlimento;
    private javax.swing.JTextField txtbuscardlgAlimento;
    private javax.swing.JTextField txtbuscardlgAnimal;
    private javax.swing.JTextField txtespecie;
    private javax.swing.JTextField txtidAlimentoNB;
    private javax.swing.JTextField txtidAnimalNB;
    private javax.swing.JTextField txtidDietaNB;
    private javax.swing.JTextField txtnombrealiemento;
    private javax.swing.JTextField txtnombreanimal;
    private javax.swing.JTextField txtporcion;
    // End of variables declaration//GEN-END:variables

    public JDialog getDlgAlimento() {
        return DlgAlimento;
    }

    public void setDlgAlimento(JDialog DlgAlimento) {
        this.DlgAlimento = DlgAlimento;
    }

    public JDialog getDlgAnimal() {
        return DlgAnimal;
    }

    public void setDlgAnimal(JDialog DlgAnimal) {
        this.DlgAnimal = DlgAnimal;
    }

    public JButton getBtnSeleccionarAliemento() {
        return btnSeleccionarAliemento;
    }

    public void setBtnSeleccionarAliemento(JButton btnSeleccionarAliemento) {
        this.btnSeleccionarAliemento = btnSeleccionarAliemento;
    }

    public JButton getBtnSeleccionarAnimal() {
        return btnSeleccionarAnimal;
    }

    public void setBtnSeleccionarAnimal(JButton btnSeleccionarAnimal) {
        this.btnSeleccionarAnimal = btnSeleccionarAnimal;
    }

    public JButton getBtnagregardieta() {
        return btnagregardieta;
    }

    public void setBtnagregardieta(JButton btnagregardieta) {
        this.btnagregardieta = btnagregardieta;
    }

    public JButton getBtncancelardieta() {
        return btncancelardieta;
    }

    public void setBtncancelardieta(JButton btncancelardieta) {
        this.btncancelardieta = btncancelardieta;
    }

    public JButton getBtnseleccionardlgAlimento() {
        return btnseleccionardlgAlimento;
    }

    public void setBtnseleccionardlgAlimento(JButton btnseleccionardlgAlimento) {
        this.btnseleccionardlgAlimento = btnseleccionardlgAlimento;
    }

    public JButton getBtnseleccionardlgAnimal() {
        return btnseleccionardlgAnimal;
    }

    public void setBtnseleccionardlgAnimal(JButton btnseleccionardlgAnimal) {
        this.btnseleccionardlgAnimal = btnseleccionardlgAnimal;
    }

    public JComboBox<String> getCombohoradieta() {
        return combohoradieta;
    }

    public void setCombohoradieta(JComboBox<String> combohoradieta) {
        this.combohoradieta = combohoradieta;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel16() {
        return jLabel16;
    }

    public void setjLabel16(JLabel jLabel16) {
        this.jLabel16 = jLabel16;
    }

    public JLabel getjLabel17() {
        return jLabel17;
    }

    public void setjLabel17(JLabel jLabel17) {
        this.jLabel17 = jLabel17;
    }

    public JLabel getjLabel19() {
        return jLabel19;
    }

    public void setjLabel19(JLabel jLabel19) {
        this.jLabel19 = jLabel19;
    }

    public JLabel getjLabel20() {
        return jLabel20;
    }

    public void setjLabel20(JLabel jLabel20) {
        this.jLabel20 = jLabel20;
    }

    public JLabel getjLabel21() {
        return jLabel21;
    }

    public void setjLabel21(JLabel jLabel21) {
        this.jLabel21 = jLabel21;
    }

    public JLabel getjLabel23() {
        return jLabel23;
    }

    public void setjLabel23(JLabel jLabel23) {
        this.jLabel23 = jLabel23;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JScrollPane getjScrollPane3() {
        return jScrollPane3;
    }

    public void setjScrollPane3(JScrollPane jScrollPane3) {
        this.jScrollPane3 = jScrollPane3;
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

    public JToolBar getjToolBar1() {
        return jToolBar1;
    }

    public void setjToolBar1(JToolBar jToolBar1) {
        this.jToolBar1 = jToolBar1;
    }

    public JToolBar getjToolBar2() {
        return jToolBar2;
    }

    public void setjToolBar2(JToolBar jToolBar2) {
        this.jToolBar2 = jToolBar2;
    }

    public JLabel getLbltitulo() {
        return lbltitulo;
    }

    public void setLbltitulo(JLabel lbltitulo) {
        this.lbltitulo = lbltitulo;
    }

    public JLabel getLbltitulo1() {
        return lbltitulo1;
    }

    public void setLbltitulo1(JLabel lbltitulo1) {
        this.lbltitulo1 = lbltitulo1;
    }

    public JTable getTabladlgAlimento() {
        return tabladlgAlimento;
    }

    public void setTabladlgAlimento(JTable tabladlgAlimento) {
        this.tabladlgAlimento = tabladlgAlimento;
    }

    public JTable getTabladlgAnimal() {
        return tabladlgAnimal;
    }

    public void setTabladlgAnimal(JTable tabladlgAnimal) {
        this.tabladlgAnimal = tabladlgAnimal;
    }

    public JTextArea getTxtAdescripcionAlimento() {
        return txtAdescripcionAlimento;
    }

    public void setTxtAdescripcionAlimento(JTextArea txtAdescripcionAlimento) {
        this.txtAdescripcionAlimento = txtAdescripcionAlimento;
    }

    public JTextField getTxtbuscardlgAlimento() {
        return txtbuscardlgAlimento;
    }

    public void setTxtbuscardlgAlimento(JTextField txtbuscardlgAlimento) {
        this.txtbuscardlgAlimento = txtbuscardlgAlimento;
    }

    public JTextField getTxtbuscardlgAnimal() {
        return txtbuscardlgAnimal;
    }

    public void setTxtbuscardlgAnimal(JTextField txtbuscardlgAnimal) {
        this.txtbuscardlgAnimal = txtbuscardlgAnimal;
    }

    public JTextField getTxtespecie() {
        return txtespecie;
    }

    public void setTxtespecie(JTextField txtespecie) {
        this.txtespecie = txtespecie;
    }

    public JTextField getTxtidAlimentoNB() {
        return txtidAlimentoNB;
    }

    public void setTxtidAlimentoNB(JTextField txtidAlimentoNB) {
        this.txtidAlimentoNB = txtidAlimentoNB;
    }

    public JTextField getTxtidAnimalNB() {
        return txtidAnimalNB;
    }

    public void setTxtidAnimalNB(JTextField txtidAnimalNB) {
        this.txtidAnimalNB = txtidAnimalNB;
    }

    public JTextField getTxtidDietaNB() {
        return txtidDietaNB;
    }

    public void setTxtidDietaNB(JTextField txtidDietaNB) {
        this.txtidDietaNB = txtidDietaNB;
    }

    public JTextField getTxtnombrealiemento() {
        return txtnombrealiemento;
    }

    public void setTxtnombrealiemento(JTextField txtnombrealiemento) {
        this.txtnombrealiemento = txtnombrealiemento;
    }

    public JTextField getTxtnombreanimal() {
        return txtnombreanimal;
    }

    public void setTxtnombreanimal(JTextField txtnombreanimal) {
        this.txtnombreanimal = txtnombreanimal;
    }

    public JTextField getTxtporcion() {
        return txtporcion;
    }

    public void setTxtporcion(JTextField txtporcion) {
        this.txtporcion = txtporcion;
    }


}
