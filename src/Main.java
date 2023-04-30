public class Main {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(12.3, 23.2, 17.8);
        Triangle t2 = new Triangle(15.7, 20, 11.5);
        Triangle t3 = new Triangle(8.5, 21.8, 16.2);
        System.out.println("First" + t1.toString());
        System.out.println("Area triangle1 = " + t1.calculateArea());
        System.out.println("Second" + t2.toString());
        System.out.println("Area triangle2 = " + t2.calculateArea());
        System.out.println("Third" + t3.toString());
        System.out.println("Area triangle3 = " + t3.calculateArea());

    }
}