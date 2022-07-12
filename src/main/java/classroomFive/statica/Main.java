package classroomFive.statica;

public class Main {
    public static void main(String[] args) {
        System.out.println("Cik auto objekti uztajsiti: " +
                Auto.totalCarsCreated);
        Auto masina = new Auto("BMW");
//        System.out.println(masina.klasesNosaukums);
//        System.out.println(masina.marka);

        Auto masinaDivi = new Auto("Mercedes");
//        masina.marka = "Mercedes";
//        System.out.println(masinaDivi.klasesNosaukums);

        System.out.println("Cik auto objekti uztajsiti: " +
                Auto.totalCarsCreated);

        Auto masinaTris = new Auto("Volvo");
        Auto masinaCetri = new Auto("Opel");
        System.out.println("Cik auto objekti uztajsiti: " +
                Auto.totalCarsCreated);
        Auto.printText();
   }
}
