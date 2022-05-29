package classroomTwo;

import java.util.Scanner;

public class PracticalTaskTwo {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String name;
//        System.out.println("Ievadi savu vārdu!");
//name = scanner.nextLine();
//        System.out.println("Ievadi savu vecumu");
//        int age = scanner.nextInt();
//
//        System.out.println(String.format ("Esi Sveicināts: %s !",name));
//        System.out.println("Jūsu vecums ir: " + age);

//        System.out.println("Ievadi pirmo skaitli");
//int a = scanner.nextInt();
//        System.out.println("Ievadi otro skaitli");
//        int b = scanner.nextInt();
//        int summa = a + b;
//        System.out.println("Skaitļu summa ir " + summa);
//
//        int a = 5;
//        int b = 10;
//        int c = 5;
//        int d = 11;
//        //lielaks >
//        System.out.println(b > a); //true
//        System.out.println(a > b); //false
//        //mazaks <
//        System.out.println(a < b); //true
//        System.out.println(b < a); //false
//        //vienads ==
//        System.out.println(a == c); //true
//        System.out.println(a == b); //false
//        System.out.println(b == c); //false
//// nav vienads !=
//        System.out.println(a != b); //true
//        System.out.println(a != c); //false
//        //mazaks vienads <=
//        System.out.println(a <= c); //true
//        //lielaks vienads >=
//        System.out.println(b >= d); //false
//
//        int vecums = 18;
//        boolean vaiDrikstBalsot = (vecums >= 18);
//        System.out.println("Vai cilvēks drīkst balsot?" + vaiDrikstBalsot);
//
//
//        String name = "Juris";
//        String secondName = "Jānis";
//
//        boolean vaiVardiSakrīt = (name.equals(secondName));
//        System.out.println("Vai vardi sakrit?" + vaiVardiSakrīt);
//
//        int e = 4;
//
//        boolean vaiIrPatiess = ((e < 5)&&(e < 10));
//        System.out.println(vaiIrPatiess);
//
//        e = 5;
//        vaiIrPatiess = ((e < 5)&&(e < 10));
//        System.out.println(vaiIrPatiess);
//
//
//        vaiIrPatiess = ((e < 5) || (e < 10));
//        System.out.println(vaiIrPatiess);
//
//        e = 5;
//        vaiIrPatiess = (!(e < 5));
//        System.out.println(vaiIrPatiess);
//        System.out.println(!(false==true)); //sagaidam nepatiesibu
//
//
//        int vecumsDivi = 18;
//        if (vecumsDivi >= 18) {
//            System.out.println("Cilvēks drīkst balsot");
//        }
//        else
//        {
//            System.out.println("Cilvēks nedrīkst balsot");
//
//        }
//            System.out.println("Koda turpinājums");
//
//        System.out.println("Ievadi savu vecumu");
//int vecumsTris = scanner.nextInt();
//if(vecumsTris>=18){
//    System.out.println("Cilvēks drīkst balsot");
//}
//else {
//    System.out.println("Cilvēks nedrīkst balsot");
//}
//
//
//
//        System.out.println("Koda turpinājums");
//
//        System.out.println("Ievadi skaitli..");
//        int skaitlisViens = scanner.nextInt();
//        if(skaitlisViens == 10){
//            System.out.println("Printejam skaitlis 10");
//        }
//        else if (skaitlisViens == 15){
//            System.out.println("Printejam skaitlis 15");
//        }
//        else if (skaitlisViens == 20){
//            System.out.println("Printejam skaitlis 20");
//        }
//else {
//            System.out.println("Skaitlis ir nezināms");
//        }
//        System.out.println("Koda turpinājums");

//Janodefine cilveks
        //cilveka vecums
        //cilveka dzimums - v vai s
        //Sieviete drikst doties pensija no 60 gadiem
        //Sieviete drikst doties pensija no 65 gadiem

        int cilvekaVecums = 65;
        char cilvekaDzimums = 'V';
        boolean drikstDotiesPensija = false;

        if (cilvekaVecums >= 65 && cilvekaDzimums == 'V') {
            drikstDotiesPensija = true;
        }
        else if (cilvekaVecums >=60 && cilvekaDzimums == 'S') {
            drikstDotiesPensija = true;
        }

        else if (drikstDotiesPensija){
            System.out.println("Cilveks drikst doties pensija!");}

        System.out.println("Koda turpinājums.");




        int diena = 3;
        String dienasVards;

        switch(diena) {
            case 1:
                dienasVards="Pirmdiena";
                break;
            case 2:
                dienasVards="Otrdiena";
                break;
            case 3:
                dienasVards="Trešdiena";
                break;
            case 4:
                dienasVards="Ceturdiena";
                break;
            case 5:
                dienasVards="Piektdiena";
                break;
            case 6:
                dienasVards="Sestdiena";
                break;
            case 7:
                dienasVards="Svētdiena";
                break;
            default:
                dienasVards="Nezināma diena";}

        System.out.println(dienasVards);

        System.out.println("Ievadi veselu skaitli");
        int skaitlis = scanner.nextInt();
        if (skaitlis > 0){
            System.out.println("Lielaks par 0");
        }
        else {
            System.out.println("Mazaks par 0");}

        int skaitlisJauns = 4;
        if(skaitlisJauns%2==0){
            System.out.println("Skaitlis ir para skaitlis");
        }else{
            System.out.println("Skaitlis ir nepara skaitlis");
        }


    }



}
