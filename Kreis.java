public class Kreis {
    private double umfang, flaecheninhalt;
    Kreis(double radius){
        this.flaecheninhalt = round(rechneFlaecheninhalt(radius));
        this.umfang = round(rechneUmfang(radius));
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

    public double rechneFlaecheninhalt(double radius) {
        return 2*radius*Math.PI;
    }


    public double rechneUmfang(double radius) {
        return Math.PI*Math.pow(radius, 2);
    }
}
