public class Test {
    public static void main(String[] args) {
        ShapeCalculator shapeCalculator = new ShapeCalculator();
        Square square = new Square(4);
        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(2, 3, 4);
        Rectangle rectangle = new Rectangle(2, 4);

        System.out.printf("Kwadrat. Powierzchnia: %.3f. Obwód: %.3f. Bok: %.3f\n",
                shapeCalculator.squareArea(square), shapeCalculator.squarePerimeter(square), square.getA());
        System.out.printf("Koło. Powierzchnia: %.3f. Obwód: %.3f. Promień: %.3f\n",
                shapeCalculator.circleArea(circle), shapeCalculator.circleCircumference(circle), circle.getR());
        System.out.printf("Trójkąt. Powierzchnia: %.3f. Obwód: %.3f. Boki: %.3f, %.3f, %.3f\n",
                shapeCalculator.triangleArea(triangle), shapeCalculator.trianglePerimeter(triangle), triangle.getA(), triangle.getB(), triangle.getC());

        System.out.printf("Prostokąt. Powierzchnia: %.3f. Obwód: %.3f. Boki: %.3f, %.3f\n",
                shapeCalculator.rectangleArea(rectangle), shapeCalculator.rectanglePerimeter(rectangle), rectangle.getA(), rectangle.getB());
    }
}
