public class Lesson5Homework {
    public static void main(String[] args) {

        //  ******Se dau 3 numere a, b si c, trebuie de afisat numarul maxim

        int a = -10;
        int b = 13;
        int c = 4;

        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println( " Numarul maxim este: " + max);

         //  ***** 2. Se da un numar N, verificati daca numarul este par sau nu, Afisati mesajul corespunzator

        int n = 111;

        if ( n / 2 == 0) {
            System.out.println( "Numarul par");
        }
        else
        {
            System.out.println("Numarul este impar");
        }






    }



}
