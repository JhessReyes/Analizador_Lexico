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
public class Tablas{

private String token;
private String lexema;

public Tablas(String token,String lexema) {
        this.token=token;
        this.lexema=lexema;
    }

    public String getToken() {
        return token;
    }

    public String getLexema() {
        return lexema;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }
    
}
