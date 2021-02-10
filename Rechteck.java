public class Rechteck extends GFigur{

    Rechteck(double seite1, double seite2, double seite3, double seite4){
        this.setFlaecheninhalt(round(rechneFlaecheninhalt(seite1, seite2)));
        this.setUmfang(round(rechneUmfang(seite1, seite2, seite3, seite4)));
    }


    @Override
    public double rechneFlaecheninhalt(double r) {
        return 0;
    }

    public double rechneFlaecheninhalt(double seite1, double seite2) {
        return seite1*seite2;
    }

    @Override
    public double rechneUmfang(double r) {
        return 0;
    }


    public double rechneUmfang(double seite1, double seite2, double seite3, double seite4) {
        return seite1+seite2+seite3+seite4;
    }

    @Override
    public double rechneUmfang(double s1, double s2, double s3) {
        return 0;
    }

}
