public class Kreis {
    private double umfang, flaecheninhalt;
    Kreis(double radius){
        this.flaecheninhalt = rechneFlaecheninhalt(radius);
        this.umfang = rechneUmfang(radius);
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
