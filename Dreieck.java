public class Dreieck extends GFigur{

    Dreieck(double seite1, double seite2, double seite3){
        super();
        this.setUmfang(round(rechneUmfang(seite1, seite2, seite3)));
    }





    @Override
    public double rechneFlaecheninhalt(double r) {
        return 0;
    }

    @Override
    public double rechneFlaecheninhalt(double s1, double s2) {
        return 0;
    }

    @Override
    public double rechneUmfang(double r) {
        return 0;
    }

    @Override
    public double rechneUmfang(double s1, double s2, double s3, double s4) {
        return 0;
    }

    @Override
    public double rechneUmfang(double s1, double s2, double s3) {
        return s1+s2+s3;
    }
}
