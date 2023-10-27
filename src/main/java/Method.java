public class Method {
    //класс main
    public static void main(String[] args) {
        double scirc = scircle(6);
        System.out.println("площадь круга: " + scirc);

        double stri = striangle(0.6, 10, 12);
        System.out.println("площадь треугольника: " + stri);

        int sque = square(5);
        System.out.println("площадь квадрата: " + sque);

    }

    //площадь круга (с плавающей точкой)
    public static double scircle(int r) {
        double pi = 3.14;
        double scirc = pi * (r * r);
        return scirc;
    }

    //площадь треугольника
    public static double striangle(double sinC, int a, int b) {
        double stri = 0.5 * a * b * sinC;
        return stri;
    }

    public static int square(int a) {
        int sque = a * a;
        return sque;
    }
}
