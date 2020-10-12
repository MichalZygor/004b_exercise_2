public class ShapeCalculator {

    // kwadrat
    public double squareArea(Square square){
        square.setArea(square.getA() * square.getA());
        return square.getArea();
    }

    public double squarePerimeter(Square square){
        square.setPerimeter(4 * square.getA());
        return square.getPerimeter();
    }


    // prostokąt
    public double rectangleArea(Rectangle rectangle){
        rectangle.setArea(rectangle.getA() * rectangle.getB());
        return rectangle.getArea();
    }

    public double rectanglePerimeter(Rectangle rectangle){
        rectangle.setPerimeter(2 * rectangle.getA() + 2 * rectangle.getB());
        return rectangle.getPerimeter();
    }

    // koło
    public double  circleArea(Circle circle){
        circle.setArea(Math.PI * Math.pow(circle.getR(), 2));        //P=pi * r^2
        return circle.getArea();
    }

    public double circleCircumference(Circle circle){
        circle.setCircumference(2 * Math.PI * circle.getR());       // L=2 * pi * r
        return circle.getCircumference();
    }

    // trójkąt

    public double  triangleArea(Triangle triangle){
        triangle.setArea(Math.sqrt(triangle.getP() * (triangle.getP() - triangle.getA())
        * (triangle.getP() - triangle.getB()) * (triangle.getP() - triangle.getC())));        //https://www.matemaks.pl/wzory-na-pole-trojkata.html
        return triangle.getArea();
    }

    public double  trianglePerimeter(Triangle triangle){
        triangle.setPerimeter(triangle.getA() + triangle.getB() +triangle.getC());
        return triangle.getPerimeter();
    }

}
