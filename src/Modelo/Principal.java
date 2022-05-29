/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Control.Control;
import Vista.JFIglesia;

/**
 *
 * @author 57310
 */
public class Principal {
    public static void main(String[] args) {
        JFIglesia vista= new JFIglesia();
        Feligrese f= new Feligrese();
        Iglesia i= new Iglesia();
        Control control = new  Control(vista, f, i);
        vista.setVisible(true);
    }
    
}
