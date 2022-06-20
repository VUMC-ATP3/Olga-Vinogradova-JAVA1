package homework.classHomework;


public class Trissturis {
    int malaViens;
    int malaDivi;
    int malaTris;
    double laukums;




    Trissturis() {
        System.out.println("Mēs veidojam trisstūri");
    }


    public Trissturis(int malaViens, int malaDivi, int malaTris) {
        this.malaViens = malaViens;
        this.malaDivi = malaDivi;
        this.malaTris = malaTris;
        laukums = aprekinatTrissturaLaukumu();


    }

    public double aprekinatTrissturaLaukumu() {
        double s = (malaViens + malaDivi + malaTris) / 2;
        return Math.sqrt (s * (s - malaViens) * (s - malaDivi) * (s - malaTris));


    }

    public boolean vienadmalu() {

        if ((malaViens == malaDivi) && (malaViens==malaTris))
            return true;
        else return false;
    }
public boolean vienadsanu() {

    if ((malaViens == malaDivi) || (malaViens == malaTris) || (malaDivi == malaTris))
                return true;
            else return false;

}




}


