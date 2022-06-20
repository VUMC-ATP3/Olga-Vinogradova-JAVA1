package homework.classHomework;

public class Main {
    public static void main(String[] args) {
        Trissturis trissturisViens = new Trissturis();
        trissturisViens.malaViens = 10;
        trissturisViens.malaDivi = 14;
        trissturisViens.malaTris = 14;
        System.out.println(trissturisViens.vienadmalu());
        System.out.println(trissturisViens.vienadsanu());



        Trissturis trissturisDivi = new Trissturis(19, 16, 33);
        System.out.println(trissturisDivi.laukums);
        System.out.println(trissturisDivi.vienadmalu());
        System.out.println(trissturisDivi.vienadsanu());

    }

    }

