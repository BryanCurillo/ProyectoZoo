/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Bryan
 */
public class Cuidador {

    private int idSecretaria;
    private String tipoSangre;
    private int idEmpleado;

    public Cuidador() {
    }

    public Cuidador(int idSecretaria, String tipoSangre, int idEmpleado) {
        this.idSecretaria = idSecretaria;
        this.tipoSangre = tipoSangre;
        this.idEmpleado = idEmpleado;
    }

    public int getIdSecretaria() {
        return idSecretaria;
    }

    public void setIdSecretaria(int idSecretaria) {
        this.idSecretaria = idSecretaria;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

}