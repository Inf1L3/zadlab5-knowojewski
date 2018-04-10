/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.util.Scanner;

/**
 *
 * @author XsaRdaS
 */
public class Firma {

    Pracownik[] pracownicy = new Pracownik[100];

    Scanner sos = new Scanner(System.in);

    public void pobierz(int i) {
        System.out.println("Imię: ");
        pracownicy[i].imie = sos.next();

        System.out.println("Nazwisko: ");
        pracownicy[i].nazwisko = sos.next();

        System.out.println("Stanowisko ");
        pracownicy[i].stanowisko = sos.next();

        System.out.println("Wiek: ");
        pracownicy[i].wiek = sos.nextInt();
        
        pracownicy[i] = new Pracownik(pracownicy[i].imie,pracownicy[i].nazwisko, pracownicy[i].stanowisko, pracownicy[i].wiek );
    }

    public void wypisz() {
        System.out.println("Pracownicy: ");
        for (int i = 0; i < 100; i++) {
            pracownicy[i].show();
        }
    }
}
