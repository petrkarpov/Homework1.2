public class Method {
    //класс main
    public static void main(String[] args) {
        double circleArea = getCircleArea(6);
        System.out.println("площадь круга: " + circleArea);

        double triangleArea = getTriangleArea(0.6, 10, 12);
        System.out.println("площадь треугольника: " + triangleArea);

        int squareArea = getSquareArea(5);
        System.out.println("площадь квадрата: " + squareArea);

    }

    //площадь круга
    public static double getCircleArea(int r) {
        double pi = 3.14;
        double circleArea = pi * (r * r);
        return circleArea;
    }

    //площадь треугольника
    public static double getTriangleArea(double sinC, int a, int b) {
        double triangleArea = 0.5 * a * b * sinC;
        return triangleArea;
    }

    //площадь квадрата
    public static int getSquareArea(int a) {
        int squareArea = a * a;
        return squareArea;
    }
}
