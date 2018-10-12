public class Lesson4tHomework {

    public static void main(String[] args) {
        // 3x^2 - 9x = 0

        int a = 3;
        int b = 9;
        int c = 0;

        // delta = b*b - 4 *a * c

        double delta = (b * b) - 4 * a * c;

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println(x1);
        System.out.println(x2);







    }
}

