package homework;

public class HomeWork {
    public static void main(String[] args) {
        String valstsNosaukums = "Latvija";
        int iedzivotajuSkaits = 1847434;
        int valstsPlatiba = 64589;
        String valstsGalvaspilseta = "Rīga";
        String valstsValoda = "latviešu valoda";
        boolean esdalibvalsts = true;
        char valuta = '€';

        System.out.println("Valsts: " + valstsNosaukums + "\n" + "Iedzīvotāju skaits: " + iedzivotajuSkaits
        + "\n" + "Platība: " + valstsPlatiba + "\n" + "Galvaspilsēta: " + valstsGalvaspilseta + "\n"
        + "Oficiāla valoda: " + valstsValoda + "\n" + "Vai ir ES dalībvalsts: " + esdalibvalsts + "\n" + "Valūta: " + valuta + "\n");


        int iedzivotajiRiga = 614618;
        System.out.println(valstsNosaukums + " ir viena no Baltijas valstīm. Lielākā Baltijas valstu pilsēta ir " + valstsGalvaspilseta
        + " ar iedzīvotāju skaitu " + iedzivotajiRiga + ". " + valstsGalvaspilseta + " atrodas Baltijas jūras krastā." + "\n");


        int a = 9;
        int b = 3;
        int c = 2;
        int summa = a+b;
        int starpiba = a-b;
        int reizinajums = a * c;
        double dalijums = a / b;

        System.out.println("9+3=" + summa);
        System.out.println("9-3=" + starpiba);
        System.out.println("9*2=" + reizinajums );
        System.out.println("9/3=" + dalijums );

        int rezultats = (a*c*b/c-(a+b)+(a-b))/b;
        System.out.println("(9*2*3/2-(9+3)+(9-3))/3="+rezultats);



int atlikumsviens = 9%2;
int atlikumsdivi = 3%2;
int atlikumstris = 20%6;
        System.out.println("9/2=4 un atlikums " + atlikumsviens);
        System.out.println("3/2=1 un atlikums " + atlikumsdivi);
        System.out.println("20/6=3 un atlikums " + atlikumstris);
    }
}
