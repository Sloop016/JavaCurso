/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer2.entidad;

/**
 *
 * @author gabyg
 */
public class Revolver {
    
    private int posActual;
    private int posAgua;

    public Revolver() {
    }

    public Revolver(int posActual, int posAgua) {
        this.posActual = posActual;
        this.posAgua = posAgua;
    }

    public int getPosActual() {
        return posActual;
    }

    public void setPosActual(int posActual) {
        this.posActual = posActual;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "posActual=" + posActual + ", posAgua=" + posAgua + '}';
    }
    
}
