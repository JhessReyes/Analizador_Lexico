/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador.lexico;

/**
 *
 * @author Essau Reyes Riveiro
 */
public class Registro {
    private String Registro;
    private String Codigo;

    public Registro(String Registro, String Codigo) {
        this.Registro = Registro;
        this.Codigo = Codigo;
    }

    public String getRegistro() {
        return Registro;
    }

    public void setRegistro(String Registro) {
        this.Registro = Registro;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    
    
    
}
