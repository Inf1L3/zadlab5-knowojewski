/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

/**
 *
 * @author XsaRdaS
 */
public class Stos {

    private int wskaznik;
    private int a;
    int tab[] = new int[a];

    public Stos(int rozmiar) {
        this.a = a;
    }

    public void push(int n) {
        if (wskaznik>=a) {
            System.out.println("Nie można juz dodać.");
        } else {
            wskaznik = 0;
            tab[wskaznik] = n;
            wskaznik=wskaznik+1;
        }
    }

    public void pop() {
        if (wskaznik == 0) {
            System.out.println("Stos jest pusty");
        } else {
            System.out.println("Usuń " + tab[wskaznik]);
            wskaznik=wskaznik-1;
        }
    }

}
