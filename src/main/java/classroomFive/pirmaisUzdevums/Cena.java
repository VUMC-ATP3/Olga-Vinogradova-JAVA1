package classroomFive.pirmaisUzdevums;

public class Cena {
   public double amount;
   public char currency;

    public Cena(double amount, char currency) { //constructor
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public String toString() { //generate ->>> to string
//        return "Cena{" +
//                "amount=" + amount +
//                ", currency=" + currency +
//                '}';
        return "Cena:" + amount + currency;

    }
    public void discount (double discount){
        amount = amount - (amount*(discount/100));

    }

}
