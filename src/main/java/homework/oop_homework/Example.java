package homework.oop_homework;

import java.util.Date;

public class Example {
    public static void main(String[] args) {

//Premium member type
Customer customerOne = new Customer("Olga");
customerOne.setMember(true);
customerOne.setMemberType("Premium");
Visit visitOne = new Visit(customerOne, new Date());
visitOne.setProductExpense(35.50);
visitOne.setServiceExpense(15.50);
System.out.println("Total expense made by " + visitOne.getName() + " = "
                + visitOne.getTotalExpense() + " EUR");

//Gold member type
Customer customerTwo = new Customer("Ieva");
customerTwo.setMember(true);
customerTwo.setMemberType("Gold");
Visit visitTwo = new Visit(customerTwo,new Date());
visitTwo.setProductExpense(10.00);
visitTwo.setServiceExpense(20.00);
System.out.println("Total expense made by " + visitTwo.getName() + " = "
                + visitTwo.getTotalExpense() + " EUR");

//Silver member type
Customer customerThree = new Customer("Mia");
customerThree.setMember(true);
customerThree.setMemberType("Silver");
Visit visitThree = new Visit(customerThree,new Date());
visitThree.setProductExpense(50.00);
visitThree.setServiceExpense(155.30);
System.out.println("Total expense made by " + visitThree.getName() + " = "
        + visitThree.getTotalExpense() + " EUR");

//Do no have member card
Customer customerFour = new Customer("Madara");
customerFour.setMember(false);
Visit visitFour = new Visit(customerFour,new Date());
visitFour.setProductExpense(35.00);
visitFour.setServiceExpense(78.90);
System.out.println("Total expense made by " + visitFour.getName() + " = "
        + visitFour.getTotalExpense() + " EUR");

    }
}
