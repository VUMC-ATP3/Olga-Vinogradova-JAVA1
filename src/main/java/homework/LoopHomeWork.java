package homework;

import java.util.Random;
import java.util.Scanner;

public class LoopHomeWork {
    public static void main(String[] args) {

        //1.uzdevums

        int number;
        int sum = 0;
        do {
            System.out.println("Ievadi veselu skaitli līdz 100");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();
            sum = sum + number;
        } while (sum < 101);
        System.out.println("Gatavs");

        //2.uzdevums

        int a = 5;
        boolean vaiIrPirmskaitlis = (a > 1);
        {

            if (a % 2 == 0 && a != 2) {
                vaiIrPirmskaitlis = false;
                System.out.println("Skaitlis " + a + " ir pirmskaitlis " + vaiIrPirmskaitlis);

            } else if (a % 3 == 0 && a != 3) {
                vaiIrPirmskaitlis = false;
                System.out.println("Skaitlis " + a + " ir pirmskaitlis " + vaiIrPirmskaitlis);

            } else if (a % 5 == 0 && a != 5) {
                vaiIrPirmskaitlis = false;
                System.out.println("Skaitlis " + a + " ir pirmskaitlis " + vaiIrPirmskaitlis);
            } else {
                vaiIrPirmskaitlis = true;
                System.out.println("Skaitlis " + a + " ir pirmskaitlis " + vaiIrPirmskaitlis);

            }

        }

        //3.uzdevums

        int[] datumi = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        String[] menesis = {"Janvāris", "Februāris", "Marts", "Aprīlis", "Maijs", "Jūnijs",
                "Jūlijs", "Augusts", "Septembris", "Octobris", "Novembris", "Decembris"};
        char[] vaditajaKategorija = {'A', 'B', 'C', 'D'};

        int skaititajs = 0;
        while (skaititajs < menesis.length) {
            System.out.println(menesis[skaititajs]);
            skaititajs = skaititajs + 1;

        }

        int y = 0;
        do {
            System.out.println(vaditajaKategorija[y++]);
        }
        while (y < vaditajaKategorija.length);


        for (char aplieciba : vaditajaKategorija) {
            System.out.println(aplieciba);
        }


        for (int j = 0; j < datumi.length; j++) {
            System.out.println(datumi[j]);
        }


        //4.uzdevums

        int[] skaitli = new int[100];
        for (int i = 2; i <= skaitli.length; i++) {
            if (i % 2 == 0)

                System.out.print(i + " " + "\n");


        }

//5.uzdevums

        int c = 4;
        int faktorials = 1;
        for (int d = 1; d <= c; d++) {
            faktorials = faktorials * d;
        }
        {
            System.out.println(faktorials);
        }


//6.uzdevums

        final int parole = 301189;
        int lietotajaIevaditaParole;

        System.out.println("Ievadi paroli!");
        Scanner scannerTwo = new Scanner(System.in);
        int iespejas = 0;
        while (iespejas < 3) {
            lietotajaIevaditaParole = scannerTwo.nextInt();
            iespejas++;
            if (iespejas == 3) {
                System.out.println("Atvainojiet, bet Jūs esat blokēts");
                break;
            }
            if (lietotajaIevaditaParole != parole) {
                System.out.println("Nepareizs PIN, mēģiniet vēlreiz.");
            } else {
                System.out.println("PIN ir pieņemts, laipni lūdzam atpakaļ");
                break;
            }
        }





            }
        }


