/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador.lexico;

import java.util.ArrayList;

/**
 *
 * @author jhess
 */
public class Declaraciones {
    private String Identificador;
    private ArrayList<String> Compatibilidad= new ArrayList<>();
    
    
    public Declaraciones(String Identificador, ArrayList<String> Compatibilidad){
        this.Identificador = Identificador;
        this.Compatibilidad = Compatibilidad;
    }

    public String getIdentificador() {
        return Identificador;
    }

    public ArrayList<String> getCompatibilidad() {
        return Compatibilidad;
    }

    public void setCompatibilidad(ArrayList<String> Compatibilidad) {
        this.Compatibilidad = Compatibilidad;
    }

    public void setIdentificador(String Identificador) {
        this.Identificador = Identificador;
    }
    
    
}
