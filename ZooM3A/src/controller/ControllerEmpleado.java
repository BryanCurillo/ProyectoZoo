/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.modelEmpleado;
import view.viewPantallaPrincipal;
import view.viewVistaEmpleados;
import view.viewRegistrarEmpleado;
import model.modelPersona;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.Empleado;
import model.modelCuidador;
import model.modelGerente;
import model.modelSecretaria;
import model.modelZoologo;
import model.rol;
/**
 *
 * @author ALEJO
 */
public class ControllerEmpleado {

    viewPantallaPrincipal pp = new viewPantallaPrincipal();
    private modelEmpleado modeloE;
    private modelPersona modeloP;
    private viewRegistrarEmpleado vista;
    private viewVistaEmpleados vistaE;
    private JFileChooser jfc;
    int i=0;
    DefaultTableModel estructuraTabla;
    SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");

    public ControllerEmpleado(modelEmpleado modelo, viewRegistrarEmpleado vista) {
        this.modeloE = modelo;
        this.vista = vista;
        
        cargarComboRol();
        desactivarDatosRol();
        vista.setVisible(true);
    }

    public ControllerEmpleado(modelEmpleado modeloE, viewRegistrarEmpleado vista, viewVistaEmpleados vistaE) {
        this.modeloE = modeloE;
        this.vista = vista;
        this.vistaE = vistaE;
//        desactivarDatosRol();
        cargarDatos(1);
        vistaE.setVisible(true);
    }



    public void inicialControl() {

        vista.getComborol().addActionListener(l -> activarDatosRol());
        vista.getBtagregarfoto().addActionListener(l -> examinarFoto());
        vista.getBtregistrar().addActionListener(l -> crearEditarPersona());
    }

    public void examinarFoto() {
        jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado = jfc.showOpenDialog(vista);
        if (estado == JFileChooser.APPROVE_OPTION) {
            try {
                Image imagen = ImageIO.read(jfc.getSelectedFile()).getScaledInstance(
                        vista.getLblfoto().getWidth(),
                        vista.getLblfoto().getHeight(),
                        Image.SCALE_DEFAULT);
                Icon icono = new ImageIcon(imagen);
                vista.getLblfoto().setIcon(icono);
                vista.getLblfoto().updateUI();
            } catch (IOException ex) {
                Logger.getLogger(ControllerEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void cargarComboRol() {
        List<rol> listaRol = modeloE.getroles();
        listaRol.stream().forEach(r -> {
            vista.getComborol().addItem(r.getNombre());
        });
    }

    public void cargarDatos(int opc) {
        vistaE.getjTblEmpleado().setDefaultRenderer(Object.class, new imageTable());
        vistaE.getjTblEmpleado().setRowHeight(60);
        estructuraTabla = (DefaultTableModel) vistaE.getjTblEmpleado().getModel();
        estructuraTabla.setRowCount(0);
        List<Empleado> listaE;
//        if (opc == 1) {
            listaE = modeloE.getempleado();
//        } 
//        else {
////            String busqueda = vista.getTxt_buscar().getText().toLowerCase().trim();
////            listaE = modelo.busquedaIncrementalPersona(busqueda);
//        }

//        Holder<Integer> i = new Holder<>(0);
        i=0;
        listaE.stream().sorted((x, y)
                -> x.getCedula().compareToIgnoreCase(y.getCedula())).forEach(emp -> {
            estructuraTabla.addRow(new Object[8]);
            vistaE.getjTblEmpleado().setValueAt(emp.getIdEmp(), i, 0);
            vistaE.getjTblEmpleado().setValueAt(emp.getCedula(), i, 1);
            vistaE.getjTblEmpleado().setValueAt(emp.getNombre(), i, 2);
            vistaE.getjTblEmpleado().setValueAt(emp.getApellido(), i, 3);
            vistaE.getjTblEmpleado().setValueAt(emp.getTelefono(), i, 4);
            vistaE.getjTblEmpleado().setValueAt(emp.getFechanacimiento().toString(), i, 5);
            vistaE.getjTblEmpleado().setValueAt(emp.getGenero(), i, 6);
            vistaE.getjTblEmpleado().setValueAt(modeloE.obtenerRol(emp.getRol()), i, 7);
            vistaE.getjTblEmpleado().setValueAt(emp.getUsuario(), i, 8);
            vistaE.getjTblEmpleado().setValueAt(emp.getContraseña(), i, 9);
            vistaE.getjTblEmpleado().setValueAt(emp.getFechaRegistro().toString(), i, 10);            
            
            Image foto = emp.getFoto();
            if (foto != null) {
                foto = foto.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
                ImageIcon icono = new ImageIcon(foto);

                DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer();
                dtcr.setIcon(icono);
                vistaE.getjTblEmpleado().setValueAt(new JLabel(icono), i, 11);
            } else {
                vistaE.getjTblEmpleado().setValueAt(null, i, 8);
            }
            i++;
        });
    }

    private void crearEditarPersona() {
        if (vista.getName().equals("Registro")) {
            //INSERT
            if (validar()) {
                int response = JOptionPane.showConfirmDialog(vista, "¿Agregar persona?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.YES_OPTION) {
                    //DatosPersona
                    String cedula = vista.getTxtcedula().getText(),
                            nombre = vista.getTxtnombre().getText(),
                            apellido = vista.getTxtapellido().getText();
                    Date fechaRegistro = java.sql.Date.valueOf(LocalDate.now());

                    modelPersona persona = new modelPersona();
                    persona.setCedula(cedula);
                    persona.setNombre(nombre);
                    persona.setApellido(apellido);
                    persona.setFechaRegistro(fechaRegistro);

                    //Empleado
                    String telefono = vista.getTxttelefono().getText(),
                            usuario = vista.getTxtusuario().getText(),
                            contrasena = vista.getTxtcontra().getText(),
                            cedulaemp = vista.getTxtcedula().getText(),
                            genero = null;
                    int rol = vista.getComborol().getSelectedIndex();
                    Date date = vista.getCalendarFechanacimiento().getDate(); //vista es la interfaz, jDate el JDatechooser
                    long d = date.getTime(); //guardamos en un long el tiempo
                    java.sql.Date fechanacimiento = new java.sql.Date(d);// parseamos al formato del sql  

                    if (vista.getBtmasculino().isSelected()) {
                        genero = "Masculino";
                    } else {
                        if (vista.getBtfemenino().isSelected()) {
                            genero = "Femenino";
                        } else {
                            JOptionPane.showMessageDialog(vista, "Elija un sexo");
                        }
                    }
                    modelEmpleado empleado = new modelEmpleado();
                    empleado.setTelefono(telefono);
                    empleado.setFechanacimiento(fechanacimiento);
                    empleado.setGenero(genero);
                    empleado.setUsuario(usuario);
                    empleado.setContraseña(contrasena);
                    empleado.setCedula(cedulaemp);
                    empleado.setRol(rol);

                    try {
                        FileInputStream img = new FileInputStream(jfc.getSelectedFile());
                        int largo = (int) jfc.getSelectedFile().length();
                        empleado.setImageFile(img);
                        empleado.setTamano(largo);

                    } catch (IOException ex) {
                        Logger.getLogger(ControllerEmpleado.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    //...........
//                if (persona.setPersona()) {//Grabamos
                    if (persona.setPersona() && empleado.setFotoEmpleado()) {//Grabamos
                        int opc = vista.getComborol().getSelectedIndex();
                        switch (opc) {
                            case 1:
                                //Gerente
                                String titulo = vista.getTxtTitulo().getText();
                                modelGerente gerente = new modelGerente();
                                gerente.setIdEmpleado(empleado.obtenerCodigo(cedulaemp));
                                gerente.setTitulo(titulo);
                                gerente.setGerente();
                                JOptionPane.showMessageDialog(vista, "Gerente agregado/a correctamente");
                                break;
                            case 2:
                                int experiencia = (int) vista.getjSexperiencia().getValue();
                                modelSecretaria secretaria = new modelSecretaria();
                                secretaria.setIdEmpleado(empleado.obtenerCodigo(cedulaemp));
                                secretaria.setExperiencia(experiencia);
                                secretaria.setSecretaria();
                                JOptionPane.showMessageDialog(vista, "Secretaria agregado/a correctamente");
                                break;
                            case 3:
                                //Zoologo
                                String rama = vista.getComborama().getSelectedItem().toString();
                                modelZoologo zoologo = new modelZoologo();
                                zoologo.setIdEmpleadoZoo(empleado.obtenerCodigo(cedulaemp));
                                zoologo.setRama(rama);
                                zoologo.setZoologo();
                                JOptionPane.showMessageDialog(vista, "Zoologo agregado/a correctamente");
                                break;
                            case 4:
                                String tipoSangre = vista.getCombosangre().getSelectedItem().toString();
                                modelCuidador cuidador = new modelCuidador();
                                cuidador.setIdEmpleado(empleado.obtenerCodigo(cedulaemp));
                                cuidador.setTipoSangre(tipoSangre);
                                cuidador.seCuidador();
                                JOptionPane.showMessageDialog(vista, "Cuidador agregado/a correctamente");
                                break;
                        }
                        limpiarCampos();
                        vista.dispose();
                    } else {
                        JOptionPane.showMessageDialog(vista, "No se pudo agregar a la persona");
                    }
                }
            }
        } else {
            //UPDATE
//            String idPersona = vista.getTxtIdPersona().getText(),
//                    nombres = vista.getTxtNombres().getText(),
//                    apellidos = vista.getTxtApellidos().getText(),
//                    telefono = vista.getTxtTelefono().getText(),
//                    sexo = null;
//            if (vista.getRbMasculino().isSelected()) {
//                sexo = "Masculino";
//            } else {
//                if (vista.getRbFemenino().isSelected()) {
//                    sexo = "Femenino";
//                } else {
//                    JOptionPane.showMessageDialog(vista, "Elija un sexo");
//                }
//            }
//            double sueldo = Double.parseDouble(vista.getTxtSueldo().getText());
//            int cupo = Integer.parseInt(vista.getSpCupo().getValue().toString());
//
//            Date date = vista.getCldFechaNacimiento().getDate(); //ic es la interfaz, jDate el JDatechooser
//            long d = date.getTime(); //guardamos en un long el tiempo
//            java.sql.Date fecha = new java.sql.Date(d);// parseamos al formato del sql  
//
//            model_persona persona = new model_persona();
//            persona.setIdPersona(idPersona);
//            persona.setNombres(nombres);
//            persona.setApellidos(apellidos);
//            persona.setFechanacimiento(fecha);
//            persona.setTelefono(telefono);
//            persona.setSexo(sexo);
//            persona.setSueldo(sueldo);
//            persona.setCupo(cupo);
//            int opcUp = 1;
////            if (jfc.getSelectedFile() != null) {
//            try {
//                FileInputStream img = new FileInputStream(jfc.getSelectedFile());
//                int largo = (int) jfc.getSelectedFile().length();
//                persona.setImageFile(img);
//                persona.setTamano(largo);
//            } catch (IOException ex) {
//                Logger.getLogger(controller_persona.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (NullPointerException e) {
//                opcUp = 0;
//                System.out.println("no hay foto" + opcUp);
//            }
////            }
//
//            int response = JOptionPane.showConfirmDialog(vista, "¿Seguro que desea actualizar a la persona?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//            if (response == JOptionPane.YES_OPTION) {
//                if (opcUp == 1 && persona.updateFotoPersona()) {//Actualizamos
//                    JOptionPane.showMessageDialog(vista, "Persona actualizada correctamente");
//                    vista.getDlgCrud().setVisible(false);
//                    cargarDatos(1);
//                    System.out.println("SI FOTO");
//                } else {
//                    System.out.println("NO FOTO" + opcUp);
//                    if (persona.updatePersona()) {//Actualizamos
//                        JOptionPane.showMessageDialog(vista, "Persona actualizada correctamente");
//                        vista.getDlgCrud().setVisible(false);
//                        cargarDatos(1);
//                    } else {
//                        JOptionPane.showMessageDialog(vista, "No se pudo actualizada a la persona");
//                    }
//                }
//            }
        }
    }

    public void desactivarDatosRol() {
        vista.getjPcuidador().setVisible(false);
        vista.getjPgerente().setVisible(false);
        vista.getjPzoologo().setVisible(false);
        vista.getjPzsecretaria().setVisible(false);
    }

    public void activarDatosRol() {
        desactivarDatosRol();
        int opc = vista.getComborol().getSelectedIndex();
        switch (opc) {
            case 1 ->
                vista.getjPgerente().setVisible(true);
            case 2 ->
                vista.getjPzsecretaria().setVisible(true);
            case 3 ->
                vista.getjPzoologo().setVisible(true);
            case 4 ->
                vista.getjPcuidador().setVisible(true);
        }
    }

    public boolean validar() {
        boolean ban = true;
        validaciones mivalidacion = new validaciones();
        //DNI
        if (!vista.getTxtcedula().getText().isEmpty()) {
            if (!mivalidacion.validarCedula(vista.getTxtcedula().getText())) {
                JOptionPane.showMessageDialog(vista, "Cedula invalida");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Ingrese la cedula");
            ban = false;
        }
        //NOMBRE
        if (!vista.getTxtnombre().getText().isEmpty()) {
            if (!mivalidacion.validarNombApeEspacios(vista.getTxtnombre().getText())) {
                JOptionPane.showMessageDialog(vista, "Nombre invalido");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Ingrese el nombre");
            ban = false;
        }
        //APELLIDO
        if (!vista.getTxtapellido().getText().isEmpty()) {
            if (!mivalidacion.validarNombApeEspacios(vista.getTxtapellido().getText())) {
                JOptionPane.showMessageDialog(vista, "Apellido invalida");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Ingrese el Apellido");
            ban = false;
        }
        //TELEFONO
        if (!vista.getTxttelefono().getText().isEmpty()) {
            if (!mivalidacion.validarTelefono(vista.getTxttelefono().getText())) {
                JOptionPane.showMessageDialog(vista, "Telefono invalido");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Ingrese el numero de telefono");
            ban = false;
        }
        //CORREO
        if (!vista.getTxtcorreo().getText().isEmpty()) {
            if (!mivalidacion.validarCorreo(vista.getTxtcorreo().getText())) {
                JOptionPane.showMessageDialog(vista, "Correo invalido");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Ingrese un correo electronico");
            ban = false;
        }
        //GENERO
        if (!vista.getBtmasculino().isSelected() && !vista.getBtfemenino().isSelected()) {
            ban = false;
            JOptionPane.showMessageDialog(vista, "Seleccione un genero");
        }
        //FECHANACIMIENTO
        if (vista.getCalendarFechanacimiento().getDate() == null) {
            ban = false;
            JOptionPane.showMessageDialog(vista, "Ingrese la fecha de nacimiento");
        }
        //ROL
        if (vista.getComborol().getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(vista, "Seleccione el rol");
            ban = false;
        }
        //USUARIO
        if (!vista.getTxtusuario().getText().isEmpty()) {
            if (!mivalidacion.validarUsuario(vista.getTxtusuario().getText())) {
                JOptionPane.showMessageDialog(vista, "Usuario invalido");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Ingrese un usuario");
            ban = false;
        }
        //CONTRASEÑA
        if (!vista.getTxtcontra().getText().isEmpty()) {
            if (mivalidacion.validarContrasena(vista.getTxtcontra().getText())) {
                if (!vista.getTxtconfirmacontra().getText().isEmpty()) {
                    if (!vista.getTxtcontra().getText().equals(vista.getTxtconfirmacontra().getText())) {
                        JOptionPane.showMessageDialog(vista, "La contraseña de confirmacion no coincide");
                        ban = false;
                    }
                } else {
                    JOptionPane.showMessageDialog(vista, "Confirmar contraseña");
                    ban = false;
                }
            } else {
                JOptionPane.showMessageDialog(vista, "Contraseñá invalida");
                ban = false;
            }
        } else {
            JOptionPane.showMessageDialog(vista, "Ingrese su contraseña");
            ban = false;
        }
        //DATOS ROL
        int opc = vista.getComborol().getSelectedIndex();
        switch (opc) {
            case 1:
                //TITULO
                if (!vista.getTxtTitulo().getText().isEmpty()) {
                    if (!mivalidacion.validarNombApeEspacios(vista.getTxtcedula().getText())) {
                        JOptionPane.showMessageDialog(vista, "titulo invalida");
                        ban = false;
                    }
                } else {
                    JOptionPane.showMessageDialog(vista, "Ingrese el titulo");
                    ban = false;
                }
                break;
            case 2:
                //EXPERIENCIA
                if ((Integer) vista.getjSexperiencia().getValue() == 0) {
                    JOptionPane.showMessageDialog(vista, "Ingrese los años de experiencia");
                    ban = false;
                }
                break;
            case 3:
                //RAMA
                if (vista.getComborama().getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(vista, "Seleccione la rama");
                    ban = false;
                }
                break;
            case 4:
                //TIPOSANGRE
                if (vista.getCombosangre().getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(vista, "Seleccione la rama");
                    ban = false;
                }
                break;
        }
        System.out.println("BAN=" + ban);
        return ban;
    }

    public void limpiarCampos() {
        vista.getTxtcedula().setText("");
        vista.getTxtnombre().setText("");
        vista.getTxtapellido().setText("");
        vista.getTxttelefono().setText("");
        vista.getTxtcorreo().setText("");
        vista.getBtmasculino().setSelected(false);
        vista.getBtfemenino().setSelected(false);
        vista.getCalendarFechanacimiento().setDate(null);

        vista.getTxtusuario().setText("");
        vista.getTxtcontra().setText("");
        vista.getTxtconfirmacontra().setText("");
        vista.getTxtTitulo().setText("");

        vista.getLblfoto().setIcon(null);
        vista.getComborol().setSelectedIndex(0);
        vista.getComborama().setSelectedIndex(0);
        vista.getCombosangre().setSelectedIndex(0);
        vista.getjSexperiencia().setValue(0);

    }

}
