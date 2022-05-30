package homework;

public class HomeWorkTwo {
    public static void main(String[] args) {
        {
            printBusinessCard();
            printBusinessCardTwo("Matvejs", "Vinogradovs", 27403093, 2000);
            printBusinessCardTwo("Alina", "Butrika", 27408285, 2010);
            int summa = sum(3,9);
            System.out.println(summa);
            double average = average (89260.65, 97698.14, 865.12);
            System.out.println(average);

        }

        //1.uzdevums
        int x = 9;
        System.out.println(x > 0);
        System.out.println(x < 0);
        System.out.println(x > 5 && x <= 10);
        System.out.println(!(x <= 5) && x < 10);
        System.out.println(x == 0 || x == 10);
        int reizinajums = x * x;
        System.out.println(reizinajums > 10);

        //2.uzdevums

        int mēnesis = 11;
        String mēnešaNosaukums;

        switch (mēnesis) {
            case 1:
                mēnešaNosaukums = "Janvāris";
                break;
            case 2:
                mēnešaNosaukums = "Februāris";
                break;
            case 3:
                mēnešaNosaukums = "Marts";
                break;
            case 4:
                mēnešaNosaukums = "Aprīlis";
                break;
            case 5:
                mēnešaNosaukums = "Maijs";
                break;
            case 6:
                mēnešaNosaukums = "Jūnijs";
                break;
            case 7:
                mēnešaNosaukums = "Jūlijs";
                break;
            case 8:
                mēnešaNosaukums = "Augusts";
                break;
            case 9:
                mēnešaNosaukums = "Septembris";
                break;
            case 10:
                mēnešaNosaukums = "Oktobris";
                break;
            case 11:
                mēnešaNosaukums = "Novembris";
                break;
            case 12:
                mēnešaNosaukums = "Decembris";
                break;
            default:
                mēnešaNosaukums = "Nezināma diena";
        }

        System.out.println(mēnešaNosaukums);


        //3.uzdevums

        int a = 3;
        int b = 8;
        int c = 5;

        if (a > b && a > c) {
            System.out.println("Lielākais skaitlis ir " + a);
        } else if (b > a && b > c) {
            System.out.println("Lielākais skaitlis ir " + b);
        } else if (c > a && c > b) {
            System.out.println("Lielākais skaitlis ir " + c);
        }

        //4.uzdevums

        String luksoforaKrasa = "sarkans";

        if (luksoforaKrasa.equals("zaļš")) {
            System.out.println("Gājējiem ir atļauts iet");
        } else if (luksoforaKrasa.equals("dzeltens") || luksoforaKrasa.equals("sarkans")) {
            System.out.println("Gājējiem ir aizliegts iet");
        } else {
            System.out.println("Gājējiem ir nepieciešams parbaudīt vai nebrauc mašina paskatoties uz abam pusem");
        }

        }



    //5.uzdevums
    public static void printBusinessCard() {System.out.println("Vizītkarte" + "\n" + "\n" + "Vārds: Olga" + "\n" + "Uzvārds: Vinogradova" + "\n" +
            "Telefona numurs: +37127603093" + "\n" + "Dzimšanas gads: 1989" + "\n");

        System.out.println("Vizītkarte" + "\n" + "\n" + "Vārds: Olga" + "\n" + "Uzvārds: Vinogradova" + "\n" +
                "Telefona numurs: +37127603093" + "\n" + "Dzimšanas gads: 1989" + "\n");

        System.out.println("Vizītkarte" + "\n" + "\n" + "Vārds: Olga" + "\n" + "Uzvārds: Vinogradova" + "\n" +
                "Telefona numurs: +37127603093" + "\n" + "Dzimšanas gads: 1989" + "\n");
    }

    //6.uzdevums

public static void printBusinessCardTwo(String name, String surname, int telephone, int dateOfBirth){
    System.out.println("Vizītkarte" + "\n"  + "Vārds: " + name + "\n" + "Uzvārds: " + surname + "\n" +
            "Telefona numurs: +371" + telephone + "\n" + "Dzimšanas gads: " + dateOfBirth + "\n");


    }

    //7.uzdevums

    public static int sum (int e, int f){
        int skaitluSumma = e + f;
        return skaitluSumma;

    }

    //8.uzdevums
    public static double average (double skaitlisViens, double skaitlisDivi, double skaitlisTris){
double trisSkaitluSumma = skaitlisViens + skaitlisDivi + skaitlisTris;
        double skaitluAverage = trisSkaitluSumma / 3;
        return skaitluAverage;
    }

}





