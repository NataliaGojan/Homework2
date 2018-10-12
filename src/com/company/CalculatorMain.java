package com.company;

public class CalculatorMain {

    public static void main(String args[]) {

        Calculator calculator = new Calculator();

        /*

       int sumaMea =  calculator.getSum ( 5, -12);  // noi scrim valorile 5, - 12

        System.out.println( "Suma = " + sumaMea);

        System.out.println( "Suma = " +  calculator.getSum(1,1 ));    //putem sa scrim deodata in sout datele a si b

        System.out.println( "Substraction = " + calculator.getSubstraction(1, 100));
        System.out.println ("Multiplication = " + calculator.getMultiplication(5, 10));
        System.out.println("Division =  " + calculator.getDivision(30, 4 ));
        System.out.println (" ");

        //calculam ecuatia:

        Calculator calculator1 = new Calculator();
        double [] solutiaNoastra = calculator.calculeazaDescriminant(2, -5, 3);
        System.out.println(solutiaNoastra [0] + " " + solutiaNoastra [1]);

        Calculator calculator = new Calculator();
        Student ion = calculator.createStudent( "Ion", 20, 1.85);
        Student jora = calculator.createStudent("Jora", 10, 1.85);

        //Cream un animal de companie

        Animal dog = new Animal ();
        dog.name = "Lucky";

        ion.animalDeCompanie = dog;
        jora.animalDeCompanie =dog;

        System.out.println (ion.animalDeCompanie.name);
        ion.animalDeCompanie.name = "Good boy";
        System.out.print(jora.animalDeCompanie.name);
*/


        //afisam rezultatul la metoda getstringform array

        String [] listaMea = {"jora", "ion", "vasile", "dorin"};
     System.out.println( calculator.getStringfromArray(listaMea, 0));
     System.out.println( calculator.getStringfromArray(listaMea, -10));
     System.out.println( calculator.getStringfromArray(listaMea, 10));
     System.out.println( calculator.getStringfromArray(listaMea, 2));

    }

    }
