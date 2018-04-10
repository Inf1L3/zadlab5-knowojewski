package pl.edu.ur.oopl5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO zad 3, 5, 6
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj numer, 1 dla trzeciego zadania, 2 dla piatego.");
        int a = input.nextInt();

        switch (a) {
            case 1:
                Stos stos = new Stos(100);
                System.out.println("Podaj polecenie: ");
                System.out.println("1: Dodac liczbe");
                System.out.println("2: Usunac liczbe");
                int x = input.nextInt();
                switch (x) {
                    case 1:
                        System.out.println("Podaj liczbe: ");
                        int n = input.nextInt();
                        stos.push(n);
                        break;
                    case 2:
                        stos.pop();
                        break;
                }
                break;

            case 2:
                int n,
                 b;
                Firma firma = new Firma();

                System.out.println("1: Dodawanie");
                System.out.println("2: Wyswietlanie");

                int y;
        y = input.nextInt();
                switch (y) {

                    case 1:
                        System.out.println("Podaj liczbe pracowników: ");
                        int liczba = input.nextInt();
                        for (int i = 0; i < liczba; i++) {
                            firma.pobierz(i);
                        }
                        break;
                    case 2:
                        firma.wypisz();
                        break;
                }
                break;
                }
        
        }
    }
        
        