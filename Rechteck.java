public class Rechteck {
    private double umfang, flaecheninhalt;
    Rechteck(double seite1, double seite2, double seite3, double seite4){
        this.flaecheninhalt = rechneFlaecheninhalt(seite1, seite2);
        this.umfang = rechneUmfang(seite1, seite2, seite3, seite4);
    }
    Rechteck(double seite1, double seite2, double seite3){
        this.umfang = rechneUmfang(seite1, seite2, seite3);
    }

    public double getUmfang() {
        return umfang;
    }

    public double getFlaecheninhalt() {
        return flaecheninhalt;
    }

    public double rechneFlaecheninhalt(double seite1, double seite2) {
        return seite1*seite2;
    }


    public double rechneUmfang(double seite1, double seite2, double seite3, double seite4) {
        return seite1+seite2+seite3+seite4;
    }



    public double rechneUmfang(double seite1, double seite2, double seite3) {
        return seite1+seite2+seite3;
    }
}
