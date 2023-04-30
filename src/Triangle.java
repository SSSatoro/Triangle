public class Triangle {
    private double abSide;
    private double bcSide;
    private double caSide;

    public Triangle(double abSide, double bcSide, double caSide) {
        this.abSide = abSide;
        this.bcSide = bcSide;
        this.caSide = caSide;
    }
    public Triangle() {
        super();
    }

    public double calculateArea() {
        double p = (abSide + bcSide + caSide) / 2;
        double area = Math.sqrt(p * (p - abSide) * (p - bcSide) * (p - caSide));
        return area;
    }


    public double getAbSide() {
        return abSide;
    }

    public void setAbSide(double abSide) {
        this.abSide = abSide;
    }

    public double getBcSide() {
        return bcSide;
    }

    public void setBcSide(double bcSide) {
        this.bcSide = bcSide;
    }

    public double getCaSide() {
        return caSide;
    }

    public void setCaSide(double caSide) {
        this.caSide = caSide;
    }

    public String toString() {
        return "Triangle : side AB - " + abSide + ", side BC - " + bcSide + ", side CA - " + caSide;
    }


}

