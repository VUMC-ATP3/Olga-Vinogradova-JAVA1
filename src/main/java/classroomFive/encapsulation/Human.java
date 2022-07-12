package classroomFive.encapsulation;

public class Human {
    private int age;
    private double height;
    private String name;

Human(){
    System.out.println("Making new Human...");
}

    public Human(int age, double height, String name) { ///lai rakstit vertibas Human cilveksDivi = new Human(12,150.5,"Peteris");
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public int getAge() { //generate -> getter &setter.
        return age;
    }

    public void setAge(int age) {
    if (age < 0){
        System.out.println("Vecums nedrikst but mazaks par 0");
    }
    else {

        this.age = age;
    }}

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {  ....izdzesam lai nemaina vardu
//        this.name = name;
//
//    }

    @Override
    public String toString() { //generate -> to String
        return "Human{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}








