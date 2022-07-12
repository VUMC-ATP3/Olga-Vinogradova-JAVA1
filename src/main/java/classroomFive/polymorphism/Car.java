package classroomFive.polymorphism;

public class Car extends Vehicle{
    @Override
    public void move() {
        System.out.println("Car moves with 4 wheels"); //dinamiskais polimorphism
    }
}
