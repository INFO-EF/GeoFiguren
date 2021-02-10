public abstract class GFigur {
    private double umfang, flaecheninhalt;

    public abstract double rechneFlaecheninhalt(double r);

    public abstract double rechneFlaecheninhalt(double s1, double s2);

    public abstract double rechneUmfang(double r);

    public abstract double rechneUmfang(double s1, double s2, double s3, double s4);

    public abstract double rechneUmfang(double s1, double s2, double s3);


    public double getUmfang() {
        return umfang;
    }

    public void setUmfang(double umfang) {
        this.umfang = umfang;
    }

    public double getFlaecheninhalt() {
        return flaecheninhalt;
    }

    public void setFlaecheninhalt(double flaecheninhalt) {
        this.flaecheninhalt = flaecheninhalt;
    }

    public double round(double value) {
        double d = Math.pow(10, 2);
        return Math.round(value * d) / d;
    }
}
