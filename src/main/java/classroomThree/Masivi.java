package classroomThree;

import java.util.Scanner;

public class Masivi {
        public static void main(String[] args) {
majuParbaude();
                int sakotnejs = 0;
                while (sakotnejs <= 1000) {
                        System.out.println(sakotnejs);
                        // sakotnejs++; <-- sakotnejs = sakotnejs + 1; tikaj int vertibai
                        sakotnejs = sakotnejs + 2; //para skaitli

                }


                String pietura = "Cerntrālā stacija";
                //saraksts/array/masīvs
                String[] stacijas = {"Tornakalns", "Kauguri", "Bulduri", "Dubulti"};
                String[] pieturas = {"Centrālā stacija", "Marijas iela", "Bērnu pasaule", "Ziedoņdārzs"};

                printetTekstaMasivu(stacijas);
                printetTekstaMasivu(pieturas);

                int skaititajs = 0;
                while (skaititajs < 4) {
                        System.out.println(pieturas[skaititajs]);
                        skaititajs = skaititajs + 1;
                }

                int[] majuNumuri = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                int e = 0;
                while (e < 9) {
                        System.out.println("Majas numurs: " + majuNumuri[e]);
                        e = e + 1;
                }

                char[] patskani = {'a', 'e', 'u', 'i'};

                System.out.println(pieturas[0] + pieturas[1] + pieturas[2] + pieturas[3]);
                pieturas[3] = "Zemitanu STACIJA";
                System.out.println(pieturas[0] + pieturas[1] + pieturas[2] + pieturas[3]);

                System.out.println("Cik pieturas ir masīvā? " + pieturas.length);


                String[] hokejaCempioniTopTris = new String[3];
                System.out.println("Cik vietas ir čempionātā? " + hokejaCempioniTopTris.length);
                String pirmaVieta = "Somija";
                String otraVieta = "Kanāda";
                String tresaVieta = "Čehija";
                hokejaCempioniTopTris[0] = pirmaVieta;
                hokejaCempioniTopTris[1] = otraVieta;
                hokejaCempioniTopTris[2] = tresaVieta;

                System.out.println(hokejaCempioniTopTris[0] + "\n" + hokejaCempioniTopTris[1] + "\n" +
                        hokejaCempioniTopTris[2]);

                int i = 0;
                while (i < 5) {
                        //kods kurs izpildas, ja nosacijums ir true
                        System.out.println(i);
                        i = i + 1;

                }
                System.out.println("cikls beidzās");

                int y = 0;
                do{
                    System.out.println("DO WHILE" + y);
                    y=y+1;//y++
                }while(y<10);

                Scanner scanner = new Scanner(System.in);
               String parole = "Parole123";
               String lietotajaIevaditaParole;

               do{
                   System.out.println("Ievadi paroli!");
                  lietotajaIevaditaParole = scanner.nextLine();
                   System.out.println("Notiek paroles pārbaude");
               }while(!lietotajaIevaditaParole.equals(parole)); //rakstam"!" lai pec pareizi ievadita parole programma neprasa velreiz ievadit paroli

            System.out.println("Pareiza parole");

            //likt cilvekam ievadit pozitivo skaitli, ja ievada 0 vai negativs,likt ievadit atkal.
            //ja ir pozitivs , beigt darbu

            int number;
            do {
                System.out.println("Ievadi pozitivo skaitli");
                number = scanner.nextInt();
            }while(number<=0);
            System.out.println("Derigs skaitlis" + number);


            for (int j = 0; j < 5; j++) {
                System.out.println("FOR CIKLS" + j);
            }
            for (int j = 5; j < 11; j++) {
                System.out.println("FOR CIKLS" + j);
            }
            for (int j = 0; j < 10; j=j+2) {
                System.out.println(j);}
            String [] mansMasivss = {"Juris", "Anna", "Peteris", "Jānis"};
            for (int j = 0; j < mansMasivss.length; j++) {
                System.out.println(mansMasivss[j]);}

            String [] xxxxx = {"Juris", "Anna", "Peteris", "Jānis"};
            for (String randomString : xxxxx){
                System.out.println(randomString);
            }
            int [] skaitluMasivs = {3,4,6,7,2,1,5,-4,2,6,4,3,3};
            //atrast masiva pirmo negativo skaitli un izvadit to un ta indexu(poziciju) uz ekrana
for (int j = 0; j < skaitluMasivs.length; j++) {
    if (skaitluMasivs[j] < 0){
    System.out.println("Pirmais negativais skaitlis" + skaitluMasivs[j]);
        System.out.println("Indekss ir: "+ j);
        break;}


    int [] skaitluMasivs2 = {3,4,6,7,2,1,5,-4,2,6,4,3,3};
    for (int l =0; l < skaitluMasivs2.length;l++){
        if(skaitluMasivs2[l]<0){
            continue;
        }
        System.out.println("Vertiba no masiva: " + skaitluMasivs2[l]);
    }
}


            }

        //metode kura izprinte masivu ar stringiem
        static void printetTekstaMasivu(String[] randomMasivs) {
                int skaititajs = 0;
                while (skaititajs < randomMasivs.length) {
                        System.out.println(randomMasivs[skaititajs]);
                        skaititajs = skaititajs + 1;

                }

        }
        static void printetIntegerMasivu(int[] kautKo){
                int i = 0;
                while(i<kautKo.length){
                        System.out.println(kautKo[i]);
                        i++; //i = i + 1;

                }
        }
        static void majuParbaude(){
                int majuNumuri = 1;
                while(majuNumuri<=50){
                        if(majuNumuri%3==0 || majuNumuri%5==0 || majuNumuri == 13){
                        System.out.println("Šie māju numuri neder " + majuNumuri);
                        }
                        else {
                                System.out.println("Šie māju numuri Der " +majuNumuri);
                        }
                        majuNumuri = majuNumuri + 1;
                }
        }
}