/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.toedter.calendar.JDateChooser;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;

/**
 *
 * @author ALEJO
 */
public class viewRegistrarEmpleado extends javax.swing.JInternalFrame {

    /**
     * Creates new form RegistrarPersona
     */
    public viewRegistrarEmpleado() {
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

        bggenero = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        lblfoto = new javax.swing.JLabel();
        btagregarfoto = new javax.swing.JButton();
        txttelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btfemenino = new javax.swing.JRadioButton();
        btmasculino = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        calendarFechanacimiento = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtcontra = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        txtconfirmacontra = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        comborol = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        btregistrar = new javax.swing.JButton();
        btcancelar = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPcuidador = new javax.swing.JPanel();
        combosangre = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jPzsecretaria = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jSexperiencia = new javax.swing.JSpinner();
        jPgerente = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jPzoologo = new javax.swing.JPanel();
        comborama = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBorder(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setText("REGISTRO DE PERSONAL");

        lblfoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btagregarfoto.setText("AGREGAR FOTO");

        txttelefono.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txttelefono.setToolTipText("INGRESE LA CONTRASEÑA");
        txttelefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("CORREO:");

        txtcorreo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtcorreo.setToolTipText("INGRESE LA CONTRASEÑA");
        txtcorreo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("GENERO:");

        bggenero.add(btfemenino);
        btfemenino.setText("FEMENINO");

        bggenero.add(btmasculino);
        btmasculino.setText("MASCULINO");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("FECHA DE NACIMIENTO:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("CEDULA: ");

        txtcedula.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtcedula.setToolTipText("INGRESE LA CONTRASEÑA");
        txtcedula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("NOMBRE:");

        txtnombre.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtnombre.setToolTipText("INGRESE LA CONTRASEÑA");
        txtnombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("APELLIDO:");

        txtapellido.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtapellido.setToolTipText("INGRESE LA CONTRASEÑA");
        txtapellido.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("TELEFONO:");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("USUARIO:");

        txtusuario.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtusuario.setToolTipText("INGRESE LA CONTRASEÑA");
        txtusuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("CONTRASEÑA:");

        txtcontra.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("CONFIRMAR:");

        txtconfirmacontra.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("REGISTRO DE USUARIO");

        comborol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar rol" }));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("ROL:");

        btregistrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btregistrar.setText("REGISTRARSE");

        btcancelar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btcancelar.setText("CANCELAR");

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText("DATOS ACERCA DEL ROL");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        combosangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el tipo de sangre", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("TIPO DE SANGRE:");

        javax.swing.GroupLayout jPcuidadorLayout = new javax.swing.GroupLayout(jPcuidador);
        jPcuidador.setLayout(jPcuidadorLayout);
        jPcuidadorLayout.setHorizontalGroup(
            jPcuidadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPcuidadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combosangre, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPcuidadorLayout.setVerticalGroup(
            jPcuidadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPcuidadorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPcuidadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combosangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addContainerGap())
        );

        jPanel2.add(jPcuidador, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 270, 30));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel18.setText("AÑOS DE EXPERIENCIA:");

        javax.swing.GroupLayout jPzsecretariaLayout = new javax.swing.GroupLayout(jPzsecretaria);
        jPzsecretaria.setLayout(jPzsecretariaLayout);
        jPzsecretariaLayout.setHorizontalGroup(
            jPzsecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPzsecretariaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSexperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        jPzsecretariaLayout.setVerticalGroup(
            jPzsecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPzsecretariaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPzsecretariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jSexperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPzsecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 270, 30));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("TITULO:");

        txtTitulo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtTitulo.setToolTipText("INGRESE LA CONTRASEÑA");
        txtTitulo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPgerenteLayout = new javax.swing.GroupLayout(jPgerente);
        jPgerente.setLayout(jPgerenteLayout);
        jPgerenteLayout.setHorizontalGroup(
            jPgerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPgerenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPgerenteLayout.setVerticalGroup(
            jPgerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPgerenteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPgerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPgerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 81, 270, 30));

        comborama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar la rama", "Sistemática o taxonomía", "Zoogeografía", "Paleozoología", "Filogenia", "Parasitología", "Mastozoología", "Ictiología", "Entomología", "Melacología" }));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel17.setText("RAMA:");

        javax.swing.GroupLayout jPzoologoLayout = new javax.swing.GroupLayout(jPzoologo);
        jPzoologo.setLayout(jPzoologoLayout);
        jPzoologoLayout.setHorizontalGroup(
            jPzoologoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPzoologoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comborama, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPzoologoLayout.setVerticalGroup(
            jPzoologoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPzoologoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPzoologoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comborama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap())
        );

        jPanel2.add(jPzoologo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 270, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calendarFechanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btfemenino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btmasculino)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(comborol, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btagregarfoto)
                                    .addGap(15, 15, 15))
                                .addComponent(lblfoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(70, 70, 70))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(344, 344, 344)
                                                .addComponent(jLabel16))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel13)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtconfirmacontra, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel11)
                                                            .addComponent(jLabel12))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(txtcontra)
                                                            .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(78, 78, 78))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btregistrar)
                                                .addGap(55, 55, 55)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(btcancelar)))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(btfemenino)
                            .addComponent(btmasculino)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btagregarfoto)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(calendarFechanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comborol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)))
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel16))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtconfirmacontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btregistrar)
                    .addComponent(btcancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bggenero;
    private javax.swing.JButton btagregarfoto;
    private javax.swing.JButton btcancelar;
    private javax.swing.JRadioButton btfemenino;
    private javax.swing.JRadioButton btmasculino;
    private javax.swing.JButton btregistrar;
    private com.toedter.calendar.JDateChooser calendarFechanacimiento;
    private javax.swing.JComboBox<String> comborama;
    private javax.swing.JComboBox<String> comborol;
    private javax.swing.JComboBox<String> combosangre;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPcuidador;
    private javax.swing.JPanel jPgerente;
    private javax.swing.JPanel jPzoologo;
    private javax.swing.JPanel jPzsecretaria;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSexperiencia;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JPasswordField txtconfirmacontra;
    private javax.swing.JPasswordField txtcontra;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

    public ButtonGroup getBggenero() {
        return bggenero;
    }

    public void setBggenero(ButtonGroup bggenero) {
        this.bggenero = bggenero;
    }

    public JButton getBtagregarfoto() {
        return btagregarfoto;
    }

    public void setBtagregarfoto(JButton btagregarfoto) {
        this.btagregarfoto = btagregarfoto;
    }

    public JButton getBtcancelar() {
        return btcancelar;
    }

    public void setBtcancelar(JButton btcancelar) {
        this.btcancelar = btcancelar;
    }

    public JRadioButton getBtfemenino() {
        return btfemenino;
    }

    public void setBtfemenino(JRadioButton btfemenino) {
        this.btfemenino = btfemenino;
    }

    public JRadioButton getBtmasculino() {
        return btmasculino;
    }

    public void setBtmasculino(JRadioButton btmasculino) {
        this.btmasculino = btmasculino;
    }

    public JButton getBtregistrar() {
        return btregistrar;
    }

    public void setBtregistrar(JButton btregistrar) {
        this.btregistrar = btregistrar;
    }

    public JDateChooser getCalendarFechanacimiento() {
        return calendarFechanacimiento;
    }

    public void setCalendarFechanacimiento(JDateChooser calendarFechanacimiento) {
        this.calendarFechanacimiento = calendarFechanacimiento;
    }

    public JComboBox<String> getComborama() {
        return comborama;
    }

    public void setComborama(JComboBox<String> comborama) {
        this.comborama = comborama;
    }

    public JComboBox<String> getComborol() {
        return comborol;
    }

    public void setComborol(JComboBox<String> comborol) {
        this.comborol = comborol;
    }

    public JComboBox<String> getCombosangre() {
        return combosangre;
    }

    public void setCombosangre(JComboBox<String> combosangre) {
        this.combosangre = combosangre;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JPanel getjPcuidador() {
        return jPcuidador;
    }

    public void setjPcuidador(JPanel jPcuidador) {
        this.jPcuidador = jPcuidador;
    }

    public JPanel getjPgerente() {
        return jPgerente;
    }

    public void setjPgerente(JPanel jPgerente) {
        this.jPgerente = jPgerente;
    }

    public JPanel getjPzoologo() {
        return jPzoologo;
    }

    public void setjPzoologo(JPanel jPzoologo) {
        this.jPzoologo = jPzoologo;
    }

    public JPanel getjPzsecretaria() {
        return jPzsecretaria;
    }

    public void setjPzsecretaria(JPanel jPzsecretaria) {
        this.jPzsecretaria = jPzsecretaria;
    }

    public JSpinner getjSexperiencia() {
        return jSexperiencia;
    }

    public void setjSexperiencia(JSpinner jSexperiencia) {
        this.jSexperiencia = jSexperiencia;
    }

    public JLabel getLblfoto() {
        return lblfoto;
    }

    public void setLblfoto(JLabel lblfoto) {
        this.lblfoto = lblfoto;
    }

    public JTextField getTxtTitulo() {
        return txtTitulo;
    }

    public void setTxtTitulo(JTextField txtTitulo) {
        this.txtTitulo = txtTitulo;
    }

    public JTextField getTxtapellido() {
        return txtapellido;
    }

    public void setTxtapellido(JTextField txtapellido) {
        this.txtapellido = txtapellido;
    }

    public JTextField getTxtcedula() {
        return txtcedula;
    }

    public void setTxtcedula(JTextField txtcedula) {
        this.txtcedula = txtcedula;
    }

    public JPasswordField getTxtconfirmacontra() {
        return txtconfirmacontra;
    }

    public void setTxtconfirmacontra(JPasswordField txtconfirmacontra) {
        this.txtconfirmacontra = txtconfirmacontra;
    }

    public JPasswordField getTxtcontra() {
        return txtcontra;
    }

    public void setTxtcontra(JPasswordField txtcontra) {
        this.txtcontra = txtcontra;
    }

    public JTextField getTxtcorreo() {
        return txtcorreo;
    }

    public void setTxtcorreo(JTextField txtcorreo) {
        this.txtcorreo = txtcorreo;
    }

    public JTextField getTxtnombre() {
        return txtnombre;
    }

    public void setTxtnombre(JTextField txtnombre) {
        this.txtnombre = txtnombre;
    }

    public JTextField getTxttelefono() {
        return txttelefono;
    }

    public void setTxttelefono(JTextField txttelefono) {
        this.txttelefono = txttelefono;
    }

    public JTextField getTxtusuario() {
        return txtusuario;
    }

    public void setTxtusuario(JTextField txtusuario) {
        this.txtusuario = txtusuario;
    }

    

}
