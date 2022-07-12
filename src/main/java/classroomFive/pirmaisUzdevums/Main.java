package classroomFive.pirmaisUzdevums;

import classroomFive.encapsulation.Weather;

public class Main {
    public static void main(String[] args) { //psvm
        Weather weather = new Weather();

       Author JKRowling = new Author("JK Rowling", "JK@gmail.com", 'F');

        Author Rainis = new Author("Jānis Rainis","JR@gmail.com",'M');


        Cena cena = new Cena(9.99, '$'); //1 variants ka aprakstit cenu
        Book bookOne = new Book("Harry Poter",JKRowling, new Cena(15.99,'$')); //2 variants ka aprakstit cenu

        Book bookTwo = new Book("Debesis",Rainis, cena);//1 variants ka aprakstit cenu


        System.out.println(bookOne.toString());
        System.out.println(bookTwo.toString());
        bookTwo.price.discount(30);
        System.out.println(bookTwo.toString());

        System.out.println(bookOne.author.toString());




    }

}
