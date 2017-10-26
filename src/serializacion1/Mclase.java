
package serializacion1;

import java.io.Serializable;

/**
 *
 * @author jquesadaabeijon
 */
public class Mclase implements Serializable{
    String nombre;
    transient int numero1;
    double numero2;

    public Mclase() {
    }

    public Mclase(String nombre, int numero1, double numero2) {
        this.nombre = nombre;
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Object1: " + "s=" + nombre + "; i=" + numero1 + "; d=" + numero2;
    }
    
    
}
