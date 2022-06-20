package classroomFour;

import java.sql.Timestamp;

public class Rinkis {
    final double PI = 3.14; //final - nedriks mainit vertibu
    double radius;
    double laukums;
    double rinkaLinijasGarums;
    Timestamp timestamp;


    Rinkis(){ //konstruktors. kad rakstam "new" tad tiek izsaukts konstruktors. tas ir bezargumenta.
        System.out.println("Mēs vejdojam Rinķi...");
        Long datetime = System.currentTimeMillis();
        timestamp = new Timestamp(datetime);

    }

    Rinkis(double padotaisRadius){ ///parametrizets
        radius = padotaisRadius;
        laukums = aprekinatLaukumu();
        rinkaLinijasGarums = aprekinatRinkaLinijasGarumu();

    }

public void printCreateTime(){
    System.out.println(timestamp);
}

    public double aprekinatLaukumu(){
        System.out.println("Aprekinu rinka laukumu");
        return Math.pow(radius,2)* PI; //(radius*radius) * PI; // Math.pow(radius,2)* Math.PI;
    }

public double aprekinatRinkaLinijasGarumu(){
    System.out.println("Aprekinu rinka linijas garumu");
      return 2 * Math.PI * radius;

}

}
