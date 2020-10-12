public class Triangle {
    private double a;
    private double b;
    private double c;
    private double p;
    private double area;
    private double perimeter;

    public Triangle(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);
        setP();
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getP() {
        return p;
    }

    private void setP() {
        this.p = (getA()+getB()+getC())/2;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}
