/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author Alexander
 */
public class TransporteAereo extends Transporte {
    private String aereo;
    
     public void establecerAereo(String n) {
        aereo = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 50.00;
    }

    public String obtenerAereo() {
        return aereo;
    }
}
