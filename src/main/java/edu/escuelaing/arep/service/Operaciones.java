package edu.escuelaing.arep.service;

/**
 * Interfaz de las operaciones solicitadas
 * @author Diego23p
 */
public interface Operaciones {
    
    /**
     * retorna el coseno
     * @param number numero a evaluar en radianes 
     * @return 
     */
    public double cos(double number);
    
    /**
     * retorna el seno
     * @param number numero a evaluar en radianes 
     * @return 
     */
    public double sin(double number);
    
    /**
     * retorna la tangente
     * @param number numero a evaluar en radianes 
     * @return 
     */
    public double tan(double number);
    
}
