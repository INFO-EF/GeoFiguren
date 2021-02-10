public class Kreis extends GFigur{

    Kreis(double radius){
        super();
        this.setUmfang(super.round(rechneUmfang(radius)));
        this.setFlaecheninhalt(super.round(rechneFlaecheninhalt(radius)));
    }



    public double rechneFlaecheninhalt(double radius) {
        return 2*radius*Math.PI;
    }

    @Override
    public double rechneFlaecheninhalt(double s1, double s2) {
        return 0;
    }


    public double rechneUmfang(double radius) {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double rechneUmfang(double s1, double s2, double s3, double s4) {
        return 0;
    }

    @Override
    public double rechneUmfang(double s1, double s2, double s3) {
        return 0;
    }
}
