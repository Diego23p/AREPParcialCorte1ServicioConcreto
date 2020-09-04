package edu.escuelaing.arep.service.Impl;

import edu.escuelaing.arep.service.Operaciones;

/**
 * 
 * @author Diego23p
 */
public class OperacionesImpl implements Operaciones {

    @Override
    public double cos(double number) {
         return (double) Math.cos(number);
    }

    @Override
    public double sin(double number) {
        return (double) Math.sin(number);
    }

    @Override
    public double tan(double number) {
        return (double) Math.tan(number);
    }
    
}
