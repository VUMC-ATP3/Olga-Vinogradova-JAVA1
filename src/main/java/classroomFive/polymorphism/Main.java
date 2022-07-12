package classroomFive.polymorphism;

public class Main {
    public static void main(String[] args) {
Calculator calc = new Calculator();
        System.out.println(calc.sum(4,6));
        System.out.println(calc.sum(4.5, 5.4));
        System.out.println(calc.sum(2,5,7));



        Car car = new Car();
        Motorcycle motorcycle =  new Motorcycle();
        car.move();
        motorcycle.move();
        car.stop();
        motorcycle.stop();
    }
}
