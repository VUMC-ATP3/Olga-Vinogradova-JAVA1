package classroomFive.pirmaisUzdevums;

public class Author {

    public String name;
    public String email;
    public char gender;

    public Author(String name, String email, char gender) { //constructor
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() { //generate -->>> to string
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
