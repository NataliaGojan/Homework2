package com.company;

import com.company.tekwill.Student;

public class Calculator {

    //calculam suma la 2 numere int, folosim metoda care o inventam getSum

    int getSum (int a, int b) {                         //parametrii se indica prin virgula int a, int b

        int suma = a + b;
        return suma;            // daca scrim return 0 zero, a sa returneze 0 indiferent de ce valori are a si b
    }

        int getSubstraction (int a, int b)   {
        int diff = a - b;
        return diff;
        }

        int getMultiplication (int a, int b)  {
        int multiplicationResult = a * b;
        return multiplicationResult;
       }

        double getDivision (double a, double b) {
        double divisionResult = a/b;
        return  divisionResult;
        }

        // calculam ecuatie de gradul 2


    double[] calculeazaDescriminant( double a, double b, double c) {

        double[] solutie = new double[2];

        double descriminant = (b * b) - 4 * a * c;
        System.out.println(descriminant);

        if (descriminant > 0) {
            solutie[0] = ((-b + Math.sqrt(descriminant)) / (2 * a));
            solutie[1] = ((-b - Math.sqrt(descriminant)) / (2 * a));

        } else {
            if (descriminant == 0) {
                solutie[0] = solutie[1] = -b / (2 * a);
            } else {
                System.out.println("Ecuatia nu are solutii reale");
            }
        }

        return solutie;
    }

    //folosim clasa calculator ca sa cream  un student

    Student createStudent (String name, int age, double height) {

        Student studentToBeReturned = new Student();
          /*
        studentToBeReturned.name = name;
        studentToBeReturned.age = age;
        studentToBeReturned.height = height;

        */

        // name age si height sunt luate din clasa Student

        return studentToBeReturned;
    }

    //calculam o pozitie dintrun array de stringuri:
    //creeam 2 parametri list si x
    //ca sa nu apare erori scrim functiile cu if,else etc:

    String getStringfromArray (String [] list, int x) {

        if (x < list.length && x >= 0) {
            return list [x];
        } else {
            return "NO SOLUTION !!!";
        }

    }




}
