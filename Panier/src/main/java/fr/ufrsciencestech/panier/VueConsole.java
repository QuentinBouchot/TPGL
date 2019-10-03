/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ufrsciencestech.panier;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author qb157136
 */
public class VueConsole implements Observer{
    
    private String trace;
    
    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   public VueConsole(){
       trace="";
   }
    
    public String getTrace(){
        return this.trace;
    }
    
    public void setTrace(String t){
        this.trace = t;
    }
    
}
