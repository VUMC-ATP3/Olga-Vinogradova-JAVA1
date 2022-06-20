package classroomThree;

public class Metodes {

    public static void main(String[] args) {
       int b = 9;
        int a = kvadrataLaukums(3);
        float c = taisnsturaLaukums(3,5);
        printetTekstu(kvadrataLaukums(3), taisnsturaLaukums(3,5));
        printetTekstu(a,c);

    }


    static void printetTekstu(int lalala, float bebebe){
        System.out.println("Kvadrata Laukums " + lalala);
        System.out.println("Taisnstura Laukums " + bebebe);
    }
static float taisnsturaLaukums (float a,float b){
        float s = a*b;
        return s;

}


    //metode, kas aprēķina kvadrāta laukumu
    //int - tips ko atgriez
    //kvadrataLaukums - metodes nosaukums
    //int mala - arguments/parametrs
    static int kvadrataLaukums(int mala){
     int laukums = mala * mala;
        return laukums;

    }


}
