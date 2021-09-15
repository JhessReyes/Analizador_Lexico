/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador.lexico;

/**
 *
 * @author Essau Riveiro
 */
public class Output {
    private String TipoError;
    private String descrip;

    public Output(String TipoError, String descrip) {
        this.TipoError = TipoError;
        this.descrip = descrip;
    }

    public String getTipoError() {
        return TipoError;
    }

    public void setTipoError(String TipoError) {
        this.TipoError = TipoError;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    
    
}
