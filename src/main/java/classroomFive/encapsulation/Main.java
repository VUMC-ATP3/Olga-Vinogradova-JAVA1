package classroomFive.encapsulation;

public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.printWeather();
        weather.metodeTris();


        weather.isRaining = true;
        weather.temperatureAtNight = 15.5;


        Human cilveks = new Human();
        Human cilveksDivi = new Human();
        Human cilveksTris = new Human(12,150.5,"Peteris");

        System.out.println(cilveksTris.toString());
//        int vecums = -3;
//        if(vecums<0){
//
//        }else {
//            cilveksTris.setAge(14);
//        }
        cilveks.setAge(-3);
        System.out.println(cilveksTris.getAge());


        System.out.println(cilveksTris.getName());


        Rinkis rinkis = new Rinkis();
        rinkis.setRadiuss(2.0);

        Rinkis rinkisDivi = new Rinkis(2.0,"Balts");
        rinkisDivi.setKrasa("Zals");


    }


}
