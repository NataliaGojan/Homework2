public class Lesson7arrayExercise {

    public static void main(String[] args) {

        int [] numbers = {43, 344, 1, 7, 2,11, 11, 18};
        int counter = 0;

        for (int number : numbers) {
            if (number % 2 == 0)   {
                counter++; counter += 1;
                System.out.println (number);

            }
        }

        System.out.println  ("My list has " + counter +  " even numbers");

    }


}
