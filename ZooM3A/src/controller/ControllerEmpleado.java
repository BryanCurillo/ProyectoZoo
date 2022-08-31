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
import view.PantallaPrincipal;
import view.RegistrarEmpleado;
import model.modelPersona;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import model.modelZoologo;
import model.rol;

/**
 *
 * @author ALEJO
 */
public class ControllerEmpleado {

    PantallaPrincipal pp = new PantallaPrincipal();
    private modelEmpleado modeloE;
    private modelPersona modeloP;
    private RegistrarEmpleado vista;
    private JFileChooser jfc;
    SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");

    public ControllerEmpleado(modelEmpleado modelo, RegistrarEmpleado vista) {
        this.modeloE = modelo;
        this.vista = vista;
        desactivarDatosRol();
        vista.setVisible(true);
    }

    public void inicialControl() {
        cargarComboRol();
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

    private void crearEditarPersona() {
        if (vista.getName().contentEquals("Registro")) {
            //INSERT

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
                            vista.getjPgerente().setVisible(true);
                            break;
                        case 2:
//                            vista.getjPzsecretaria().setVisible(true);
                            break;
                        case 3:
                            //Zoologo
                            String rama = vista.getComborama().getSelectedItem().toString();
                            modelZoologo zoologo = new modelZoologo();
                            zoologo.setIdEmpleadoZoo(empleado.obtenerCodigo(cedulaemp));
                            zoologo.setRama(rama);
                            zoologo.setZoologo();
                            JOptionPane.showMessageDialog(vista, "Persona agregada correctamente");
                            break;
                        case 4:

                            break;
                    }

                    vista.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(vista, "No se pudo agregar a la persona");
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
            case 1:
                vista.getjPgerente().setVisible(true);
                break;
            case 2:
                vista.getjPzsecretaria().setVisible(true);
                break;
            case 3:
                vista.getjPzoologo().setVisible(true);
                break;
            case 4:
                vista.getjPcuidador().setVisible(true);
                break;
        }
    }

}