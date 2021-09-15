/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador.lexico;

/**
 *
 * @author jhess
 */
public class Simbolos {
    private String Ide;
    private String Direc;
    private String Tipo;
    private String Decla;
    private int Scope;
    private int Dimension;
    
    public Simbolos(String Identificador, String Direccion, String Tipo, String Declarado, int Dimension,int Scope) {
        this.Ide = Identificador;
        this.Direc = Direccion;
        this.Tipo = Tipo;
        this.Decla = Declarado;
        this.Dimension = Dimension;
        this.Scope = Scope;
    }

    public String getIde() {
        return Ide;
    }

    public String getDirec() {
        return Direc;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getDecla() {
        return Decla;
    }

    public int getDimension() {
        return Dimension;
    }

    public void setIde(String Ide) {
        this.Ide = Ide;
    }

    public void setDirec(String Direc) {
        this.Direc = Direc;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setDecla(String Decla) {
        this.Decla = Decla;
    }

    public void setDimension(int Dimension) {
        this.Dimension = Dimension;
    }

    public int getScope() {
        return Scope;
    }

    public void setScope(int Scope) {
        this.Scope = Scope;
    }
    
    
    
}
