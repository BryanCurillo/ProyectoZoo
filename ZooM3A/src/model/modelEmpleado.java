/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Image;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

/**
 *
 * @author Bryan
 */
public class modelEmpleado extends Empleado {

    modelPGconexion mpgc = new modelPGconexion();

    public modelEmpleado() {
    }

    public modelEmpleado(int id, String telefono, Date fechanacimiento, int rol, String usuario, String contraseña, String cedula, String genero, Image foto, FileInputStream imageFile, int tamano) {
        super(id, telefono, fechanacimiento, rol, usuario, contraseña, cedula, genero, foto, imageFile, tamano);
    }

//    public boolean setPersona() {
//        String sql = "INSERT INTO persona (per_cedula, per_nombre, per_apellido, per_fecha_registro)"
//                + "values('" + getCedula() + "','" + getNombre() + "','" + getApellido() + "','" + getFechaRegistro() + "');";
//        return mpgc.accion(sql);//EJECUTAMOS EN INSERT
//    }
    public boolean setFotoEmpleado() {
        String sql;
        sql = "INSERT INTO empleado(emp_telefono, emp_foto, emp_fechanacimiento, emp_rol, emp_genero, emp_usuario, emp_contraseña, emp_cedula)";
        sql += "VALUES(?,?,?,?,?,?,?,?)";
        try {

            PreparedStatement ps = mpgc.con.prepareStatement(sql);
            ps.setString(1, getTelefono());
            ps.setBinaryStream(2, getImageFile(), getTamano());
            ps.setDate(3, (java.sql.Date) getFechanacimiento());
            ps.setInt(4, getRol());
            ps.setString(5, getGenero());
            ps.setString(6, getUsuario());
            ps.setString(7, getContraseña());
            ps.setString(8, getCedula());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public List<rol> getroles() {
        List<rol> listaRoles = new ArrayList<>();
        String sql = "select rol_id, rol_nombre from rol";
        ResultSet rs = mpgc.consulta(sql);
        try {
            while (rs.next()) {
                rol mirol = new rol();
                mirol.setIdRol(rs.getInt(1));
                mirol.setNombre(rs.getString(2));
                listaRoles.add(mirol);
            }
        } catch (SQLException e) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaRoles;
    }

    public int obtenerCodigo(String cedula) {
        int codigo = 0;
        String sql = "select emp_id from empleado where emp_cedula = '" + cedula + "'";
        ResultSet rs = mpgc.consulta(sql);
        try {
            while (rs.next()) {
                codigo = rs.getInt(1);                
            }
        } catch (SQLException e) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return codigo;
    }
    
        public String obtenerRol(int codigo) {
        String rol = "";
        String sql = "select rol_nombre from rol where rol_id="+codigo;
        ResultSet rs = mpgc.consulta(sql);
        try {
            while (rs.next()) {
                rol = rs.getString(1);  
                System.out.println("="+rol);
            }
        } catch (SQLException e) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, e);
        }
        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rol;
    }

    private Image getImagen(byte[] bytes) throws IOException {
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        Iterator it = ImageIO.getImageReadersByFormatName("jpeg");
        ImageReader imageReader = (ImageReader) it.next();
        Object source = bais;
        ImageInputStream fis = ImageIO.createImageInputStream(source);
        imageReader.setInput(fis, true);
        ImageReadParam param = imageReader.getDefaultReadParam();
        param.setSourceSubsampling(1, 1, 0, 0);
        return imageReader.read(0, param);
    }

    public List<Empleado> getempleado() {
        List<Empleado> listaEmpleado = new ArrayList<>();

        String sql = "select * from persona join empleado on(per_cedula=emp_cedula)";
        ResultSet rs = mpgc.consulta(sql);
        byte[] bytea;
        try {
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setCedula(rs.getString(1));
                empleado.setNombre(rs.getString(2));
                empleado.setApellido(rs.getString(3));
                empleado.setFechaRegistro(rs.getDate(4));
                empleado.setIdEmp(rs.getInt(5));
                empleado.setTelefono(rs.getString(6));
                bytea = rs.getBytes(7);
                if (bytea != null) {
                    empleado.setFoto(getImagen(bytea));
                }
                empleado.setFechanacimiento(rs.getDate(8));
                empleado.setRol(rs.getInt(9));
                empleado.setGenero(rs.getString(10));
                empleado.setUsuario(rs.getString(11));
                empleado.setContraseña(rs.getString(12));
                empleado.setCedulaEmp(rs.getString(13));

                listaEmpleado.add(empleado);

            }
        } catch (IOException | SQLException e) {
            Logger.getLogger(modelPGconexion.class.getName()).log(Level.SEVERE, null, e);
        }

        try {
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaEmpleado;
    }

}
