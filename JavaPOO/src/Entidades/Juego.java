/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author gabyg
 */
public class Juego {

    private int numeroX;
    private int intentosMax = 0;
    private int cont = 0;

    public Juego(int numeroX, int intentosMax) {
        this.numeroX = numeroX;
        this.intentosMax = intentosMax;
    }

    public void setNumeroX(int numeroX) {
        this.numeroX = numeroX;

    }

    public int getNumeroX() {
        return numeroX;
    }

    public int getIntentosMax() {
        return intentosMax;
    }

    public void setIntentosMax(int intentosMax) {
        this.intentosMax = intentosMax;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public void iniciar_juego(Juego juego) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Jugador 2 adivina el numero secreto!");
        do {
            int num = leer.nextInt();
            if (num != juego.getNumeroX()) {
                juego.setCont(cont += 1);
            } else {
                System.out.println("Adivinaste");
            }
        } while (juego.getCont() < juego.getIntentosMax());
        System.out.println("Se acabo el juego.");
    }
}