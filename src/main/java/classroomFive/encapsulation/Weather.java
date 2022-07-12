package classroomFive.encapsulation;

public class Weather {

    boolean isRaining; //default - varam pieklut klases un pakotnes limeni
    public boolean isSunShining; // public - varam pieklut visur
    private boolean isSnowing; // private - var pieklut tikai klases ietvaros
    private double temperatureAtDay; // private - var pieklut tikai klases ietvaros
    public double temperatureAtNight;// public - varam pieklut visur

    public void printWeather(){
        System.out.println("Rainy weather");
    }
private void metodeDivi(){
    System.out.println("Private metode");
}

void metodeTris(){
    System.out.println("Default metode");
}

}
