package classroomFour;

public class Main {
    public static void main(String[] args) {
        House majaViens = new House(4,false,true,"zaļā", "Brīvības iela", 33);
//        majaViens.stavuSkaits = 4;
//        majaViens.majasNumurs = 33;
//        majaViens.ielasNosaukums = "Brīvības iela";
//        majaViens.irLifts = false;
//        majaViens.irAutoStavvieta = true;
//        majaViens.krasa="zaļā";
        majaViens.printHouse();

        House majaDivi = new House(5,false,false, "peleka", "Kurzemes prospekts", 9);
//        majaDivi.stavuSkaits = 5;
//        majaDivi.majasNumurs = 9;
//        majaDivi.ielasNosaukums = "Kurzemes prospekts";
//        majaDivi.irLifts = false;
//        majaDivi.irAutoStavvieta = false;
//        majaDivi.krasa="peleka";
//        majaDivi.printHouse();
//        majaDivi.stavuSkaits=12;
        majaDivi.printHouse();


        Velosipeds zzk = new Velosipeds();
        zzk.bremzuTips = 'D';
        zzk.printetAtrumu();
        System.out.println("Cilveks uzkapj uz velosipeda un min pedalus");
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.spiestPedalus();
        zzk.printetAtrumu();
        System.out.println("Priekšā izlec kaķis. vajag bremzēt");
        zzk.bremzet();
        zzk.bremzet();
        zzk.printetAtrumu();

        Velosipeds merida = new Velosipeds();
        merida.bremzuTips = 'V';
        merida.printetAtrumu();

        Velosipeds vecsVelosipeds = new Velosipeds();
        vecsVelosipeds.bremzuTips = 'S';
        vecsVelosipeds.bremzet();

        Darbinieks ruta= new Darbinieks();
        ruta.vards= "Ruta Jurjane";
        ruta.vecums= 31;
        ruta.alga= 2000;
        System.out.println("Jaunā darbinieka vārds ir "+ ruta.vards+ " , tās alga ir "+ ruta.alga+ " eur nedēļā.");
        ruta.pielikums();
        ruta.pielikums();
        ruta.printAlga();

        Zivs karpa = new Zivs();
        karpa.suga = "Karpa";
        karpa.jurasZivs = false;
        karpa.saldudensZivs = true;
        karpa.svars = 1;
        System.out.println("Zivju suga" + karpa.suga);
        System.out.println("Vai jūras zivs?" + karpa.jurasZivs);
        System.out.println("Vai saldūdens zivs?" + karpa.saldudensZivs);
        System.out.println("Karpa svars ir " + karpa.svars);

        Kompanija displeji = new Kompanija();
        displeji.nosaukums = "Displeji";
        displeji.kompanijasVecums = 20;
        displeji.darbibasJoma = "Multimediju ierīces";
        displeji.atrašnāsVieta = "Rīga";
        displeji.darbiniekuSkaits = 10;

        displeji.printKompanija();

Rinkis mansRinkis = new Rinkis();
        System.out.println(mansRinkis.PI);
mansRinkis.radius = 5;
        System.out.println(mansRinkis.radius);
        System.out.println(mansRinkis.aprekinatLaukumu());

        Rinkis mansRinkis2 = new Rinkis();
        System.out.println(mansRinkis2.PI);
        mansRinkis2.radius = 50;
        System.out.println(mansRinkis2.radius);
        System.out.println(mansRinkis2.aprekinatLaukumu());
        System.out.println(mansRinkis2.aprekinatRinkaLinijasGarumu());
        mansRinkis.printCreateTime();
        mansRinkis2.printCreateTime();
        System.out.println("//////////////////////////");
        Rinkis mansrinkis3=new Rinkis(12.3); //   mansRinkis3.radius = 12.3;
        System.out.println(mansrinkis3.laukums);
        System.out.println(mansrinkis3.rinkaLinijasGarums);
        System.out.println("//////////////////////////");

        Taisnsturis taisnsturisViens=new Taisnsturis(12.4,34.32);

        System.out.println("Taisnstura laukums ir " + taisnsturisViens.aprekinatLaukumu());


        Suns reksis = new Suns();
        reksis.vaiRej = false;
        reksis.name="Dingo";
        System.out.println(reksis.vaiRej);
reksis.astesGarums = 10;
reksis.printName();
reksis.izdodSkanu();
Animal dzivnieks = new Animal();
dzivnieks.name = "Dzivnieks";
dzivnieks.izdodSkanu();

Cat cat = new Cat();
cat.name = "Muris";
cat.printName();
cat.izdodSkanu();



    }

}
