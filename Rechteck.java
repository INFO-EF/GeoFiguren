public class Rechteck {
    private double umfang, flaecheninhalt;
    Rechteck(double seite1, double seite2, double seite3, double seite4){
        this.flaecheninhalt = round(rechneFlaecheninhalt(seite1, seite2));
        this.umfang = round(rechneUmfang(seite1, seite2, seite3, seite4));
    }
    Rechteck(double seite1, double seite2, double seite3){
        this.umfang = round(rechneUmfang(seite1, seite2, seite3));
    }

    private double round(double value) {
        double d = Math.pow(10, 2);
        return Math.round(value * d) / d;
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
